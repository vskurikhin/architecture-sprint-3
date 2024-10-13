CREATE TABLE "devices" (
  "id" varchar PRIMARY KEY,
  "house_id" uuid,
  "device_type" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "telemetry_data" (
  "id" uuid PRIMARY KEY,
  "device_id" varchar,
  "data_type" varchar,
  "data" varchar,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "telemetry_data_types" (
  "name" varchar PRIMARY KEY,
  "deleted" bool,
  "created_at" timestamp,
  "updated_at" timestamp
);

COMMENT ON COLUMN "devices"."id" IS 'International Securities Identification Numbers';

COMMENT ON COLUMN "telemetry_data_types"."name" IS 'Type of asset, example bonds, stocks, funds ... etc';

ALTER TABLE "telemetry_data" ADD FOREIGN KEY ("device_id") REFERENCES "devices" ("id");

ALTER TABLE "telemetry_data" ADD FOREIGN KEY ("data_type") REFERENCES "telemetry_data_types" ("name");
