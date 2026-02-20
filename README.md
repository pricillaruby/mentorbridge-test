
# Student CRUD API for ABCD College

# Description
This is an Spring Boot Application for an ABCD College. In this application, I have created an POST operation for adding student details. The Student Details contains name , age and department. First I have created Swagger Documentation , then Creating an Spring Boot Application where I have created Controller,Service , Entity and Repository layer and then I have implemented the swagger into the project.Then Start writing the business logic and connect with database and Run the Project . This is how the student was created.

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
POST http://localhost:8080/api/student

# Project Structure
```
src/main/java
  controller
  entity
  service
  repository
src/main/resources
  application.properties
  swagger.yaml
```

# Functionality

Create: Add new student into the database. Student details are name ,age and department
