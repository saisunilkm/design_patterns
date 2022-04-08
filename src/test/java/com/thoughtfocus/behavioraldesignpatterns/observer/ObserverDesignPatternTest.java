package com.thoughtfocus.behavioraldesignpatterns.observer;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverDesignPatternTest {
    @Test
    public void message(){
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree = new MessageSubscriberThree();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberTwo);

        assertEquals("notified Updated Message",messagePublisher.notifyUpdate(new Message("First Message")));

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberThree);

        assertEquals("notified Updated Message",messagePublisher.notifyUpdate(new Message("Second Message")));
    }

}