package com.designpatterns.exercise9;

public class CommandTest {
    public static void main(String[] args) {

        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight = new Light("Bedroom");

        RemoteControl remote = new RemoteControl();

        // Turn on living room light
        remote.setCommand(new LightOnCommand(livingRoomLight));
        remote.pressButton();

        // Turn on bedroom light
        remote.setCommand(new LightOnCommand(bedroomLight));
        remote.pressButton();

        System.out.println("----------------------");

        // Turn off living room light
        remote.setCommand(new LightOffCommand(livingRoomLight));
        remote.pressButton();

        // Turn off bedroom light
        remote.setCommand(new LightOffCommand(bedroomLight));
        remote.pressButton();
    }
}
