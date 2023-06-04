-- Drop user if they exists
DROP user if exists 'springstudent'@'localhost';

-- Now Create user with prop privileges
create user 'springstudent'@'localhost' identified by 'springstudent';

grant all privileges on *.* to 'springstudent'@'localhost';