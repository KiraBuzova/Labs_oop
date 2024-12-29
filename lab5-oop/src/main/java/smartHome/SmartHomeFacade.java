package smartHome;

import smartHome.subsystems.LightingSubsystem;
import smartHome.subsystems.TemperatureSubsystem;
import smartHome.subsystems.SecuritySubsystem;

public class SmartHomeFacade {
    private final LightingSubsystem lighting;
    private final TemperatureSubsystem temperature;
    private final SecuritySubsystem security;

    public SmartHomeFacade(LightingSubsystem lighting, TemperatureSubsystem temperature, SecuritySubsystem security) {
        this.lighting = lighting;
        this.temperature = temperature;
        this.security = security;
    }

    public void turnOnLights() {
        lighting.turnOn();
    }

    public void turnOffLights() {
        lighting.turnOff();
    }

    public void setTemperature(int temp) {
        temperature.setTemperature(temp);
    }

    public void activateSecurity() {
        security.activate();
    }

    public void deactivateSecurity() {
        security.deactivate();
    }
}