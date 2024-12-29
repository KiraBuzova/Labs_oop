import org.junit.jupiter.api.Test;

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


        // Виконуємо операції для вимкнення
        facade.turnOffLights();  // Вимикаємо освітлення
        facade.deactivateSecurity();  // Деактивуємо безпеку

    }
}