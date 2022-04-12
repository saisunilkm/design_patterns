package com.thoughtfocus.designpatterns.behavioral.observer;

public class Message {
    final String messageContent;

    public Message (String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
