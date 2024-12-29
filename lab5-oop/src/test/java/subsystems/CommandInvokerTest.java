package subsystems;

import org.junit.jupiter.api.Test;
import smartHome.CommandInvoker;
import smartHome.commands.Command;
import smartHome.commands.TurnOnLightCommand;
import smartHome.subsystems.LightingSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class CommandInvokerTest {
    @Test
    void testCommandExecutionAndUndo() {
        LightingSubsystem lighting = new LightingSubsystem();
        Command turnOnLights = new TurnOnLightCommand(lighting);
        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(turnOnLights);
        assertTrue(lighting.isLightOn());

        invoker.undoLastCommand();
        assertFalse(lighting.isLightOn());
    }
}