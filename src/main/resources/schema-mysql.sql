CREATE TABLE IF NOT EXISTS user
(
  id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name varchar(32) NOT NULL,
  email varchar(45) NOT NULL
);