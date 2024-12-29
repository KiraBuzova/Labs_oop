package smartHome.subsystems;

public class TemperatureSubsystem {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C.");
    }

    public int getTemperature() {
        return temperature;
    }
}

