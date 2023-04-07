package com.codex.kafka.producer.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;

@AllArgsConstructor
@NoArgsConstructor
//@Log4j2
//@Data
@Getter
@Setter
public class Producer {

    private ObjectMapper objectMapper;
    private KafkaTemplate<String, String> kafkaTemplate;

}
