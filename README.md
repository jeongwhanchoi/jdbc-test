# JDBC Connection Test

## MySQL Install

- Download [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)

![mysql_community_server_download](./img/mysql_community_server_download.png)

- Check the MySQL Server activated

![mysql_activate](./img/mysql_activate.png)

## JDBC Driver for MySQL

- Download [JDBC Connector Driver](https://dev.mysql.com/downloads/connector/j/)

![jdbc_connector_download](./img/jdbc_connector_download.png)

- Click **Edit...** button the below image to add `mysql-connect-java-8.0.11.jar` in the system library

![jdbc_driver](./img/jdbc_driver.png)

- Add the jar file via the  **Add External JARs...** button

![jdbc_driver2](./img/jdbc_driver2.png)

## Connection Test

- Source Code for JDBC Connection Test
  - https://github.com/jeongwhanchoi/jdbc-test/blob/master/src/jdbcTest/jdbcTest.java
- MySQL Login

```shell
cd /usr/local/mysql/bin

./mysql -u root -p
```

![mysqlterminal](./img/mysqlterminal.png)

- Create MySQL Database
  - `create database demo;`
    - Create **demo** database
  - `show databases;`
    - Check databases

![showdatabases](./img/showdatabases.png)

### JDBC Connecion Success

![jdbc_test_success](./img/jdbc_test_success.png)

---

## Breakthrough

 - KST Error
     - `serverTimeszone=Asia/Seoul`
   - SSL connection Error
     - https://stackoverflow.com/questions/34189756/warning-about-ssl-connection-when-connecting-to-mysql-database

  