# App for learning purposes, made with Springboot.

1. Open the command line and navigate to the application's folder. Then run the following command to create a Docker container:
```docker build -t flight-app ```
This command creates a Docker image named flight-app, which includes all the necessary configurations.

2. After the container is created, start the application with the following command:
``` docker run -p 8080:8080 flight-app ```

Once the application is running, it can be accessed from the url: http://localhost:8080.
