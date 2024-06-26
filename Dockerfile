FROM openjdk:17-jdk-alpine
ADD target/*.jar app.jar
ADD cd/start-app.sh start-app.sh
EXPOSE 8080
CMD exec sh start-app.sh