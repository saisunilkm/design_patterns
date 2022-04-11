package com.thoughtfocus.behavioraldesignpatterns.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {
    @Test
    public void whenRemoteSetToTurnOnLight_AndButtonPressed_LightShouldTurnOn() {

        Light livingRoomLight = new Light();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        assertEquals("Turning on light.Light is On", remote.buttonPressed());

    }

    @Test
    public void whenRemoteSetToTurnOffLight_AndButtonPressed_LightShouldTurnOff() {

        Light livingRoomLight = new Light();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new TurnOffLightCommand(livingRoomLight));
        assertEquals("Turning off light.Light is Off", remote.buttonPressed());

    }

    @Test
    public void whenRemoteSetToStartFan_AndButtonPressed_FanShouldStart() {

        Fan livingRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new StartFanCommand(livingRoomFan));
        assertEquals("Starting fan...Fan started...", remote.buttonPressed());

    }

    @Test
    public void whenRemoteSetToStopFan_AndButtonPressed_FanShouldStop() {

        Fan livingRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new StopFanCommand(livingRoomFan));
        assertEquals("Stopping fan...Fan stopped...", remote.buttonPressed());

    }

}