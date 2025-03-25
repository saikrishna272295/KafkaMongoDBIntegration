package com.sai.kafkamongodbintegration.service;

import com.sai.kafkamongodbintegration.model.Message;
import com.sai.kafkamongodbintegration.repo.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @Autowired
    private MessageRepository repository;

    @KafkaListener(topics = "messages-topic")
    public void consume(String message) {
        log.info("Consumed Message: {}",message);
        Message msg = new Message();
        msg.setContent(message);
        repository.save(msg);
    }
}

