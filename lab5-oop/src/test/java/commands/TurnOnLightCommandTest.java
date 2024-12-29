package commands;

import org.junit.jupiter.api.Test;
import smartHome.commands.TurnOnLightCommand;
import smartHome.subsystems.LightingSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class TurnOnLightCommandTest {
    @Test
    void testTurnOnLights() {
        LightingSubsystem lighting = new LightingSubsystem();
        TurnOnLightCommand command = new TurnOnLightCommand(lighting);

        lighting.turnOff(); // Вимкнути перед тестом
        command.execute();
        assertTrue(lighting.isLightOn());

        command.undo();
        assertFalse(lighting.isLightOn());
    }
}
