package com.codex.kafka.producer.service;

import com.codex.kafka.producer.model.Message;
import com.codex.kafka.producer.model.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MessageService {

    @Value("${topic.name.producer}")
    private String topic;

    @Autowired
    private Producer producer;

    public String sendMessage(Message message) throws JsonProcessingException {
        String messageAsString = producer.getObjectMapper().writeValueAsString(message);
        producer.getKafkaTemplate().send(topic, messageAsString);
        log.info("Producer message sent{}", messageAsString);
        return "Kafka Producer sent the message";
    }

}
