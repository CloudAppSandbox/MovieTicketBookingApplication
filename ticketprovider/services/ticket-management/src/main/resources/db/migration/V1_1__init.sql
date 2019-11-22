-----------------------------------------------------------------------------------------------------------------
-- Tables
-----------------------------------------------------------------------------------------------------------------

CREATE TABLE Cinema (
  id        TEXT PRIMARY KEY,
  name      TEXT,
  city      TEXT,
  street    TEXT
);

CREATE TABLE Movie (
   id TEXT PRIMARY KEY,
   name TEXT,
   url TEXT,
   imbdRating FLOAT,
   durationInMinutes INT
);

CREATE TABLE Screen (
  id        TEXT PRIMARY KEY
);

CREATE TABLE TimeSlot (
  id        TEXT PRIMARY KEY,
  startTime BIGINT,
  endTime   BIGINT
);

CREATE TABLE Seat (
  id            TEXT PRIMARY KEY,
  available     BOOLEAN,
  category      TEXT
);


CREATE TABLE QRCode (
  id        TEXT PRIMARY KEY
);

CREATE TABLE relationships (
  name                  TEXT,
  sourceEntity          TEXT,
  sourceEntityId        TEXT,
  targetEntity          TEXT,
  targetEntityId        TEXT
  );

CREATE TABLE Ticket (
  id           TEXT PRIMARY KEY,
  qrCode       TEXT
 );