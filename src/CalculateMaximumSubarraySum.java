import java.util.Scanner; // Import Scanner for user input

public class CalculateMaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Ask user for the number of integers
        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size]; // Create array to store integers

        // Prompt user to enter the integers
        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables for tracking maximum sum and indices
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        // Brute-force approach: check all possible subarrays
        for (int i = 0; i < size; i++) {
            int currentSum = 0;
            for (int j = i; j < size; j++) {
                currentSum += numbers[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        // Display the result
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Subarray indices (1-based): " + (startIndex + 1) + " to " + (endIndex + 1));

        scanner.close(); // Close Scanner to free resources
    }
}
