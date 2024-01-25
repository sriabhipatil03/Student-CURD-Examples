CREATE SCHEMA sample ;
use sample;
CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    branch varchar(50) NOT NULL,
    age INT NOT NULL  );