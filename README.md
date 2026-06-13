# PayFlow API

A simple payment application built using Spring Boot, Spring Data JPA, and H2 Database.

## Features

- Create Users
- Manage User Information
- Process Transactions
- Store Transaction History
- REST API Development using Spring Boot

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```
src/main/java/com/payflow
├── controller
├── entity
├── repository
├── service
└── PayflowApiApplication.java
```

## Database

H2 In-Memory Database

H2 Console:
```
http://localhost:8080/h2-console
```

JDBC URL:
```
jdbc:h2:mem:payflowdb
```

Username:
```
sa
```

Password:
```
(blank)
```

## Run the Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

## Author

Swarupa Deshpande
