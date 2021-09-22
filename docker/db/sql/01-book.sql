create table books
(
    id         bigint unsigned auto_increment
        primary key,
    isbn_code  varchar(30)  null,
    name       varchar(300) not null,
    image_path varchar(300) null,
    link       varchar(300) null
);
