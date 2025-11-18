Cities API
<p align="center"> <img src="https://img.shields.io/badge/Java-17-blue"> <img src="https://img.shields.io/badge/Spring%20Boot-3.x-success"> <img src="https://img.shields.io/badge/PostgreSQL-16-blue"> <img src="https://img.shields.io/badge/Status-Active-brightgreen"> <img src="https://img.shields.io/badge/License-MIT-lightgrey"> </p>
📘 About the Project

This project was created during a Digital Innovation One (DIO) Java training course by Rodrigo Peleias.

The Cities API is a REST application built with Java Spring Boot, providing structured data about countries, states, and cities, including distance calculation between two cities.
The project follows clean architecture principles, good practices, and clear documentation.

📑 Table of Contents

Overview

Technologies

Features

Endpoints

Architecture

Deployment

Contributing

License

Overview

The project was designed with the following goals:

Clear separation of layers (Controller, Service, Repository)

Connection to a remote database hosted on Render

Easy maintenance and scalability

Standardized and consistent API responses

Technologies

Java 17

Spring Boot

Spring Web

Spring Data JPA

PostgreSQL 16

Maven

Render (deployment)

Features

List all countries

List all states

List all cities

Distance calculation between two cities (by-point and by-cube)

Full integration with PostgreSQL

Endpoints
📍 Endpoint Table
Method	Route	Description
GET	/paises	Returns all countries
GET	/estados	Returns all states
GET	/cidades	Returns all cities
GET	/by-point	Calculates distance using the POINT strategy
GET	/by-cube	Calculates distance using the CUBE strategy
Architecture
src/
 └── main/
     ├── java/
     │   └── com.felipe.citiesapi
     │       ├── controller/
     │       ├── service/
     │       ├── repository/
     │       └── model/
     └── resources/
         ├── application.properties
         └── data.sql / schema.sql (optional)


Architecture designed for clarity, maintainability, and future scalability.

Deployment

The API is publicly available on Render:
👉 https://cities-api-0il5.onrender.com

Contributing

Contributions are welcome!
Feel free to open issues or submit pull requests.

License

Licensed under the MIT License.
You are free to use, study, and modify this project.
