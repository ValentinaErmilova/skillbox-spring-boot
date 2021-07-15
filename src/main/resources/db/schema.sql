DROP TABLE IF EXISTS books;

CREATE TABLE books
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    author       VARCHAR(250) NOT NULL,
    title        VARCHAR(250) NOT NULL,
    priceOld     VARCHAR(250) DEFAULT NULL,
    price        VARCHAR(250) DEFAULT NULL,
    isNew        BIT(1) NOT NULL DEFAULT FALSE,
    isPopular    BIT(1) NOT NULL DEFAULT FALSE,
    isRecomended BIT(1) NOT NULL DEFAULT FALSE,
    isCart BIT(1) NOT NULL DEFAULT FALSE,
    isKept BIT(1) NOT NULL DEFAULT FALSE
);

create table authors
(
    id         INT,
    first_name VARCHAR(50),
    last_name  VARCHAR(50)
);