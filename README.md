
# Employee Onboaring API for Company

# Description
This is an Spring Boot Application for an Company. In this application, I have created an POST and GET operation for adding employee details and get all employees. The Employee Details contains name and age. First I have created Swagger Documentation , then Creating an Spring Boot Application where I have created Controller,Service , Entity and Repository layer and then I have implemented the swagger into the project.Then Start writing the business logic and connect with database and Run the Project . This is how the employee was created.

# Flow of Application

<img width="818" height="349" alt="image" src="https://github.com/user-attachments/assets/e88a4393-434b-4d67-ab7d-2b4a460520ef" />

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
- POST http://localhost:8080/api/employee
- GET http://localhost:8080/api/employee

# Functionality

- Create: Add new employee into the database. Employee details are name and age.
- Fetch Employee: Retreive all employees from the database.

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




