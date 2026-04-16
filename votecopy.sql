-- SQL script to create the missing votecopy table
CREATE TABLE votecopy (
    username VARCHAR(255) NOT NULL,
    currhash VARCHAR(255),
    date DATE,
    prevhash VARCHAR(255),
    PRIMARY KEY (username)
);
