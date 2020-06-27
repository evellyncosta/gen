FROM mysql:latest
WORKDIR /

RUN service mysqld start
RUN mysql -u root -p 
RUN use mysql;
RUN select host, user from user;
RUN ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '123456';
RUN FLUSH PRIVILEGES;


EXPOSE 3306

