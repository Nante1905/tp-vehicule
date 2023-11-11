FROM openjdk:17
# COPY . .
ENTRYPOINT [ "./mvnw", "spring-boot:run" ]