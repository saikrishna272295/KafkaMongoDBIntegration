package com.sai.kafkamongodbintegration.controller;

import com.sai.kafkamongodbintegration.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private KafkaProducerService producer;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        producer.sendMessage(message);
        return "Message sent: " + message;
    }
}

