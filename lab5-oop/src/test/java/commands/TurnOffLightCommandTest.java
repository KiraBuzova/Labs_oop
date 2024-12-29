package commands;

import org.junit.jupiter.api.Test;
import smartHome.commands.TurnOffLightCommand;
import smartHome.subsystems.LightingSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class TurnOffLightCommandTest {
    @Test
    void testTurnOffLights() {
        LightingSubsystem lighting = new LightingSubsystem();
        TurnOffLightCommand command = new TurnOffLightCommand(lighting);

        lighting.turnOn(); // Увімкнути перед тестом
        command.execute();
        assertFalse(lighting.isLightOn());

        command.undo();
        assertTrue(lighting.isLightOn());
    }
}
