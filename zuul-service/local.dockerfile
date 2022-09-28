FROM adoptopenjdk:16.0.1_9-jdk-hotspot-focal

EXPOSE 8080

RUN mkdir /app
COPY target/zuul-service.war /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/zuul-service.war"]