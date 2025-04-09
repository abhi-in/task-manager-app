# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application jar file into the container
COPY target/task-manager-backend-0.0.1-SNAPSHOT.jar /app/task-manager-backend-0.0.1-SNAPSHOT.jar

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "task-manager-backend-0.0.1-SNAPSHOT.jar"]
