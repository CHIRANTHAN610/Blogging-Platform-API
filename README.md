# Blogging Platform API

A RESTful Blogging Platform API developed using **Java, Spring Boot, Spring Data JPA, and MySQL**. This project allows users to create, retrieve, update, delete, and search blog posts through RESTful endpoints.

This project is based on the [Blogging Platform API challenge](https://roadmap.sh/projects/blogging-platform-api) from roadmap.sh.

## 🚀 Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA / Hibernate
- **Build Tool:** Maven
- **API Testing:** Postman
- **Version Control:** Git & GitHub

## ✨ Features

- Create a new blog post.
- Retrieve all blog posts.
- Retrieve a specific blog post using its ID.
- Update an existing blog post.
- Delete a blog post.
- Search blog posts by title, content, or category.
- Database integration using Spring Data JPA.
- RESTful API design with appropriate HTTP methods and status codes.

## 📁 Project Structure

```text
Blogging-Platform-API/
│
├── bloggingApi/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/chiranthan/bloggingApi/
│   │   │   │       ├── BloggingApiApplication.java
│   │   │   │       ├── BloggingApiController.java
│   │   │   │       ├── BloggingApiService.java
│   │   │   │       ├── entity/
│   │   │   │       ├── repository/
│   │   │   │       └── exception/
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   │
│   │   └── test/
│   │
│   └── pom.xml
│
└── README.md
```

## ⚙️ Getting Started

### Prerequisites

Make sure you have installed:

- Java 21 or later
- Maven
- MySQL
- Postman
- Git

### 1. Clone the Repository

```bash
git clone https://github.com/CHIRANTHAN610/Blogging-Platform-API.git
```

### 2. Navigate to the Project

```bash
cd Blogging-Platform-API/bloggingApi
```

### 3. Configure MySQL

Create a database:

```sql
CREATE DATABASE blogging_platform;
```

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blogging_platform
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Replace `YOUR_PASSWORD` with your MySQL password.

### 4. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

The application will start at:

```text
http://localhost:8080
```

## 📌 API Endpoints

Base URL:

```text
http://localhost:8080
```

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/posts` | Create a new blog post |
| GET | `/posts` | Retrieve all blog posts |
| GET | `/posts/{id}` | Retrieve a blog post by ID |
| PUT | `/posts/{id}` | Update an existing blog post |
| DELETE | `/posts/{id}` | Delete a blog post |
| GET | `/posts?term=tech` | Search blog posts |

## 📝 API Request Examples

### 1. Create a Blog Post

**POST** `/posts`

Request Body:

```json
{
    "title": "Getting Started with Spring Boot",
    "content": "Spring Boot simplifies Java backend development.",
    "category": "Technology",
    "tags": ["Java", "Spring Boot", "Backend"]
}
```

Expected Status: `201 Created`

### 2. Get All Blog Posts

**GET** `/posts`

Expected Status: `200 OK`

### 3. Get Blog Post by ID

**GET** `/posts/1`

Expected Status: `200 OK`

### 4. Update a Blog Post

**PUT** `/posts/1`

Request Body:

```json
{
    "title": "Advanced Spring Boot",
    "content": "Learning Spring Boot REST API development.",
    "category": "Programming",
    "tags": ["Java", "Spring Boot"]
}
```

Expected Status: `200 OK`

### 5. Delete a Blog Post

**DELETE** `/posts/1`

Expected Status: `204 No Content`

### 6. Search Blog Posts

**GET** `/posts?term=technology`

Search should match the supplied term against the title, content, or category.

Expected Status: `200 OK`

## 📊 HTTP Status Codes

| Status Code | Description |
|---|---|
| 200 | Request successful |
| 201 | Resource created successfully |
| 204 | Resource deleted successfully |
| 400 | Bad request / Validation error |
| 404 | Resource not found |
| 500 | Internal server error |

## 🧪 Testing

The API can be tested using Postman.

Test the following operations:

- Create a blog post.
- Retrieve all blog posts.
- Retrieve a blog post using its ID.
- Update an existing blog post.
- Delete a blog post.
- Search blog posts using a keyword.
- Test invalid requests and missing resources.

## 🎯 Learning Objectives

Through this project, I aim to strengthen my understanding of:

- REST API development using Spring Boot.
- HTTP methods and status codes.
- CRUD operations.
- Spring Data JPA and Hibernate.
- MySQL database integration.
- Controller-Service-Repository architecture.
- API testing using Postman.
- Exception handling and request validation.

## 👨‍💻 Author

**Chiranthan B M**

GitHub: [CHIRANTHAN610](https://github.com/CHIRANTHAN610)

## 📚 Project Reference

[roadmap.sh – Blogging Platform API](https://roadmap.sh/projects/blogging-platform-api)
