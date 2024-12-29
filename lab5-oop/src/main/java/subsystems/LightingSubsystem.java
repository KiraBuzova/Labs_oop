package subsystems;

public class LightingSubsystem {
    private boolean lightOn;

    public void turnOn() {
        lightOn = true;
    }

    public void turnOff() {
        lightOn = false;
    }

    public boolean isLightOn() {
        return lightOn;
    }
}
