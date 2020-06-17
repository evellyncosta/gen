FROM tomcat:9-jdk11-openjdk-slim
MAINTAINER Evellyn

USER root
RUN apt-get update
RUN apt-get -y install maven

WORKDIR /app

RUN mvn clean install

RUN cp /target/gen-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/gen.war

EXPOSE 8080

