package subsystems;

import org.junit.jupiter.api.Test;
import smartHome.SmartHomeFacade;
import smartHome.subsystems.LightingSubsystem;
import smartHome.subsystems.SecuritySubsystem;
import smartHome.subsystems.TemperatureSubsystem;

import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeFacadeTest {

    @Test
    void testFacadeMethods() {
        // Створюємо підсистеми
        LightingSubsystem lighting = new LightingSubsystem();
        TemperatureSubsystem temperature = new TemperatureSubsystem();
        SecuritySubsystem security = new SecuritySubsystem();

        // Створюємо фасад
        SmartHomeFacade facade = new SmartHomeFacade(lighting, temperature, security);

        // Виконуємо операції через фасад
        facade.turnOnLights();  // Включаємо освітлення
        facade.setTemperature(22);  // Встановлюємо температуру
        facade.activateSecurity();  // Активуємо безпеку

        // Перевіряємо стан після виконання команд
        assertTrue(lighting.isLightOn(), "Lights should be on.");
        assertEquals(22, temperature.getTemperature(), "Temperature should be set to 22°C.");
        assertTrue(security.isActive(), "Security system should be active.");

        // Виконуємо операції для вимкнення
        facade.turnOffLights();  // Вимикаємо освітлення
        facade.deactivateSecurity();  // Деактивуємо безпеку

        // Перевіряємо стан після вимкнення
        assertFalse(lighting.isLightOn(), "Lights should be off.");
        assertFalse(security.isActive(), "Security system should be inactive.");
    }
}