package com.example.weblogicjmsdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Service
public class JmsErrorHandler implements ErrorHandler {

    private static final Logger LOG = LoggerFactory.getLogger(JmsErrorHandler.class);

    @Override
    public void handleError(Throwable throwable) {
        LOG.error("error", throwable);
    }
}

