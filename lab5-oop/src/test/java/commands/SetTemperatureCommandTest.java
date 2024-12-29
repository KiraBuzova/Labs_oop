package commands;

import org.junit.jupiter.api.Test;

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

