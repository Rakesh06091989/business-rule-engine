package com.jms.poc.springjmspoc.api;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import java.util.Map;

@Component
public class MessageListener {

    @JmsListener(destination = "outbound.queue.poc")
    public String receiveMessageForOutBound(final Message jsonMessage) throws JMSException {
        String messageData = null;
        System.out.println("Received message " + jsonMessage);
        String response = null;
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            messageData = textMessage.getText();
            //Map<String, String> map = new Gson().fromJson(messageData, Map.class);
            //response  = "Hello " + map.get("name");
            System.out.println("Response: "+messageData);
        }
        return response;
    }

    @JmsListener(destination = "outbound.queue.poc")
    public String receiveMessage(final Message jsonMessage) throws JMSException {
        String messageData = null;
        System.out.println("Received message " + jsonMessage);
        String response = null;
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            messageData = textMessage.getText();
            //Map<String, String> map = new Gson().fromJson(messageData, Map.class);
            //response  = "Hello " + map.get("name");
            System.out.println("Response: "+messageData);
        }
        return response;
    }
}
