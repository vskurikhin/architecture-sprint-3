CREATE TABLE "users" (
  "id" varchar PRIMARY KEY,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "login" (
  "id" varchar PRIMARY KEY,
  "login" varchar,
  "password" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "roles" (
  "id" varchar PRIMARY KEY,
  "login_id" varchar,
  "name" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

COMMENT ON COLUMN "users"."id" IS 'User primary key';

COMMENT ON COLUMN "login"."id" IS 'User primary key';

COMMENT ON COLUMN "roles"."id" IS 'User primary key';

ALTER TABLE "login" ADD FOREIGN KEY ("id") REFERENCES "users" ("id");

ALTER TABLE "roles" ADD FOREIGN KEY ("login_id") REFERENCES "login" ("id");
