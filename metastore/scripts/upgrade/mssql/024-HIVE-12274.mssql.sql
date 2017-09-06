ALTER TABLE "SERDE_PARAMS" ALTER COLUMN "PARAM_VALUE" VARCHAR(MAX);
ALTER TABLE "TABLE_PARAMS" ALTER COLUMN "PARAM_VALUE" VARCHAR(MAX);
ALTER TABLE "SD_PARAMS" ALTER COLUMN "PARAM_VALUE" VARCHAR(MAX);
ALTER TABLE "COLUMNS_V2" ALTER COLUMN "TYPE_NAME" VARCHAR(MAX);

ALTER TABLE "TBLS" ALTER COLUMN "TBL_NAME" nvarchar(256);
ALTER TABLE "NOTIFICATION_LOG" ALTER COLUMN "TBL_NAME" nvarchar(256);
ALTER TABLE "PARTITION_EVENTS" ALTER COLUMN "TBL_NAME" nvarchar(256);
ALTER TABLE "TAB_COL_STATS" ALTER COLUMN "TABLE_NAME" nvarchar(256);
ALTER TABLE "PART_COL_STATS" ALTER COLUMN "TABLE_NAME" nvarchar(256);
ALTER TABLE "COMPLETED_TXN_COMPONENTS" ALTER COLUMN "CTC_TABLE" varchar(256);

ALTER TABLE "COLUMNS_V2" ALTER COLUMN "COLUMN_NAME" nvarchar(767) NOT NULL;
ALTER TABLE "PART_COL_PRIVS" ALTER COLUMN "COLUMN_NAME" nvarchar(767) DEFAULT NULL;
ALTER TABLE "TBL_COL_PRIVS" ALTER COLUMN "COLUMN_NAME" nvarchar(767) DEFAULT NULL;
ALTER TABLE "SORT_COLS" ALTER COLUMN "COLUMN_NAME" nvarchar(767) DEFAULT NULL;
ALTER TABLE "TAB_COL_STATS" ALTER COLUMN "COLUMN_NAME" nvarchar(767) NOT NULL;
ALTER TABLE "PART_COL_STATS" ALTER COLUMN "COLUMN_NAME" nvarchar(767) NOT NULL;