# Simple App Using VueJS as Front End and Spring Boot 2 as the Server and to provide REST Service

## What is the Use of This Repo
This App is a Simple VueJS and Springboot 2 App which uses

1. VueJS
 * Vue Components
 * HTTP Client using axios Library
 * Basic Vue Routing
 * Vue Bootstrap
 * Communication between Vue Components and Views
2. SpringBoot 2
 * Springboot RestController
 * Service, Repository(DAO) from Spring Framework
 * Autowiring is used as well to inject the Dependencies

This Applications template can be copied and used to build other bigger applications.

The CSS used is very basic since the main aim of this project is to focus on Vue JS

## What Does this Application do

The Application displays a list of customers, and on clicking on a customer it displays more details about the customer

## Prerequites to Run the Application

### Install NodeJS [![Generic badge](https://img.shields.io/badge/Prerequisite-NodeJS-blue.svg)](https://nodejs.org/en/)

Refer https://nodejs.org/en/ to install NodeJS

### Install Vue Cli [![Generic badge](https://img.shields.io/badge/Prerequisite-VueCli-blue.svg)](https://cli.vuejs.org/guide/)

Install Vue Cli Node Package Globally using the following Command.

```bash
npm install -g @vue/cli
```

### Install maven

Install Maven and Ensure IDE is pointing to Right Maven folder

Also Ensure maven is set as a path variable to that maven commands can be run easily

Refer https://maven.apache.org/ for maven installation

## Steps to Run the Application

Clone the repo into local

Open the client folder and install the npm packages using the following commands

```bash
cd client
npm install
```

Go Back to the Parent Project Folder and build the package using the following commands

```bash
cd ..
mvn clean package
```

Go to server folder and start the Application using the following commands

```bash
cd server
mvn spring-boot:run
```

The Application runs on **localhost:8080** and the application runs in a embedded container in local

## Folder Structure

**client** : This has the Client Code implemented using Vue JS

**server** : This has the Springboot code

**pom.xml** : This is multimodule pom. This pom in turn executes the pom within the client and the server folders

## Application Design

### VueJS

#### Views and components

**Customers** : This View Displays a list of customers and gets the data from SpringBoot REST Service

**CustomerDetails** : This View Displays the Details of a single customer and gets the data from SpringBoot Rest Service

**Display** : Display component displays the name of the selected customer in **Customers** View. **Display** is a child component of **Customers** View

#### Http Library [![Generic badge](https://img.shields.io/badge/http-axios-blue.svg)](https://www.npmjs.com/package/axios)

**axios** library is used to make http calls

#### Routing

The Application has 2 endpoints

**/customers** : The ties to *Customers* View

**/customerdetails** : This ties to *CustomerDetails* View
### Springboot 2

The package `com.example.demo` has the `DemoApplication.java` file which ensures that the application runs in an embedded container and forms the starting point of the code

The package `com.example.dao.impl` has the DAO ( Data Access Object ) Defined. The package `com.example.dao` has the interfaces defined for the DAOs.
The **DAO( Data Access Object )** connects to the DataBase and gets the necessary data

The package `com.example.service.impl` has the Services Defined . The package `com.example.service` has the interfaces defined for the Services.
The **Service** is where the business logic is run on the Data which comes from DAO

The package `com.example.controller` has the Rest Controller defined. The controller has all the end points defined and mentions which function should be executed when an end point is called. The Controller also defines which Endpoint Calls which Service

The package `com.example.models` has all the java models defined

The `application.properties` file is used to define various properties such as the port in which the embedded container runs , the context path of the application etc

## Postman Collection

Import the postman collections from `postman` folder into Postman.
This postman collection has all the REST endpoints which are implemented in springboot.

## References

**Springboot** : Refer to https://spring.io/guides/gs/rest-service/ to build REST service using Springboot

**VueJS** : https://vuejs.org/v2/guide/

**vue cli** : https://cli.vuejs.org/guide/

**axios** : https://www.npmjs.com/package/axios

**vue bootstrap** : https://bootstrap-vue.js.org/docs

**vue router** : https://router.vuejs.org/guide/
