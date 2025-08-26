import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner for user input
        CoffeeMaker myCoffeeMaker = new CoffeeMaker(); // Create a CoffeeMaker object

        // Turn on the coffee maker
        myCoffeeMaker.turnOn();
        System.out.println("Coffee maker is now ON.");

        // Ask user to choose coffee type
        System.out.print("Choose coffee type (normal/espresso): ");
        String type = scanner.nextLine().toLowerCase(); // Normalize input to lowercase

        myCoffeeMaker.setCoffeeType(type); // Set coffee type if valid
        System.out.println("Coffee type set to: " + myCoffeeMaker.getCoffeeType());

        // Ask user to choose coffee amount
        System.out.print("Enter coffee amount (10–80 ml): ");
        int amount = scanner.nextInt();

        myCoffeeMaker.setCoffeeAmount(amount); // Set coffee amount if valid
        System.out.println("Coffee amount set to: " + myCoffeeMaker.getCoffeeAmount() + " ml");

        // Turn off the coffee maker
        myCoffeeMaker.turnOff();
        System.out.println("Coffee maker is now OFF.");

        // Confirm settings are remembered even when the machine is off
        System.out.println("\nLast coffee type: " + myCoffeeMaker.getCoffeeType());
        System.out.println("Last coffee amount: " + myCoffeeMaker.getCoffeeAmount() + " ml");

        scanner.close(); // Close Scanner to free resources
    }
}
