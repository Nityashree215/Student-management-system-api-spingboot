# Student Management API (Spring Boot)
A clean and scalable **Spring Boot REST API** that implements full CRUD operations for managing students.  
This project demonstrates **backend development fundamentals**, proper **layered architecture (Controller + Service + Model)**, and **JSON-based RESTful communication**.
##  Highlights
- RESTful API design using Spring Boot
- Full CRUD operations: Create, Read, Update, Delete
- Clean separation of concerns (Controller, Service, Model)
- JSON request/response handling
- In-memory data storage (no database, focused on core backend logic)
- Tested using Thunder Client / Postman
##  Tech Stack
- Java
- Spring Boot
- Maven
- REST APIs
- JSON
##  Architecture
- Controller Layer: Handles HTTP requests and responses  
- Service Layer: Contains business logic and in-memory data handling  
- Model Layer: Represents the Student entity  
This structure follows real-world backend design practices.
## How to Run
1. Open the project folder (the one containing `pom.xml`).
2. Run the application using:.\mvnw spring-boot:run
3. The server will start at:http://localhost:8080/
## API Endpoints
- **POST** `/students` → Add a student  
- **GET** `/students` → Get all students  
- **GET** `/students/{id}` → Get student by ID  
- **PUT** `/students/{id}` → Update student  
- **DELETE** `/students/{id}` → Delete student  
## What This Project Demonstrates
- Building REST APIs with Spring Boot
- Designing layered backend architecture
- Handling HTTP methods (GET, POST, PUT, DELETE)
- Working with JSON and request mapping
- Writing clean, maintainable backend code
## Future Enhancements
- Database integration (MySQL / PostgreSQL)
- Input validation and exception handling
- Authentication and authorization
- Pagination and sorting
## 👩‍💻 Author
Nityashree
This project is a part of my backend learning journey and showcases my ability to design and implement a structured Java Spring Boot REST API.
