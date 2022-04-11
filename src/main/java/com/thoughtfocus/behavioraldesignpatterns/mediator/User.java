package com.thoughtfocus.behavioraldesignpatterns.mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator=mediator;
        this.name=name;
    }

    public abstract String send(String message);

    public abstract String receive(String message);
}
