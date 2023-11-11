FROM openjdk:17
WORKDIR /app
COPY . .
RUN ./mvnw spring-boot:run