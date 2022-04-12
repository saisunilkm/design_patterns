package com.thoughtfocus.designpatterns.behavioral.memento;

public class Life {
    private String time;

    public String set(String time){
        this.time=time;
        return "Setting time to " +time;
    }

    public Memento saveToMemento(){
        return new Memento(time);
    }

    public String restoreFromMemento(Memento memento){
        time=memento.getSavedTime();
        return "Time restored from Memento: "+ time;
    }
}
