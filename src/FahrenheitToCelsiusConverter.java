import java.util.Scanner; // Import the Scanner class for user input

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); // Read the Fahrenheit value entered by the user

        // Convert to Celsius using the standard formula: (F - 32) × 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result formatted to one decimal place
        System.out.printf("Temperature in Celsius: %.1f°C%n", celsius);

        scanner.close(); // Close the Scanner to free up resources
    }
}
