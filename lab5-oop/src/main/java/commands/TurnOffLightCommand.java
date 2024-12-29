package commands;

import subsystems.LightingSubsystem;

public class TurnOffLightCommand {
    private final LightingSubsystem lighting;

    public TurnOffLightCommand(LightingSubsystem lighting) {
        this.lighting = lighting;
    }

    public void execute() {
        lighting.turnOff();
    }

    public void undo() {
        lighting.turnOn();
    }
}
