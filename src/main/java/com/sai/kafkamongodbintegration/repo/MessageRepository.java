package com.sai.kafkamongodbintegration.repo;

import com.sai.kafkamongodbintegration.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}

