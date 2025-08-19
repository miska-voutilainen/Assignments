import java.util.Scanner;

public class CalculateMaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        // Brute-force approach to find maximum subarray sum
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

        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Subarray indices (1-based): " + (startIndex + 1) + " to " + (endIndex + 1));
    }
}