FROM openjdk:17
COPY . .
RUN ./mvnw spring-boot:run