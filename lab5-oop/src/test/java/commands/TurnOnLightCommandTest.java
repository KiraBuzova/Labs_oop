package commands;

import org.junit.jupiter.api.Test;
import subsystems.LightingSubsystem;

import static org.junit.jupiter.api.Assertions.*;


public class TurnOnLightCommandTest {
    @Test
    void testTurnOnLight() {
        LightingSubsystem lighting = new LightingSubsystem();
        TurnOnLightCommand command = new TurnOnLightCommand(lighting);

        command.execute();
        assertTrue(lighting.isLightOn());

        command.undo();
        assertFalse(lighting.isLightOn());
    }
}

