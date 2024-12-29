package subsystems;

import org.junit.jupiter.api.Test;
import smartHome.AutomationScenario;
import smartHome.commands.TurnOnLightCommand;
import smartHome.commands.TurnOffLightCommand;
import smartHome.commands.SetTemperatureCommand;
import smartHome.commands.ActivateSecurityCommand;
import smartHome.commands.DeactivateSecurityCommand;
import smartHome.subsystems.LightingSubsystem;
import smartHome.subsystems.SecuritySubsystem;
import smartHome.subsystems.TemperatureSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class AutomationScenarioTest {

    @Test
    void testExecuteAndUndoAll() {
        // Створюємо підсистеми
        LightingSubsystem lighting = new LightingSubsystem();
        TemperatureSubsystem temperature = new TemperatureSubsystem();
        SecuritySubsystem security = new SecuritySubsystem();

        // Створюємо команди
        TurnOnLightCommand turnOnLights = new TurnOnLightCommand(lighting);
        TurnOffLightCommand turnOffLights = new TurnOffLightCommand(lighting);
        SetTemperatureCommand setTemperature = new SetTemperatureCommand(temperature, 22);
        ActivateSecurityCommand activateSecurity = new ActivateSecurityCommand(security);
        DeactivateSecurityCommand deactivateSecurity = new DeactivateSecurityCommand(security);

        // Створюємо сценарій автоматизації
        AutomationScenario scenario = new AutomationScenario();

        // Додаємо команди до сценарію
        scenario.addCommand(turnOnLights);
        scenario.addCommand(setTemperature);
        scenario.addCommand(activateSecurity);

        // Виконуємо всі команди
        scenario.executeAll();

        // Перевіряємо, що всі команди виконані коректно
        assertTrue(lighting.isLightOn(), "Lights should be on.");
        assertEquals(22, temperature.getTemperature(), "Temperature should be set to 22°C.");
        assertTrue(security.isActive(), "Security system should be active.");

        // Скасовуємо всі команди
        scenario.undoAll();

        // Перевіряємо, що всі команди скасовані
        assertFalse(lighting.isLightOn(), "Lights should be off.");
        assertEquals(0, temperature.getTemperature(), "Temperature should be reset to 0°C.");
        assertFalse(security.isActive(), "Security system should be inactive.");

        // Додаємо ще одну команду в сценарій і виконуємо її
        scenario.addCommand(turnOffLights);
        scenario.addCommand(deactivateSecurity);
        scenario.executeAll();

        // Перевіряємо, що нові команди виконані
        assertFalse(lighting.isLightOn(), "Lights should be off.");
        assertFalse(security.isActive(), "Security system should be inactive.");
    }
}
