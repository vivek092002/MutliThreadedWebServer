# MutliThreadedWebServer
### Technologies Used
- Java SE (Standard Edition)
- Java Networking APIs (Socket, ServerSocket)
- Java Threads for concurrency

### About Project
This Java application implements a multi-threaded web server capable of handling concurrent HTTP requests. It serves static files and supports basic dynamic content generation through server-side scripts.

### Features

- Concurrency: Handles multiple client connections simultaneously using Java threads.
- Static File Serving: Delivers static web content (HTML, CSS, JavaScript, images, etc.).
- Dynamic Content: Supports server-side scripts (e.g., servlets) for generating dynamic content.
- Configuration: Easily configurable through properties files (server.properties).


### How its work

-Server starts and listens on a specified port (e.g., 8080).
-For each client request, a new thread (from the pool) handles the connection.
-The thread parses the HTTP request and fetches the requested file.
-If the file exists, the server sends the response (HTML, CSS, JS, images, etc.).
-If the file does not exist, it returns a 404 Not Found.
-After handling the request, the thread closes the connection and becomes available for new clients.



## Authors

- [@vivek092002](https://github.com/vivek092002)


## Badges

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)



## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)]([https://katherineoelsner.com/](https://vivek092002.github.io/PORTFOLIO/))
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)]([https://www.linkedin.com/](https://www.linkedin.com/in/vivek-kumar-399653149/))



## Support

For support, email kumar.vivek092002@gmail.com.


