--liquibase formatted sql

--changeset akaredsc2@gmail.com:00
CREATE TABLE CR_MODEL (
     ID BIGINT NOT NULL,
     NAME VARCHAR(50) NOT NULL,
     HORSE_POWERS INTEGER NOT NULL,
     SEATS INTEGER NOT NULL,
     DOORS INTEGER NOT NULL
);

--changeset akaredsc2@gmail.com:01
CREATE TABLE CR_LOCATION (
    ID BIGINT NOT NULL,
    COUNTRY VARCHAR(50) NOT NULL,
    REGION VARCHAR(50) DEFAULT NULL,
    CITY VARCHAR(50) NOT NULL,
    ADDRESS VARCHAR(50) NOT NULL,
    POSTAL_CODE VARCHAR(50) NOT NULL
);

--changeset akaredsc2@gmail.com:02
CREATE TABLE CR_CAR (
    ID BIGINT NOT NULL,
    MODEL_ID BIGINT NOT NULL,
    COLOR VARCHAR(30) DEFAULT NULL,
    LICENSE_PLATE VARCHAR(30) NOT NULL,
    PRICE_PER_DAY DECIMAL DEFAULT NULL,
    STATUS VARCHAR(30) NOT NULL,
    LOCATION_ID BIGINT NOT NULL
);

--changeset akaredsc2@gmail.com:03
CREATE TABLE CR_RESERVATION (
    ID BIGINT NOT NULL,
    CAR_ID BIGINT NOT NULL,
    PICK_UP_DATE DATE NOT NULL,
    DROP_OFF_DATE DATE NOT NULL,
    LOCATION_ID BIGINT NOT NULL,
    STATUS VARCHAR(30) NOT NULL
);

--changeset akaredsc2@gmail.com:04
ALTER TABLE CR_MODEL ADD CONSTRAINT CR_MODEL_PK PRIMARY KEY(ID);

--changeset akaredsc2@gmail.com:05
ALTER TABLE CR_LOCATION ADD CONSTRAINT CR_LOCATION_PK PRIMARY KEY(ID);

--changeset akaredsc2@gmail.com:06
ALTER TABLE CR_CAR ADD CONSTRAINT CR_CAR_PK PRIMARY KEY(ID);

--changeset akaredsc2@gmail.com:07
ALTER TABLE CR_CAR ADD CONSTRAINT CR_CAR_LOCATION_PK FOREIGN KEY (LOCATION_ID) REFERENCES CR_LOCATION(ID);

--changeset akaredsc2@gmail.com:08
ALTER TABLE CR_RESERVATION ADD CONSTRAINT CR_RESERVATION_PK PRIMARY KEY(ID);

--changeset akaredsc2@gmail.com:09
ALTER TABLE CR_RESERVATION ADD CONSTRAINT CR_RESERVATION_CAR_PK FOREIGN KEY (CAR_ID) REFERENCES CR_CAR(ID);

--changeset akaredsc2@gmail.com:10
ALTER TABLE CR_RESERVATION ADD CONSTRAINT CR_RESERVATION_LOCATION_PK FOREIGN KEY (LOCATION_ID) REFERENCES CR_LOCATION(ID);

