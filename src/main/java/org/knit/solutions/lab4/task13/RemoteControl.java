package org.knit.solutions.lab4.task13;

public class RemoteControl {
    private Command lastCommand;
    private final LightOnCommand lightOnCommand = new LightOnCommand();
    private final LightOffCommand lightOffCommand = new LightOffCommand();
    private final TVOnCommand tvOnCommand = new TVOnCommand();
    private final TVOffCommand tvOffCommand = new TVOffCommand();
    private final GoodNightCommand goodNightCommand = new GoodNightCommand();
    private final GoodMorningCommand goodMorningCommand = new GoodMorningCommand();

    void lightOn() {
        lightOnCommand.execute();
        lastCommand = lightOnCommand;
    }

    void lightOff() {
        lightOffCommand.execute();
        lastCommand = lightOffCommand;
    }

    void TVOn() {
        tvOnCommand.execute();
        lastCommand = tvOnCommand;
    }

    void TVOff() {
        tvOffCommand.execute();
        lastCommand = tvOffCommand;
    }

    void goodNight() {
        goodNightCommand.execute();
        lightOff();
        TVOff();
        lastCommand = goodNightCommand;
    }

    void goodMorning() {
        goodMorningCommand.execute();
        lightOn();
        TVOn();
        lastCommand = goodMorningCommand;
    }

    void undo() {
        if (lastCommand == lightOnCommand) {
            lightOff();
        } else if (lastCommand == lightOffCommand) {
            lightOn();
        } else if (lastCommand == tvOnCommand) {
            TVOff();
        } else if (lastCommand == tvOffCommand) {
            TVOn();
        } else if (lastCommand == goodNightCommand) {
            goodMorning();
        } else if (lastCommand == goodMorningCommand) {
            goodNight();
        }
    }
}
