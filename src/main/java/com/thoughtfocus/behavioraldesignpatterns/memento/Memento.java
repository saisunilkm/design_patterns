package com.thoughtfocus.behavioraldesignpatterns.memento;

public class Memento {
    private final String time;

    public Memento(String timeToSave){
        time=timeToSave;
    }

    public String getSavedTime(){
        return time;
    }
}
