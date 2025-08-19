import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius using the standard formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result with one decimal place
        System.out.printf("Temperature in Celsius: %.1f°C%n", celsius);

        scanner.close();
    }
}
