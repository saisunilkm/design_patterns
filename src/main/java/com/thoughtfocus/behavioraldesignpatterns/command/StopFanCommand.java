package com.thoughtfocus.behavioraldesignpatterns.command;

public class StopFanCommand implements ICommand{
    Fan fan;

    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public String execute() {
        return "Stopping fan..." + fan.stop();

    }
}
