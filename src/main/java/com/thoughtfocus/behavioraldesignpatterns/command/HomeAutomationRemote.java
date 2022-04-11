package com.thoughtfocus.behavioraldesignpatterns.command;

public class HomeAutomationRemote {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public String buttonPressed() {
        return command.execute();
    }
}
