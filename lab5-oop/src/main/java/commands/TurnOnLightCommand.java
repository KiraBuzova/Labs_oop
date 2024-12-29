package commands;

import subsystems.LightingSubsystem;

public class TurnOnLightCommand implements Command {
    private final LightingSubsystem lighting;

    public TurnOnLightCommand(LightingSubsystem lighting) {
        this.lighting = lighting;
    }

    @Override
    public void execute() {
        lighting.turnOn();
    }

    @Override
    public void undo() {
        lighting.turnOff();
    }
}