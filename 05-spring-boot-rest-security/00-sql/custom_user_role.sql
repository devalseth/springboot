drop table if exists `roles`;

drop table if exists `members`;

-- create table for members
CREATE TABLE `members` (
    `user_id` VARCHAR(50) NOT NULL,
    `pw` CHAR(68) NOT NULL,
    `active` TINYINT NOT NULL,
    PRIMARY KEY (`user_id`)
)  ENGINE=INNODB DEFAULT CHARSET=LATIN1;

-- insert data into members table

insert into `members` values
('john','{bcrypt}$2a$10$P7vA/o9gAZqMISuqmPVBi.ywQuhJxSEN.DsNsXVm9OdfVIh98ec8i',1),
('mary','{bcrypt}$2a$10$JjdxjUQZlXpondEGGnRFRuQlttbnrlcHPx3kW5hmQXDETOyyys7zC',1),
('susan','{bcrypt}$2a$10$5m50B1lPiOuuOzTqEgwFFeiYdoRjA.0vvNVSmJvLa7nJGfEO1otNm',1);

-- create roles table here

CREATE TABLE `roles` (
    `user_id` VARCHAR(50) NOT NULL,
    `role` VARCHAR(50) NOT NULL,
    UNIQUE KEY `authorities5_idx_122` (`user_id` , `role`),
    CONSTRAINT `authorities5_ibfk_122` FOREIGN KEY (`user_id`)
        REFERENCES `members` (`user_id`)
)  ENGINE=INNODB DEFAULT CHARSET=LATIN1;

-- insert into roles table

insert into `roles` values
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('susuan','ROLE_EMPLOYEE'),
('susuan','ROLE_MANAGER'),
('susuan','ROLE_ADMIN');