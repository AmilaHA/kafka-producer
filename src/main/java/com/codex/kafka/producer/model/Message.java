package com.codex.kafka.producer.model;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class Message {
    String name;
    Double amount;
}
