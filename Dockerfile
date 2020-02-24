FROM openjdk:8u212-jdk-alpine3.9

WORKDIR /application
ADD target/*-SNAPSHOT.jar /app.jar

CMD ["java", "-jar","/application/app.jar"]
