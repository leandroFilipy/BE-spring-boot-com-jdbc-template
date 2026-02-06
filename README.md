# 📝 Spring Boot JDBC Template Guide

Welcome to the comprehensive guide for setting up and using a Spring Boot project with JDBC Template! 🚀  
This guide will walk you through the essential steps needed to get your project up and running proficiently.

## 📦 Prerequisites
Before starting, ensure you have the following installed:
- **Java 11+** 
- **Maven** or **Gradle** 
- **Spring Boot**  

## 🚀 Getting Started
### 1. Create a New Spring Boot Project
- Go to [Spring Initializr](https://start.spring.io/)
- Select the following dependencies:
    - **Spring Web**
    - **Spring Data JPA**
    - **H2 Database** (or your preferred database)

### 2. Configure the Application Properties
Add the following properties to your `application.properties` file:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
