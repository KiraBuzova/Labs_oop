import commands.Command;
import java.util.ArrayList;
import java.util.List;

public class AutomationScenario {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeAll() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undoAll() {
        for (Command command : commands) {
            command.undo();
        }
    }
}