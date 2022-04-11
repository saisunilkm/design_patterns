package com.thoughtfocus.behavioraldesignpatterns.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {
    @Test
    public void whenRemoteSetToTurnOnLight_AndButtonPressed_LightShouldTurnOn_LightShouldTurnOff() {

        Light livingRoomLight = new Light();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        assertEquals("Turning on light.Light is On", remote.buttonPressed());

        remote.setCommand(new TurnOffLightCommand(livingRoomLight));
        assertEquals("Turning off light.Light is Off", remote.buttonPressed());

    }


    @Test
    public void whenRemoteSetToStartFan_AndButtonPressed_FanShouldStart_FanShouldStop() {

        Fan livingRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new StartFanCommand(livingRoomFan));
        assertEquals("Starting fan...Fan started...", remote.buttonPressed());

        remote.setCommand(new StopFanCommand(livingRoomFan));
        assertEquals("Stopping fan...Fan stopped...", remote.buttonPressed());

    }

}