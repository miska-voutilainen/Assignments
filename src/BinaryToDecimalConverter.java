import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryInput;

        // Loop until valid binary input is received
        while (true) {
            System.out.print("Enter a binary number (only 0s and 1s): ");
            binaryInput = scanner.nextLine();

            if (binaryInput.matches("[01]+")) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. Please enter only 0s and 1s.");
            }
        }

        // Convert binary to decimal
        int decimalValue = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal value: " + decimalValue);

        scanner.close();
    }
}
