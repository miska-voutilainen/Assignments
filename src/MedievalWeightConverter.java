import java.util.Scanner;

public class MedievalWeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for weight in grams
        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble();

        // Conversion constants
        double gramsPerLuoti = 13.28;
        int luotiPerNaula = 32;
        int naulaPerLeiviska = 20;

        // Total luoti
        double totalLuoti = grams / gramsPerLuoti;

        // Calculate leiviskä, naula, and luoti
        int leiviska = (int)(totalLuoti / (luotiPerNaula * naulaPerLeiviska));
        totalLuoti %= (luotiPerNaula * naulaPerLeiviska);

        int naula = (int)(totalLuoti / luotiPerNaula);
        double luoti = totalLuoti % luotiPerNaula;

        // Display the result
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);

        scanner.close();
    }
}
