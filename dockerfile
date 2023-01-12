FROM openjdk:21-slim-buster

WORKDIR /app

ADD ./target/ECF_backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]