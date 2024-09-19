import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOperations {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));
        numbers.addAll(Arrays.asList((byte) 127, (short) 320, 201, 62L, 6.14f, 8.25, new BigDecimal("12.98")));
        
        // Виведення чисел у початковому форматі
        System.out.println("Список чисел: " + numbers);
        
        // Створення окремих списків для цілих і дробних чисел
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> decimals = new ArrayList<>();
        for (Number number : numbers) {
            integers.add(number.intValue());
            decimals.add(String.format("%.2f", number.doubleValue()));
        }
        
        // Виведення чисел у форматі цілих чисел
        System.out.println("Числа у форматі цілих чисел: " + integers);
        
        // Виведення чисел у форматі дробових чисел
        System.out.println("Числа у форматі дробових чисел: " + decimals);
        
        // Додаємо зберігання чисел за типами
        Map<Class<?>, ArrayList<Number>> numberMap = new HashMap<>();
        numberMap.put(Byte.class, new ArrayList<>());
        numberMap.put(Short.class, new ArrayList<>());
        numberMap.put(Integer.class, new ArrayList<>());
        numberMap.put(Double.class, new ArrayList<>());
        numberMap.put(Long.class, new ArrayList<>());
        numberMap.put(Float.class, new ArrayList<>());
        numberMap.put(BigDecimal.class, new ArrayList<>());
        
        for (Number number : numbers) {
            Class<? extends Number> numberClass = number.getClass();
            numberMap.computeIfAbsent(numberClass, k -> new ArrayList<>()).add(number);
        }
        
        // Виведення чисел за типами
        System.out.println("Числа за типами:");
        for (Map.Entry<Class<?>, ArrayList<Number>> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey().getSimpleName() + ": " + entry.getValue());
        }
        
        // Обчислення середнього значення всіх чисел у списку
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        double average = sum / numbers.size();
        
        System.out.println("Середнє значення всіх чисел зі списку: " + String.format("%.2f", average));
    }
}