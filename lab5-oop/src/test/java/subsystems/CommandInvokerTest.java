import org.junit.jupiter.api.Test;

public class CommandInvokerTest {
    @Test
    void testCommandExecutionAndUndo() {
        LightingSubsystem lighting = new LightingSubsystem();
        Command turnOnLights = new TurnOnLightsCommand(lighting);
        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(turnOnLights);
        assertTrue(lighting.isLightsOn());

        invoker.undoLastCommand();
        assertFalse(lighting.isLightsOn());
    }
}