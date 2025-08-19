import java.util.Scanner;

public class ClearDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size and input
        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 2: Remove duplicates
        int[] uniqueNumbers = new int[size]; // Can be same size as original
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
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
    }
}
