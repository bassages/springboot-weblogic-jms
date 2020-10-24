package com.example.weblogicjmsdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class QueueReaderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(QueueReaderService.class);

    @JmsListener(destination = "${spring.wls.jms.queueName}")
    public void receiveApplicationNotification(String input) {
        LOGGER.info("Receiving message from queue {}", input);
    }
}
