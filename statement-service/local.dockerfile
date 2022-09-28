FROM adoptopenjdk:16.0.1_9-jdk-hotspot-focal

EXPOSE 8081

RUN mkdir /app
COPY target/statement-service.war /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/statement-service.war"]