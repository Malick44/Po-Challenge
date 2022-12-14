# syntax=docker/dockerfile:1

#FROM ubuntu
#RUN apt-get update
#RUN apt-get install nginx -y
#CMD ["nginx", "-g", "daemon off;"]
FROM openjdk:17

LABEL maintainer="javaAPi"
COPY .mvn .mvn
COPY mvnw pom.xml ./

WORKDIR /tmp
#RUN ./mvnw dependency:resolve
COPY src ./src
COPY target/springBootApp.jar springBootApp.jar
ENTRYPOINT ["java", "-jar", "springBootApp.jar"]


