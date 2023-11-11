FROM openjdk:17
COPY . /app
WORKDIR /app
EXPOSE 8080
ENTRYPOINT [ "./mvnw", "spring-boot:run" ]