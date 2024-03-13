# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY src src
RUN mvn -B package -DskipTests

# Stage 2: Create the final image
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/rest-cal-0.0.1-SNAPSHOT.war rest-cal-docker.war
ENTRYPOINT ["java", "-jar", "rest-cal-docker.war"]

#docker build -t rest-cal_latest .
#docker run -p 8080:8080 rest-cal_latest
