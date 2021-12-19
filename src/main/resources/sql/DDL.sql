CREATE SCHEMA IF NOT EXISTS `ls_test_db`;

DROP TABLE IF EXISTS `company`;

CREATE TABLE IF NOT EXISTS `company`
(
    `id`               varchar(36) PRIMARY KEY,
    `origin_timestamp` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_timestamp` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `name`             varchar(128) NOT NULL UNIQUE
)