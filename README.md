## Quickstart ##

# COMPILE PROJECT #

To compile the application you need to start the command ".\compile-run.cmd" from cmd

# RUN DOCKER WINDOWS ENVIRONMENT #

To run the application on Docker you need to start the commands from cmd:

- ".\compile-run.cmd"
- ".\run-docker.cmd"

N.B. To be able to run Docker locally you need to connect your Docker account to the Docker Hub!
Sometimes it happens that it gives the same problem even if you are logged in, so go to C:\Users\{Username} and delete
the .docker file, after which follow one of 2 ways:

1) Open terminal, type 'docker login' and log in
2) Log in to docker desktop

# RUN DOCKER LINUX ENVIRONMENT #

To run the application on Docker you need to start the commands from cmd:

- ".\compile-run.sh"

To view the available APIs go to the project's [Swagger](http://localhost:8080/swagger-ui/).