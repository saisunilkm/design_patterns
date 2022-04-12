package com.thoughtfocus.designpatterns.behavioral.command;

public class StartFanCommand implements ICommand{
    Fan fan;

    public StartFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public String execute() {
        return "Starting fan..." + fan.start();

    }
}
