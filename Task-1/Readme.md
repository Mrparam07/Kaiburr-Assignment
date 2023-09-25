# Java REST API

This project demonstrates the implementation of a Java REST API that provides endpoints for managing "server" objects. The server objects are stored in a MongoDB database. 

## Getting Started

Follow these steps to set up and run the project on your local machine.

### Prerequisites

- Java Development Kit (JDK)
- Maven
- MongoDB
- Git (optional)

### Dependencies

- **Spring Boot Starter Data MongoDB**
- **Spring Boot Starter Web**
- **Spring Boot Starter Tomcat**
- **SpringFox Swagger2**
- **SpringFox Swagger UI**
- **Jackson Datatype ThreeTenBP**
- **Bean Validation API Support**
- **Spring Boot Starter Test**
- **Jakarta XML Binding API**

### Installation

1. Clone the repository (if you haven't already):

   ```shell
   git clone https://github.com/Mrparam07/


### Configuration
Configure MongoDB connection settings in application.properties.

## Endpoints and Resources
Rest API Endpoint is mapped to `http://127.0.0.1:8080/servers/`

- PUT a server	`http://127.0.0.1:8080/servers/createServer`
Accept "server" object in body in json format.

- GET servers	`http://127.0.0.1:8080/servers/getServer`
Returns a list of "server" objects.

- GET server	by ID	`http://127.0.0.1:8080/servers/getServer?id=<ID>`
Returns a  "server" object matching with ID.

- GET servers	by Name	`http://127.0.0.1:8080/servers/getServer?name=<Nmae>`
Returns a list of "server" objects matching with Name.

- DELETE server	`http://127.0.0.1:8080/servers/deleteServer?id=<ID>`
Deletes a  "server" object matching with ID.

## RestController interface extends MongoRepository

```java
List<Server> findAll();
    
Server findById(String Id);
    
void createOrUpdateServer(Server server);
    
void deleteServerById(String Id);
    
List<Server> findByName(String name);
```

### Screenshots

![PutPostManIO](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-1/Screenshots/createServerTask1.png)

![GetAllServerPostManIO](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-1/Screenshots/getServerTask1.png)

![GetServByIdPostManIO](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-1/Screenshots/getServerByIDTask1.png)

![GetServByNamePostManIO](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-1/Screenshots/getServerByNameTask1.png)

![DelPostManIO](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-1/Screenshots/deleteServerTask1.png)

### Testing
Unit tests are available in the src/test directory. Run tests using mvn test
