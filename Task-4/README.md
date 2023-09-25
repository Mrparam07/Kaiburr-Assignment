# WEB-UI-FORM
[liveapp](https://webuiform.netlify.app/)

 ## Important Note

**Please Note**: The REST API is not currently deployed on a public server, so the GET and PUT methods will not work out of the box.

To interact with the API, you'll need to set up a local environment on your system. 

However, if it have access to a hosted version of the API or locally hosted on the system, the React app should work seamlessly with it. Simply ensure that the API's base URL in the React app is configured to point to the hosted API server.

To interact with the API and the React app together:

1. Ensure that the API is hosted and accessible.

2. Update the React app's configuration to use the hosted API's base URL.

3. Run the React app, and it should work in conjunction with the hosted API.

### Requirements

- Node

#### Dependencies

- **axios**
- **bootstrap**
- **react**
- **react-dom**
- **react-scripts**
- **react-toastify**
- **reactstrap**
  
### Operation

| Method               | Description          | Axios HTTP Method |
|----------------------|----------------------|-------------------|
| `createServer()`     | Create a server      | PUT               |
|                      |                      |                   |
| `deleteServer(id)`   | Delete a server      | DELETE            |
|                      | by ID                |                   |
| `findServerById(id)` | Find a server        | GET               |
|                      | by ID                |                   |
| `findServerByName(name)` | Find servers by   | GET               |
|                      | Name                 |                   |


#### Screenshots

![WebUiForm](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-4/Screenshots/WUFHomeTask4.png)

![CreateServer](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-4/Screenshots/WUFCreateServerTask4.png)

![DeleteServer](https://github.com/Mrparam07/Kaiburr-Assignment/blob/main/Task-4/Screenshots/WUFDeleteServerTask4.png)
