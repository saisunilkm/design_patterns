package com.thoughtfocus.behavioraldesignpatterns.command;

public class TurnOffLightCommand implements ICommand{
    Light light;

    public TurnOffLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public String execute() {
        return "Turning off light." + light.turnOff();

    }
}
