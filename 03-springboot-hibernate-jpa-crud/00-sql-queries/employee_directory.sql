create database if not exists `employee_directory`;

use `employee_directory`;

drop table if exists `employee`;

create table `employee`(
`id` int not null auto_increment,
`first_name` varchar(45) default null,
`last_name` varchar(45) default null,
`email` varchar(45) default null,
primary key(`id`)
) engine=InnoDB auto_increment=1 default charset=latin1;

insert into `employee` values
	(1,'Deval','Seth','deval@gmail.com'),
    (2,'hardik','khaira','hardik@gmail.com'),
    (3,'shivani','Seth','shivani@gmail.com'),
    (4,'Somel','Gupta','Somel@gmail.com'),
    (5,'Rishi','Varsaiya','Rishi@gmail.com');