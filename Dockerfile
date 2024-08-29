FROM openjdk:17-jdk-slim

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:go-offline

COPY src ./src

RUN ./mvnw clean package -DskipTests

RUN apt-get update && apt-get install -y curl

EXPOSE 8761

CMD ["java", "-jar", "target/eurekasrv.jar"]