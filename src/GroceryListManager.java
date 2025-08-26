import java.util.*;

public class GroceryListManager {

    // Inner class representing a grocery item
    private static class GroceryItem {
        String name;
        double cost;
        String category;
        int quantity;

        GroceryItem(String name, double cost, String category, int quantity) {
            this.name = name;
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return name + " (Category: " + category + ", Cost: $" + cost + ", Quantity: " + quantity + ")";
        }
    }

    // Map to store grocery items by name
    private Map<String, GroceryItem> groceryList = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Main loop
    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n--- Grocery List Manager ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display List");
            System.out.println("4. Check Item");
            System.out.println("5. Update Quantity");
            System.out.println("6. Display Available Items");
            System.out.println("7. Display by Category");
            System.out.println("8. Calculate Total Cost");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addItemInteractive();
                case 2 -> removeItemInteractive();
                case 3 -> displayList();
                case 4 -> checkItemInteractive();
                case 5 -> updateQuantityInteractive();
                case 6 -> displayAvailableItems();
                case 7 -> displayByCategoryInteractive();
                case 8 -> System.out.println("Total Cost: $" + calculateTotalCost());
                case 9 -> running = false;
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Add item
    private void addItemInteractive() {
        System.out.print("\nEnter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter cost: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        groceryList.put(name, new GroceryItem(name, cost, category, quantity));
        System.out.println(name + " added to the list.");
    }

    // Remove item
    private void removeItemInteractive() {
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine();
        if (groceryList.remove(name) != null) {
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Check if item exists
    private void checkItemInteractive() {
        System.out.print("Enter item name to check: ");
        String name = scanner.nextLine();
        System.out.println(name + " is in the list? " + groceryList.containsKey(name));
    }

    // Update quantity
    private void updateQuantityInteractive() {
        System.out.print("Enter item name to update quantity: ");
        String name = scanner.nextLine();
        GroceryItem item = groceryList.get(name);
        if (item != null) {
            System.out.print("Enter new quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            item.quantity = quantity;
            System.out.println("Quantity updated.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Display items by category
    private void displayByCategoryInteractive() {
        System.out.print("Enter category to display: ");
        String category = scanner.nextLine();
        displayByCategory(category);
    }

    // Display all items
    public void displayList() {
        System.out.println("\nGrocery List:");
        int index = 1;
        for (GroceryItem item : groceryList.values()) {
            System.out.println(index++ + ". " + item);
        }
    }

    // Display items with quantity > 0
    public void displayAvailableItems() {
        System.out.println("\nAvailable Items:");
        for (GroceryItem item : groceryList.values()) {
            if (item.quantity > 0) {
                System.out.println("- " + item);
            }
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        for (GroceryItem item : groceryList.values()) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println("- " + item);
            }
        }
    }

    // Calculate total cost of all items
    public double calculateTotalCost() {
        double total = 0.0;
        for (GroceryItem item : groceryList.values()) {
            total += item.cost * item.quantity;
        }
        return total;
    }

    // Entry point
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.start();
    }
}
