package com.thoughtfocus.designpatterns.behavioral.observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public String notifyUpdate(Message message);

}
