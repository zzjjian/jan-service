FROM openjdk:8u212-jdk-alpine3.9 as BUILD

WORKDIR /application
ADD target/*-SNAPSHOT.jar /app.jar

FROM openjdk:8u212-jdk-alpine3.9

WORKDIR /application
COPY --from=BUILD /application /application
CMD ["java", "-jar","/application/app.jar"]
