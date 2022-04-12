package com.thoughtfocus.behavioraldesignpatterns.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {
    @Test
     void message(){
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator,"Rohith");
        User user2 = new UserImpl(mediator,"Sunil");
        mediator.addUser(user1);
        mediator.addUser(user2);

        assertEquals("Sending Message",user1.send("Hi"));
    }

}