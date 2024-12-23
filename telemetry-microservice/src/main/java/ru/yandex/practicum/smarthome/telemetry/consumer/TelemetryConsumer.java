package ru.yandex.practicum.smarthome.telemetry.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TelemetryConsumer {
    @KafkaListener(id = "myId", topics = "topic1")
    public void listen(Object in) {
        System.out.println(in);
    }
}
