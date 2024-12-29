package commands;

import subsystems.LightingSubsystem;

public class TurnOnLightCommand {
    private LightingSubsystem lighting;

    public TurnOnLightCommand(LightingSubsystem lighting) {
        this.lighting = lighting;
    }

    public void execute() {
        lighting.turnOn();
    }

    public void undo() {
        lighting.turnOff();
    }
}