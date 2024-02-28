# JWT Authentication Test Project

## Overview
This project is designed to demonstrate a basic implementation of JWT (JSON Web Token) authentication and authorization in a Spring Boot 3.0 application. It utilizes Spring Security 6 for securing endpoints and PostgreSQL as the database backend. The project is structured for testing purposes only and does not carry any semantic load.

## Note
This application is for testing and demonstration purposes only and should not be used as a template for production applications without proper modifications and security enhancements.


## Features
- User registration endpoint
- User authentication endpoint
- Secured endpoint that requires a valid JWT for access

## Technologies
- Spring Boot 3.0
- Spring Security 6
- PostgreSQL
- Maven

## Setup and Installation
1. Ensure you have Java JDK 11 and Maven installed on your system.
2. Set up a PostgreSQL database and update the `application.properties` with your database credentials.
3. Run the command `mvn clean install` to build the project.
4. Start the application using `mvn spring-boot:run`.
5. The application will be accessible on `http://localhost:8080`.

## Usage
The application provides the following endpoints:

### Auth Controller
- `POST /api/v1/auth/register`: Endpoint for user registration.
  - Request body should contain `username`, `password`, and `email`.
- `POST /api/v1/auth/authenticate`: Endpoint for user authentication.
  - Request body should contain `username` and `password`.
  - Response will include a JWT for authorized access to secured endpoints.

### Test Controller
- `GET /api/v1/test-jwt`: Secured endpoint that returns a success message if accessed with a valid JWT.

## Testing via Postman
1. Register a new user using the `/api/v1/auth/register` endpoint.
2. Authenticate with the registered user credentials using the `/api/v1/auth/authenticate` endpoint.
3. Use the obtained JWT in the `Authorization` header as a Bearer token to access the secured endpoint `/api/v1/test-jwt`.

