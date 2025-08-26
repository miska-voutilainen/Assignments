import java.util.Scanner; // Import Scanner class for user input

public class MedievalWeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Prompt the user for weight in grams
        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble(); // Read weight in grams

        // Conversion constants based on historical Finnish units
        double gramsPerLuoti = 13.28;       // 1 luoti = 13.28 grams
        int luotiPerNaula = 32;             // 1 naula = 32 luoti
        int naulaPerLeiviska = 20;          // 1 leiviskä = 20 naula

        // Convert grams to total luoti
        double totalLuoti = grams / gramsPerLuoti;

        // Calculate number of leiviskä
        int leiviska = (int)(totalLuoti / (luotiPerNaula * naulaPerLeiviska));
        totalLuoti %= (luotiPerNaula * naulaPerLeiviska); // Remaining luoti after leiviskä

        // Calculate number of naula
        int naula = (int)(totalLuoti / luotiPerNaula);
        double luoti = totalLuoti % luotiPerNaula; // Remaining luoti

        // Display the result
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);

        scanner.close(); // Close Scanner to free resources
    }
}
