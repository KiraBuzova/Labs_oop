package commands;

import org.junit.jupiter.api.Test;
import smartHome.commands.ActivateSecurityCommand;
import smartHome.subsystems.SecuritySubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class ActivateSecurityCommandTest {
    @Test
    void testActivateSecurity() {
        SecuritySubsystem security = new SecuritySubsystem();
        ActivateSecurityCommand command = new ActivateSecurityCommand(security);

        security.deactivate(); //Вимкнути перед тестом
        command.execute();
        assertTrue(security.isActive());

        command.undo();
        assertFalse(security.isActive());
    }
}
