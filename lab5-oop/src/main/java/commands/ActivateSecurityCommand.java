package commands;

import subsystems.SecuritySubsystem;

public class ActivateSecurityCommand {
    private final SecuritySubsystem security;

    public ActivateSecurityCommand(SecuritySubsystem security) {
        this.security = security;
    }

    public void execute() {
        security.activate();
    }

    public void undo() {
        security.deactivate();
    }
}