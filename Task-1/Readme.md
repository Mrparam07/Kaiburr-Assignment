# Java REST API Example

This project demonstrates the implementation of a Java REST API that provides endpoints for managing "server" objects. The server objects are stored in a MongoDB database. 

## Getting Started

Follow these steps to set up and run the project on your local machine.

### Prerequisites

- Java Development Kit (JDK)
- Maven
- MongoDB
- Git (optional)

### Installation

1. Clone the repository (if you haven't already):

   ```shell
   git clone https://github.com/Mrparam07/java-rest-api.git
Navigate to the project directory:

shell
Copy code
cd java-rest-api
Build the project:

shell
Copy code
mvn clean install
Start the application:

shell
Copy code
java -jar target/java-rest-api-1.0.jar
The application should now be running on http://localhost:8080.

## API Endpoints

Get All Servers
Endpoint: /servers

# Method: GET
Description: Get a list of all servers.
Sample Request: curl http://localhost:8080/servers/getServer

Get Server by ID
Endpoint: /servers/{id}

Method: GET
Description: Get a single server by its ID.
Sample Request: curl http://localhost:8080/servers/createServer
Create a Server
Endpoint: /servers

# Method: PUT

Description: Create a new server.

Sample Request:

shell
Copy code
curl -X PUT -H "Content-Type: application/json" -d '{
    "name": "my centos",
    "id": "123",
    "language": "java",
    "framework": "django"
}'
http://localhost:8080/servers/createServer

# Delete a Server
Endpoint: /servers/{id}
Method: DELETE
Description: Delete a server by its ID.
Sample Request: curl -X DELETE http://localhost:8080/servers/deleteServer?id=123

# Find Servers by Name
Endpoint: /servers/getServer?=name=java
Method: GET
Description: Find servers by name.
Sample Request: curl http://localhost:8080/servers/getServer?name=my%20centos

## Configuration
Configure MongoDB connection settings in application.properties.

## Testing
Unit tests are available in the src/test directory. Run tests using mvn test
