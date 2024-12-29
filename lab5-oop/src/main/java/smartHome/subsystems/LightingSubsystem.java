package smartHome.subsystems;

public class LightingSubsystem {
    private boolean lightOn;

    public void turnOn() {
        lightOn = true;
        System.out.println("Lights turned on.");
    }

    public void turnOff() {
        lightOn = false;
        System.out.println("Lights turned off.");
    }

    public boolean isLightOn() {
        return lightOn;
    }
}
