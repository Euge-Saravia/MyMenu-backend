# MyMenu

## Overview

This is the backend application for the meal and shopping list management system. It provides APIs to manage meals and shopping lists, including CRUD operations for meals, plates, and products. The backend is built using Spring Boot with REST APIs to interact with the frontend.

## Features 📋

- Meal Management: Create, retrieve, update, and delete meals for specific days and meal types (breakfast, lunch, dinner).

- Plate Assignment: Assign plates to meals for specific days.

- Product Management: Create, retrieve, update, and delete products in a shopping list.

- Meal Querying: Retrieve meals for a specified date range or specific meal type.

- Product Shopping List: Manage a list of products (add, edit, delete, delete all).

## Technologies Used 🛠️

- Spring Boot: For building the backend APIs.

- JPA (Java Persistence API): For interacting with the database.

- PostgreSQL: Database for storing meals, plates, and products.

- Maven: For dependency management and building the project.

## Installation Guide 🔧

1. Clone this repository

2. Set up PostgreSQL:
- Create a PostgreSQL database.
- Configure database credentials in application.properties:
`````
spring.datasource.url=jdbc:postgresql://localhost:5432/mydatabase
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update
`````
3. Run the application

## API endpoints

**Meal Management**
- GET /menus?starDate={startDate}&enDate={endDate}: Retrieve all meals within a date range.
- POST /menus: Create a new meal.
- GET /menu?date={date}&mealType={mealType}: Retrieve a meal by date and meal type.
- DELETE /menu/{id}: Delete a specific meal by ID.
**Product Shopping List**
- GET /products: Retrieve all products.
- POST /products: Add a new product.
- PUT /products/{id}: Update a specific product by ID.
- DELETE /products/{id}: Delete a specific product by ID.
- DELETE /deleteAll: Delete all products.

## Folder Structure

- models: Java entities representing the data structure (Menu, Meal, Plate).
- repositories: JPA repositories for database access.
- services: Business logic for managing meals, menus, and plates.
- controllers: REST API controllers for handling HTTP requests.
    
## Contribution

Contributions are welcome! To get started:
1. Fork the repository.
2. Create a new feature branch
```
(git checkout -b feature/my-new-feature).
```
3. Commit your changes 
````
(git commit -am 'Add new feature').
````
4. Push to the branch 
````
(git push origin feature/my-new-feature).
````
5. Create a pull request.

## Author ✒️

- [**Eugenia**](https://github.com/Euge-Saravia)


 ## Frontend Integration

For the frontend setup and more details, refer to the Frontend [README](https://github.com/Euge-Saravia/MyMenu-frontend).