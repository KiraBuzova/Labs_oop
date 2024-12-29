package commands;

import subsystems.SecuritySubsystem;

public class DeactivateSecurityCommand {
    private SecuritySubsystem security;

    public DeactivateSecurityCommand(SecuritySubsystem security) {
        this.security = security;
    }

    public void execute() {
        security.deactivate();
    }

    public void undo() {
        security.activate();
    }
}
