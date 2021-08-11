Spring Boot Dienst zur Bereitstellung auf Kubernetes mit Jenkins
===
Beispielprojekt zur automatischen Bereitstellung eines Spring-Boot-Dienstes auf Kubernetes mithilfe einer Jenkins-Pipeline.

Requirements
---
- Maven
- Docker

Build
---
1. Build project
    ```
    mvn clean package
    ```
2. Build Docker image
    ```
    docker build -t k8s-example-service .
    ```
   
Falls der Container für Tests lokal gestartet werden soll:
```
docker run -p 8100:8100 k8s-example-service
```
