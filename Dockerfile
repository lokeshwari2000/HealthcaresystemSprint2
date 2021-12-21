FROM openjdk:16-alpine3.13
LABEL maintainer="lokeshwari1139@gmail.com"
EXPOSE 8080
ADD target/HealthCareSystem.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]