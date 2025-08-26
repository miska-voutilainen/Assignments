import java.util.Scanner; // Import the Scanner class for reading user input

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Ask for the lengths of the legs of the right triangle
        System.out.print("Enter the length of the first leg: ");
        double leg1 = scanner.nextDouble(); // Read the first leg length

        System.out.print("Enter the length of the second leg: ");
        double leg2 = scanner.nextDouble(); // Read the second leg length

        // Calculate the hypotenuse using the Pythagorean theorem: √(leg1² + leg2²)
        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        // Display the result formatted to two decimal places
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuse);

        scanner.close(); // Close the Scanner to release resources
    }
}
