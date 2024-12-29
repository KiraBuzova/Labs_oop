package commands;

import org.junit.jupiter.api.Test;
import subsystems.TemperatureSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class SetTemperatureCommandTest {
    @Test
    void testSetTemperature() {
        TemperatureSubsystem temperature = new TemperatureSubsystem();
        SetTemperatureCommand command = new SetTemperatureCommand(temperature, 22);

        command.execute();
        assertEquals(22, temperature.getTemperature());

        command.undo();
        assertEquals(0, temperature.getTemperature());
    }
}