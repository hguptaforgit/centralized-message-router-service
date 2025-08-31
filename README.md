# kafka-basic-consumer

A simple Spring Boot consumer application that listens to messages from a Kafka topic.

## Requirements
- Java 17
- Maven
- Docker & Docker Compose

## Getting Started

1. **Start Kafka and Zookeeper**
   ```bash
   docker-compose up -d
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

The application listens on the `test-topic` topic at `localhost:9092`.
If the topic does not already exist, it will be created automatically.

## Sending a Test Message
Use the Kafka console producer to send a message:
```bash
docker-compose exec kafka kafka-console-producer --bootstrap-server localhost:9092 --topic test-topic
>hello
```

## Shutdown
```bash
docker-compose down
```
