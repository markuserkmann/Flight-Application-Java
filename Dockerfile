  # Stage 1: Build the application
  FROM maven:3.8.4-openjdk-17 AS build

  WORKDIR /app

  COPY pom.xml .
  COPY src ./src
  RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the packaged JAR file from the build stage
COPY --from=build /app/target/*.jar FlightApplication.jar
COPY src/main/resources/application.properties /app/application.properties

EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "FlightApplication.jar"]