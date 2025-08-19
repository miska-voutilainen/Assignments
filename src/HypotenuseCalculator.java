import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the lengths of the legs
        System.out.print("Enter the length of the first leg: ");
        double leg1 = scanner.nextDouble();

        System.out.print("Enter the length of the second leg: ");
        double leg2 = scanner.nextDouble();

        // Calculate the hypotenuse using Math.sqrt and Math.pow
        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        // Display the result
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuse);

        scanner.close();
    }
}
