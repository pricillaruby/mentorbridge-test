# Bank Application Management

# Description
This is an Spring Boot Application for an Banking Application.In this application , I have done four process:
  1. Account Creation
  2. Deposit Amount
  3. Withdraw Amount
  4. Fetch All Account from the bank
For Account Creation => Account Number , Account Holder Name , Balance Amount , Mobile Number and Account Type was created . And Get deposit amount from account holder and update the balance .Then , get withdraw amount from the account holder and update the balance.

# Flow of Banking Application
<img width="677" height="451" alt="image" src="https://github.com/user-attachments/assets/28589ab5-44c4-4bcb-8d1d-ae53e9c45561" />

# Technology used
- Java 21
- Spring Boot
- Spring Data Jpa
- PostgreSQL
- Swagger for API Documentation
- Maven
- Postman

# DataBase Used and its Configuration

PostgreSQL is used for the Student CRUD API for ABCD College.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/{databasename}
spring.datasource.username=[username]
spring.datasource.password=[password]
spring.datasource.driver-class-name = org.postgresql.Driver
```

# API Endpoint
- POST http://localhost:8080/api/bank/account
- GET http://localhost:8080/api/bank/account
- PUT http://localhost:8080/api/bank/account/{accountNumber}
- GET http://localhost:8080/api/bank/account/{accountNumber}

# Project Structure
```
src/main/java
  config
  mapper
  controller
  entity
  service
  repository
src/main/resources
  application.properties
  swagger.yaml
```

# Functionality

- Create Account: Add a new account using POST method.
- Get all Accounts : Fetch all the account from the database using GET method.
- Deposit Amount: Check Account Number in the number . If it exists, add the amount with balance. If not exists ,send account number not found.
- Withdraw Amount: Check Account Number in the number . If it exists, subtract the amount with balance. If not exists ,send account number not found.
