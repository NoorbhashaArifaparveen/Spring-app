# Step 1: Build using Maven and Java 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
# This tells the compiler to explicitly use target version 21
RUN mvn clean package -DskipTests -Dmaven.compiler.source=21 -Dmaven.compiler.target=21

# Step 2: Run using Java 21 Runtime
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
