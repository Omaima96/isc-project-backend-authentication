export DOCKER_REPOSITORY=authentication
export DOCKER_GOAL=dockerBuild
mvn clean package -U
docker-compose up -d
docker-compose logs -f