
create database a default charset utf8 COLLATE utf8_general_ci;


create table t_system_users (
id int primary key auto_increment,
username varchar(250),
password varchar(250),
create_date datetime
)



