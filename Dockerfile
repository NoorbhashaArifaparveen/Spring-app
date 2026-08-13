# Step 1: Build using Maven with Java 26
FROM maven:3.9.16-eclipse-temurin-26 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run using Java 26 Runtime
FROM eclipse-temurin:26-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
