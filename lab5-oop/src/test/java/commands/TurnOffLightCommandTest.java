package commands;

import org.junit.jupiter.api.Test;
import subsystems.LightingSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class TurnOffLightCommandTest {
    @Test
    void testTurnOffLight() {
        LightingSubsystem lighting = new LightingSubsystem();
        TurnOffLightCommand command = new TurnOffLightCommand(lighting);

        command.execute();
        assertFalse(lighting.isLightOn());

        command.undo();
        assertTrue(lighting.isLightOn());
    }
}
