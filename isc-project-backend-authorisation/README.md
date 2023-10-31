## Quickstart ##

# COMPILE PROJECT #

Per compilare l'applicazione bisogna avviare dal cmd il comando ".\compile-run.cmd"

# RUN DOCKER AMBIENTE WINDOWS #

Per runnare l'applicazione su docker bisogna avviare dal cmd i comandi:

- ".\compile-run.cmd"
- ".\run-docker.cmd"

N.B. per poter runnare docker in locale c'è bisogno di collegare l'account docker al docker hub!
Delle volte capita che dia lo stesso problema anche essendo loggati, quindi andare su C:\Users\{NomeUtente} e cancellate
il file .docker, dopo di che seguire uno dei 2 modi:

1) Aprire il terminale, digitare 'docker login' e fare l'accesso
2) Fare il login su docker desktop

# RUN DOCKER AMBIENTE LINUX #

Per runnare l'applicazione su docker bisogna avviare dal cmd i comandi:

- ".\compile-run.sh"

Per visualizzare le API disponibili andare sullo [Swagger](http://localhost:8080/swagger-ui/) del progetto.

