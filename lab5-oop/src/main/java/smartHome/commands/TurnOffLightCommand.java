package smartHome.commands;

import smartHome.subsystems.LightingSubsystem;

public class TurnOffLightCommand implements Command {
    private final LightingSubsystem lighting;

    public TurnOffLightCommand(LightingSubsystem lighting) {
        this.lighting = lighting;
    }

    @Override
    public void execute() {
        lighting.turnOff();
    }

    @Override
    public void undo() {
        lighting.turnOn();
    }
}