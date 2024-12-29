package smartHome.subsystems;

public class SecuritySubsystem {
    private boolean active;

    public void activate() {
        active = true;
        System.out.println("Security system activated.");
    }

    public void deactivate() {
        active = false;
        System.out.println("Security system deactivated.");
    }

    public boolean isActive() {
        return active;
    }
}