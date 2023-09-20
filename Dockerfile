FROM openjdk:19-jdk-alpine
VOLUME /tmp
ADD ./target/sprint-boot-servicio-eureka-server-0.0.1-SNAPSHOT.jar  eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar","/eureka-server.jar"]