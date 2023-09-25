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
- **Project Lombok**
- **Spring Boot Starter Test (Test Scope)**

### Installation

1. Clone the repository (if you haven't already):

   ```shell
   git clone [https://github.com/Mrparam07/](https://github.com/Mrparam07/Kaiburr-Assignment/tree/main/Task-1)


### Configuration
Configure MongoDB connection settings in application.properties.

### API Endpoints and Resources

| Endpoint | Method | Description |
| --- | --- | --- |
| `/servers/createServer` | PUT | Create a server. Accepts a "server" object in JSON format in the request body. |
| `/servers/getServer` | GET | Retrieve a list of "server" objects. |
| `/servers/getServer?id=<ID>` | GET | Retrieve a "server" object matching the specified ID. |
| `/servers/getServer?name=<Name>` | GET | Retrieve a list of "server" objects matching the specified Name. |
| `/servers/deleteServer?id=<ID>` | DELETE | Delete a "server" object matching the specified ID. |
##### Run using POSTMAN

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
