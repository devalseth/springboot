
-- CREATE TABLE `users` (
--     `username` VARCHAR(50) NOT NULL,
--     `password` VARCHAR(50) NOT NULL,
--     `enabled` TINYINT NOT NULL,
--     PRIMARY KEY (`username`)
-- )  ENGINE=INNODB DEFAULT CHARSET=LATIN1;

-- insert into `users` values('john','{noop}test123',1),('mary','{noop}test123',1),('susan','{noop}test123',1);

CREATE TABLE `authorities` (
    `username` VARCHAR(50) NOT NULL,
    `authority` VARCHAR(50) NOT NULL,
    unique key `authorities_idx_1` (`username`,`authority`),
    constraint `authorities_ibfk_1` foreign key(`username`) references `users` (`username`)
)  ENGINE=INNODB DEFAULT CHARSET=LATIN1;

insert into `authorities` values
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('susan','ROLE_EMPLOYEE'),
('susan','ROLE_MANAGER'),
('susan','ROLE_ADMIN');

