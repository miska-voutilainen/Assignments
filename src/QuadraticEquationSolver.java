import java.util.Scanner; // Import Scanner class for user input

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Prompt user for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant: b² - 4ac
        double discriminant = b * b - 4 * a * c;

        // Determine the nature of the roots based on the discriminant
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal: " + root);
        } else {
            // No real roots (complex numbers)
            System.out.println("No real roots");
        }

        scanner.close(); // Close Scanner to free resources
    }
}
