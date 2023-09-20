# sprint-boot-servicio-eureka-server


# DOCKER
## generar .jar: .\mvnw clean package
## generar imagen: docker build -t servicio-eureka-server:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -p 8761:8761 --name servicio-eureka-server --network sprintcloud servicio-eureka-server:v1
## probando api: http://localhost:8761/