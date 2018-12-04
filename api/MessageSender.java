package com.jms.poc.springjmspoc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageSender {

    @Autowired
    public JmsTemplate jmsTemplate;

    @GetMapping("/send")
    public void sendMessage() {
        String message = "{\"name\":\"John\"}";
        jmsTemplate.convertAndSend("outbound.queue.poc",message);
    }
}
