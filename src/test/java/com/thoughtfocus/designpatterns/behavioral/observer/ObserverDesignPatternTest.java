package com.thoughtfocus.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverDesignPatternTest {
    @Test
    void message() {
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree = new MessageSubscriberThree();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberTwo);

        assertEquals("notified Updated Message", messagePublisher.notifyUpdate(new Message("First Message")));

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberThree);

        assertEquals("notified Updated Message", messagePublisher.notifyUpdate(new Message("Second Message")));
    }

}