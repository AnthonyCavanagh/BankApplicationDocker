FROM adoptopenjdk:16.0.1_9-jdk-hotspot-focal

EXPOSE 8083

RUN mkdir /app
COPY target/transaction-service.war /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/transaction-service.war"]