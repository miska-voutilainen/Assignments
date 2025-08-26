import java.util.Scanner; // Import Scanner for user input

public class ClearDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Step 1: Get array size and input
        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size]; // Array to store user input

        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // Read each integer
        }

        // Step 2: Remove duplicates using a simple comparison method
        int[] uniqueNumbers = new int[size]; // Array to store unique values
        int uniqueCount = 0; // Counter for unique values

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if current number already exists in uniqueNumbers
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to uniqueNumbers
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        // Step 3: Print result
        System.out.println("Array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();

        scanner.close(); // Close Scanner to free resources
    }
}
