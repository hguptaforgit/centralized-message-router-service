package com.example.kafkaconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoggingConsumer {

    @KafkaListener(topics = "${kafka.topic:test-topic}", groupId = "${spring.kafka.consumer.group-id:test-group}")
    public void listen(String message) {
        log.info("Received message: {}", message);
    }
}
