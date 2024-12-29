package commands;

import subsystems.SecuritySubsystem;

public class ActivateSecurityCommand implements Command {
    private final SecuritySubsystem security;

    public ActivateSecurityCommand(SecuritySubsystem security) {
        this.security = security;
    }

    @Override
    public void execute() {
        security.activate();
    }

    @Override
    public void undo() {
        security.deactivate();
    }
}