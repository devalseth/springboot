create database if not exists `student_tracker`;
use `student_tracker`;

drop table if exists `student`;

create table `student` ( 
		`id` int not null auto_increment,
        `first_name` varchar(45) default null,
        `last_name` varchar(45) default null,
        `email_id` varchar(45) default null,
        primary key (id)
        );
					