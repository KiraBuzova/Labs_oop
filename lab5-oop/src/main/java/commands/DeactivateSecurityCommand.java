package commands;

import subsystems.SecuritySubsystem;

public class DeactivateSecurityCommand implements Command {
    private final SecuritySubsystem security;

    public DeactivateSecurityCommand(SecuritySubsystem security) {
        this.security = security;
    }

    @Override
    public void execute() {
        security.deactivate();
    }

    @Override
    public void undo() {
        security.activate();
    }
}