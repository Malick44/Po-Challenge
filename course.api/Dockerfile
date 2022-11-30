# syntax=docker/dockerfile:1

#FROM ubuntu
#RUN apt-get update
#RUN apt-get install nginx -y
#CMD ["nginx", "-g", "daemon off;"]
FROM maven

WORKDIR /api
LABEL maintainer="javaAPi"
COPY .mvn/ .mvn
COPY mvnw pom.xml ./


#RUN ./mvnw dependency:resolve
COPY src ./src
COPY target/springBootApp.jar springBootApp.jar
ENTRYPOINT ["java", "-jar", "springBootApp.jar"]
EXPOSE 3000

