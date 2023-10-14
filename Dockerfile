FROM bellsoft/liberica-openjdk-alpine:18.0.2.1-1
WORKDIR /app
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]