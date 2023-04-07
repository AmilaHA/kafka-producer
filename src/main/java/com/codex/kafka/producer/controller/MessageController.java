package com.codex.kafka.producer.controller;

import com.codex.kafka.producer.model.Message;
import com.codex.kafka.producer.service.MessageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("send")
    public String sendMessage(@RequestBody Message message) throws JsonProcessingException {
        log.info("Message sent by producer");
        return messageService.sendMessage(message);
    }
}
