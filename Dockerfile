FROM openjdk:17-oracle
ADD target/authentication.jar authentication.jar
EXPOSE 8082:8082
ENTRYPOINT ["java" , "-jar" , "authentication.jar"]
