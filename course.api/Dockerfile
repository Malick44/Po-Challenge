# syntax=docker/dockerfile:1

FROM maven

WORKDIR /api
LABEL maintainer="javaAPi"
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

#RUN ./mvnw dependency:resolve
COPY src ./src
COPY target/springBootApp.jar springBootApp.jar
ENTRYPOINT ["java", "-jar", "springBootApp.jar"]

