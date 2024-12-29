package commands;

import subsystems.TemperatureSubsystem;

public class SetTemperatureCommand implements Command {
    private final TemperatureSubsystem temperature;
    private int previousTemperature;
    private final int newTemperature;

    public SetTemperatureCommand(TemperatureSubsystem temperature, int newTemperature) {
        this.temperature = temperature;
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        temperature.setTemperature(0);
    }

    @Override
    public void undo() {
        temperature.setTemperature(previousTemperature);
    }
}
