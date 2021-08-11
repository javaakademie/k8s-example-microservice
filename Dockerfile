FROM openjdk:8-jdk-alpine
EXPOSE 8100
ADD /target/k8s-example-service*.jar k8s-example-service.jar
ENTRYPOINT ["java", "-jar", "k8s-example-service.jar"]

