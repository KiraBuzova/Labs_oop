package smartHome.commands;

public interface Command {
    void execute();
    void undo();
}