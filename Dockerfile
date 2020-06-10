FROM tomcat:9-jdk11-openjdk
MAINTAINER Evellyn


COPY . /app/gen
WORKDIR /app/gen


EXPOSE 8080

