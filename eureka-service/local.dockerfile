FROM adoptopenjdk:16.0.1_9-jdk-hotspot-focal

EXPOSE 8761

RUN mkdir /app
COPY target/eureka-service.jar /app
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/eureka-service.jar"]