CREATE TABLE "device_types" (
  "name" varchar PRIMARY KEY,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "devices" (
  "id" varchar PRIMARY KEY,
  "house_id" uuid,
  "device_type" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "device_settings" (
  "id" varchar PRIMARY KEY,
  "device_id" varchar,
  "setting" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "users" (
  "id" varchar PRIMARY KEY,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "house" (
  "id" uuid PRIMARY KEY,
  "device_id" varchar,
  "user_id" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE UNIQUE INDEX ON "house" ("device_id", "user_id");

COMMENT ON COLUMN "device_types"."name" IS 'Type of asset, example bonds, stocks, funds ... etc';

COMMENT ON COLUMN "devices"."id" IS 'International Securities Identification Numbers';

COMMENT ON COLUMN "device_settings"."id" IS 'International Securities Identification Numbers';

COMMENT ON COLUMN "users"."id" IS 'User primary key';

ALTER TABLE "house" ADD FOREIGN KEY ("user_id") REFERENCES "users" ("id");

ALTER TABLE "devices" ADD FOREIGN KEY ("house_id") REFERENCES "house" ("id");

ALTER TABLE "devices" ADD FOREIGN KEY ("device_type") REFERENCES "device_types" ("name");

ALTER TABLE "device_settings" ADD FOREIGN KEY ("device_id") REFERENCES "devices" ("id");
