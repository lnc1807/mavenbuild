# Stage 1: Build the JAR using Maven
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Package the application (skips tests during image build for speed)
RUN mvn clean package -DskipTests

# Stage 2: Run the application using a lightweight JRE
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the built JAR file from the first stage
COPY --from=build /app/target/MavenDemo-1.0-SNAPSHOT.jar app.jar

# Command to run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
