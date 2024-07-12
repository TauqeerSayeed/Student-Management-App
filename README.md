# Student Management App

Welcome to the Student Management App! This application provides a backend for managing students and teachers, allowing you to perform various operations such as adding, retrieving, and associating students and teachers.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [API Endpoints](#api-endpoints)
  - [Student Endpoints](#student-endpoints)
  - [Teacher Endpoints](#teacher-endpoints)
  - [Student-Teacher Association Endpoints](#student-teacher-association-endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Student Management App is a RESTful web service built with Spring Boot. It allows for efficient management of student and teacher data, including adding new entries, retrieving existing data, and creating associations between students and teachers. The application uses a HashMap as an in-memory database to store data.

## Features

- Add and retrieve student information
- Add and retrieve teacher information
- Create associations between students and teachers
- Retrieve students associated with a specific teacher

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Postman (for API testing)

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- JDK 11 or later
- Maven
- IntelliJ IDEA
- Postman (optional, for API testing)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/TauqeerSayeed/Student-Management-App.git
   ```

2. Open IntelliJ IDEA.

3. Click on `File` -> `Open` and select the cloned project (`Student-Management-App`).

4. IntelliJ IDEA will automatically detect the project's Maven configuration. If not, import the project as a Maven project.

### Running the Application

1. In IntelliJ IDEA, locate the main application file `StudentManagementAppApplication.java` (typically found in `src/main/java/com/example/Student_Management_App`).

2. Right-click on the file and select `Run 'StudentManagementAppApplication'`.

3. The application will start and run on `http://localhost:8080`.

## API Endpoints

### Student Endpoints

- **Get Student by ID**

  ```http
  GET /student/get-student?id={id}
  ```

  Retrieves a student by their admission number.

- **Get All Students**

  ```http
  GET /student/get-all-students
  ```

  Retrieves a list of all students.

- **Get Student by Path Variable**

  ```http
  GET /student/get-student-by-path/{id}
  ```

  Retrieves a student using a path variable.

- **Add Student**

  ```http
  POST /student/add
  ```

  Adds a new student.

### Teacher Endpoints

- **Add Teacher**

  ```http
  POST /student/add-teacher
  ```

  Adds a new teacher.

- **Get Teacher by Name**

  ```http
  GET /student/get-teacher/{name}
  ```

  Retrieves a teacher by their name.

### Student-Teacher Association Endpoints

- **Add Student-Teacher Pair**

  ```http
  PUT /student/add-student-teacher-pair
  ```

  Adds a student-teacher pair.

- **Get Students by Teacher ID**

  ```http
  GET /student/get-student-by-teacher-id/{teacherId}
  ```

  Retrieves students associated with a specific teacher.

## Testing

You can use Postman to test the API endpoints. Import the provided Postman collection or manually create requests to interact with the API.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some feature'`)
5. Push to the branch (`git push origin feature-branch`)
6. Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
