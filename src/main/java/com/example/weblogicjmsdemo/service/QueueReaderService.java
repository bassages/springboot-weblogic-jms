package com.example.weblogicjmsdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class QueueReaderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(QueueReaderService.class);

    private static final String CONFIG_PROPERTY_JMS_QUEUE_NAME_FOR_INCOMING_MESSAGES = "${spring.wls.jms.queueNameForIncomingMessages}";

    @Value(CONFIG_PROPERTY_JMS_QUEUE_NAME_FOR_INCOMING_MESSAGES)
    private String queueNameForIncomingMessages;

    @JmsListener(destination = CONFIG_PROPERTY_JMS_QUEUE_NAME_FOR_INCOMING_MESSAGES)
    public void receiveApplicationNotification(String message) {
        LOGGER.info("Received message from queue [{}]: [{}]", queueNameForIncomingMessages, message);
    }
}
