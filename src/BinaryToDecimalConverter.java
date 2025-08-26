import java.util.Scanner; // Import Scanner class for user input

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        String binaryInput;

        // Loop until valid binary input is received
        while (true) {
            System.out.print("Enter a binary number (only 0s and 1s): ");
            binaryInput = scanner.nextLine(); // Read input as a string

            // Validate input using regular expression: only 0s and 1s allowed
            if (binaryInput.matches("[01]+")) {
                break; // Valid input, exit loop
            } else {
                System.out.println("Invalid input. Please enter only 0s and 1s.");
            }
        }

        // Convert binary string to decimal integer
        int decimalValue = Integer.parseInt(binaryInput, 2);

        // Display the result
        System.out.println("Decimal value: " + decimalValue);

        scanner.close(); // Close Scanner to free resources
    }
}
