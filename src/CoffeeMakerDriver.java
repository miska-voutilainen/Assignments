import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        // Turn on the coffee maker
        myCoffeeMaker.turnOn();
        System.out.println("Coffee maker is now ON.");

        // Ask user to choose coffee type
        System.out.print("Choose coffee type (normal/espresso): ");
        String type = scanner.nextLine().toLowerCase();

        myCoffeeMaker.setCoffeeType(type);
        System.out.println("Coffee type set to: " + myCoffeeMaker.getCoffeeType());

        // Ask user to choose coffee amount
        System.out.print("Enter coffee amount (10–80 ml): ");
        int amount = scanner.nextInt();

        myCoffeeMaker.setCoffeeAmount(amount);
        System.out.println("Coffee amount set to: " + myCoffeeMaker.getCoffeeAmount() + " ml");

        // Turn off the coffee maker
        myCoffeeMaker.turnOff();
        System.out.println("Coffee maker is now OFF.");

        // Confirm settings are remembered
        System.out.println("\nLast coffee type: " + myCoffeeMaker.getCoffeeType());
        System.out.println("Last coffee amount: " + myCoffeeMaker.getCoffeeAmount() + " ml");

        scanner.close();
    }
}
