FROM gradle:8.6-jdk AS build

COPY ./ /app
WORKDIR /app
RUN gradle clean build --verbose -x test

FROM openjdk:17.0.1-jdk-slim AS run
COPY --from=build /app/build/libs/*.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]