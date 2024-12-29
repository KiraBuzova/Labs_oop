import org.junit.jupiter.api.Test;

public class AutomationScenarioTest {

    @Test
    void testExecuteAndUndoAll() {
        // Створюємо підсистеми
        LightingSubsystem lighting = new LightingSubsystem();
        TemperatureSubsystem temperature = new TemperatureSubsystem();
        SecuritySubsystem security = new SecuritySubsystem();

        // Створюємо команди
        Command turnOnLights = new TurnOnLightsCommand(lighting);
        Command turnOffLights = new TurnOffLightsCommand(lighting);
        Command setTemperature = new SetTemperatureCommand(temperature, 22);
        Command activateSecurity = new ActivateSecurityCommand(security);
        Command deactivateSecurity = new DeactivateSecurityCommand(security);

        // Створюємо сценарій автоматизації
        AutomationScenario scenario = new AutomationScenario();

        // Додаємо команди до сценарію
        scenario.addCommand(turnOnLights);
        scenario.addCommand(setTemperature);
        scenario.addCommand(activateSecurity);

        // Виконуємо всі команди
        scenario.executeAll();

        // Скасовуємо всі команди
        scenario.undoAll();

        // Додаємо ще одну команду в сценарій і виконуємо її
        scenario.addCommand(turnOffLights);
        scenario.addCommand(deactivateSecurity);
        scenario.executeAll();

    }
}