package com.thoughtfocus.designpatterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageSubscriberThree implements Observer{
    private static Logger logger = LoggerFactory.getLogger(MessageSubscriberThree.class);

    @Override
    public void update(Message message) {
        logger.info("MessageSubscriberThree: "+ message.getMessageContent());

    }
}
