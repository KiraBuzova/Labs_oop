package commands;

import org.junit.jupiter.api.Test;
import subsystems.SecuritySubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class DeactivateSecurityCommandTest {
    @Test
    void testDeactivateSecurity() {
        SecuritySubsystem security = new SecuritySubsystem();
        DeactivateSecurityCommand command = new DeactivateSecurityCommand(security);
        
        command.execute();
        assertFalse(security.isActive());

        command.undo();
        assertTrue(security.isActive());
    }
}
