How to test endpoints:
-----------------------
* It is ready to run project on _`localhost:8080`_

* _JWT Authentication_ is enabled for the project. For this reason, it is necessary to get a valid token at first.
* If there is a registered user on the system, this user can be used to get a JWT token. If there is no user, it is necessary to sign up a user;
 

  **Request URL;**

  `http://localhost:8080/api/users/sign-up`
  
  
  **Request Body;**

  `{
  "password": "koray",
  "username": "pass"
  }`
  

  **or cURL;**

  `curl -X POST "http://localhost:8080/api/users/sign-up" -H "accept: */*" -H "Content-Type: application/json" -d "{ "password": "koray", "username": "pass"}"`
  
* After sign-up, it is necessary to login for get a valid JWT token. To do this; send a POST request with signed up user to; http://localhost:8080/login
* Token will be inside of headers (with "Authorization" key)


* After getting a valid token, it would be used on swagger. To access the Swagger UI;
 
  `http://localhost:8080/swagger-ui.html`
  

* Taken JWT token must be written to Authorization section of Swagger.
  

* Then, it is ready to consume endpoints from Swagger;
