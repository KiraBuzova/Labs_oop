import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Абстрактний клас
abstract class LibraryItem {
    private String title;
    private String uniqueId;
    private boolean isAvailable;

    public LibraryItem(String title, String uniqueId) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.isAvailable = true;
    }

    // Абстрактний метод
    public abstract String getItemType();

    public String getTitle() {
        return title;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

// Підклас, що представляє книгу
class Book extends LibraryItem {
    private String author;

    public Book(String title, String uniqueId, String author) {
        super(title, uniqueId);
        this.author = author;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    public String getAuthor() {
        return author;
    }
}

// Підклас, що представляє журнал
class Magazine extends LibraryItem {
    private String issueNumber;

    public Magazine(String title, String uniqueId, String issueNumber) {
        super(title, uniqueId);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    public String getIssueNumber() {
        return issueNumber;
    }
}

// Підклас, що представляє аудіокнигу
class Audiobook extends LibraryItem {
    private String narrator;

    public Audiobook(String title, String uniqueId, String narrator) {
        super(title, uniqueId);
        this.narrator = narrator;
    }

    @Override
    public String getItemType() {
        return "Audiobook";
    }

    public String getNarrator() {
        return narrator;
    }
}

// Клас, що представляє бібліотеку та її функціональність
class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    // Метод для додавання нового предмета до бібліотеки
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Метод для пошуку предмета за унікальним ідентифікатором
    public LibraryItem findItem(String uniqueId) throws ItemNotFoundException {
        for (LibraryItem item : items) {
            if (item.getUniqueId().equals(uniqueId)) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item with ID " + uniqueId + " not found.");
    }

    // Метод для видачі предмета
    public void checkoutItem(String uniqueId) throws ItemNotFoundException, ItemNotAvailableException {
        LibraryItem item = findItem(uniqueId);
        if (!item.isAvailable()) {
            throw new ItemNotAvailableException("Item " + uniqueId + " is not available for checkout.");
        }
        item.setAvailable(false);
        System.out.println("Checked out: " + item.getTitle());
    }

    // Метод для повернення предмета
    public void returnItem(String uniqueId) throws ItemNotFoundException {
        LibraryItem item = findItem(uniqueId);
        item.setAvailable(true);
        System.out.println("Returned: " + item.getTitle());
    }

    // Метод для пошуку предметів за назвою
    public List<LibraryItem> searchByTitle(String title) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }

    // Метод для виведення всього каталогу бібліотеки
    public void printCatalog() {
        for (LibraryItem item : items) {
            printItemDetails(item);
        }
    }

    // Метод для отримання списку доступних предметів
    public List<LibraryItem> getAvailableItems() {
        List<LibraryItem> availableItems = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    // Метод для виведення списку доступних предметів
    public void printAvailableItems() {
        List<LibraryItem> availableItems = getAvailableItems();
        System.out.println("Available items:");
        for (LibraryItem item : availableItems) {
            printItemDetails(item);
        }
    }

    // Метод для виведення деталей окремого предмета
    private void printItemDetails(LibraryItem item) {
        System.out.println(item.getItemType() + ": " + item.getTitle() + 
                           " (ID: " + item.getUniqueId() + ")" +
                           (item.isAvailable() ? " - Available" : " - Checked out"));
    }
}

// Власний виняток для випадку, коли предмет не знайдено
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

// Власний виняток для випадку, коли предмет недоступний для видачі
class ItemNotAvailableException extends Exception {
    public ItemNotAvailableException(String message) {
        super(message);
    }
}

// Головний клас програми
public class Main {
    private static Library library;
    private static Scanner scanner;

    public static void main(String[] args) {
        library = new Library();
        scanner = new Scanner(System.in);

        initializeLibrary();
        runLibrarySystem();
    }

    // Метод для ініціалізації бібліотеки початковими даними
    private static void initializeLibrary() {
        library.addItem(new Book("1984", "B001", "George Orwell"));
        library.addItem(new Magazine("National Geographic", "M001", "June 2023"));
        library.addItem(new Audiobook("The Great Gatsby", "A001", "Jake Gyllenhaal"));
    }

    // Головний цикл роботи програми
    private static void runLibrarySystem() {
        while (true) {
            printMenu();
            int choice = getMenuChoice();
            processMenuChoice(choice);
        }
    }

    // Метод для виведення меню
    private static void printMenu() {
        System.out.println("\n--- Library Management System ---");
        System.out.println("1. View all items");
        System.out.println("2. View available items");
        System.out.println("3. Search items");
        System.out.println("4. Checkout item");
        System.out.println("5. Return item");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    // Метод для отримання вибору користувача
    private static int getMenuChoice() {
        return scanner.nextInt();
    }

    // Метод для обробки вибору користувача
    private static void processMenuChoice(int choice) {
        switch (choice) {
            case 1:
                library.printCatalog();
                break;
            case 2:
                library.printAvailableItems();
                break;
            case 3:
                searchItems();
                break;
            case 4:
                checkoutItem();
                break;
            case 5:
                returnItem();
                break;
            case 6:
                System.out.println("Thank you for using the Library Management System.");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Метод для пошуку предметів
    private static void searchItems() {
        System.out.print("Enter search term: ");
        scanner.nextLine(); // Споживаємо символ нового рядка
        String searchTerm = scanner.nextLine();
        List<LibraryItem> results = library.searchByTitle(searchTerm);
        System.out.println("Search results:");
        for (LibraryItem item : results) {
            System.out.println(item.getTitle() + " (" + item.getItemType() + ")");
        }
    }

    // Метод для видачі предмета
    private static void checkoutItem() {
        System.out.print("Enter item ID to checkout: ");
        String itemId = scanner.next();
        try {
            library.checkoutItem(itemId);
        } catch (ItemNotFoundException | ItemNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Метод для повернення предмета
    private static void returnItem() {
        System.out.print("Enter item ID to return: ");
        String itemId = scanner.next();
        try {
            library.returnItem(itemId);
        } catch (ItemNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}