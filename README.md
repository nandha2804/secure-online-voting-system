
# Secure Online Voting System using Face Recognition and BlockChain

An Online system that provides features 
such as Accuracy, Convenience, and Privacy. 
Our website will not only save time but also make a 
hassle-free user experience.

![Logo](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/src/main/resources/static/images/loader1.png)

## Table of Contents
- Brief Description
- Objective of the Project
- Screenshots
- Technologies
- Features
- Setup & Installation
- Admin Login Instructions
- Database Setup

## Brief Description

An online voting system is an online voting technique. 
In this system, people who are registered in the system 
can cast his/her vote online without going to any 
physical polling station. There are many voting 
procedures that are being used for voting purposes, 
such as ballot paper, EVM machines but all these 
procedures require more time and more manpower. 
People also have to wait in long queues which takes 
a lot of time in the process.

To eliminate all these drawbacks, we provide an online 
system that provides features such as accuracy, 
convenience, and privacy. Our website will not only 
save time but also make a hassle-free user experience. 
Our online voting system provides a platform with 
proper instructions where users can register themselves 
and cast vote remotely. During the entire process, 
multiple verification processes are carried out which 
makes this entire system secure. This project gives 
freedom to the voter to use his/her voting rights 
from anywhere.

The main aim of this project is to cast votes with 
proper anti-corruption techniques and to minimize 
errors and be hassle-free.

## Objective of the Project
The specific objectives of the project include:

- Improving the existing/current voting process or approach.
- Implementing an automated voting system.
- Validating the system to ensure that only eligible voters are allowed to vote.
- An increasing number of voters as individuals will find it easier and more convenient to vote, especially those abroad.

## Screenshots

#### Home Page
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%201.png)

#### Registration Page
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%202.png)

#### Instructions (In Video and Written)
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%203.jpg)

#### Admin Portal
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%204.png)

#### Details of the Registered Users
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%205.png)

#### User Portal when Voting goes LIVE!
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%206.png)

#### Confirmation Email after successfuly Voting
![](https://raw.githubusercontent.com/Themysticlees/Secure-Online-Voting-System-using-Face-Recognition-and-BlockChain/master/Screenshots/Image%207.png)

## Technologies

#### Frontend Technologies
- HTML 
- CSS
- JavaScript
- JQuery
- Thymeleaf

#### Backend Technologies
- Java
- Python
- Open CV
- Spring
- Spring MVC
- Spring Boot
- Spring JPA
- Hibernate
- Spring Security
- Tomcat server
- MySQL
- Blockchain

## Features

- Face Recognition
- OTP validation
- Video Instructions
- Decentralized Data
- User Authentication

## Setup & Installation

1. Clone the repository and open the project in your IDE.
2. Configure your MySQL database in `src/main/resources/application.properties`.
3. Run the SQL scripts to create required tables (see Database Setup below).
4. Build and run the Spring Boot application.
5. Access the application at `http://localhost:4000/`.

## Admin Login Instructions

- **Admin URL:** `http://localhost:4000/admin/`
- **Default Admin Username:** `admin`
- **Default Admin Password:** `admin`
- The admin user is created automatically on application startup.
- If you cannot log in as admin, ensure the admin creation code in `SpringBootFormApplication.java` is enabled.

## Database Setup

- Ensure MySQL is running and configured in `application.properties`.
- Run the following SQL to create the missing `votecopy` table:

```sql
CREATE TABLE votecopy (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255),
    candidate VARCHAR(255),
    voted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

- Make sure all other tables required by JPA entities exist. If you encounter errors about missing tables, check your database and create them as needed.

## Demo

(Will be Uploaded Later)
