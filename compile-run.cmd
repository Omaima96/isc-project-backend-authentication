SET DOCKER_REPOSITORY=authentication
SET DOCKER_GOAL=dockerBuild
mvn clean package -U
docker-compose up