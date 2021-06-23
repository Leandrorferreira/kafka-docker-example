package com.example.kafka.kafkadockerexample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer producer){
        this.kafkaProducer = producer;
    }

    @PostMapping("/publish")
    public void writeMessageToTopic(@RequestParam("message") String message){
        this.kafkaProducer.writeMessage(message);
    }
}
