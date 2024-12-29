package commands;

import org.junit.jupiter.api.Test;
import subsystems.SecuritySubsystem;
import static org.junit.jupiter.api.Assertions.*;

public final class ActivateSecurityCommandTest {
    @Test
    void testActivateSecurity() {
        SecuritySubsystem security = new SecuritySubsystem();
        ActivateSecurityCommand command = new ActivateSecurityCommand(security);

        command.execute();
        assertTrue(security.isActive());

        command.undo();
        assertFalse(security.isActive());
    }
}
