FROM maven:3.6.3-adoptopenjdk-11 as dependant
WORKDIR /app
COPY . ./
RUN mvn clean install


FROM tomcat:9-jdk11-openjdk-slim


USER root

WORKDIR /usr/local/tomcat


COPY --from=dependant /app/target/gen-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/gen.war


EXPOSE 8080

