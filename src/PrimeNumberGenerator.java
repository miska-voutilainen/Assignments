import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        // Prompt user for valid input
        while (true) {
            System.out.print("Enter the start number (positive integer): ");
            start = scanner.nextInt();

            System.out.print("Enter the end number (positive integer): ");
            end = scanner.nextInt();

            if (start > 0 && end > 0 && start < end) {
                break;
            } else {
                System.out.println("Invalid input. Make sure both numbers are positive and start < end.");
            }
        }

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Loop through the range and check for primes
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
