FROM adoptopenjdk:16.0.1_9-jdk-hotspot-focal

EXPOSE 8082

RUN mkdir /app
COPY target/account-service.war /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/account-service.war"]