package com.thoughtfocus.behavioraldesignpatterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageSubscriberOne implements Observer{
    private static Logger logger = LoggerFactory.getLogger(MessageSubscriberOne.class);
    @Override
    public void update(Message message) {
        logger.info("MessageSubscriberOne:" + message.getMessageContent());
    }
}
