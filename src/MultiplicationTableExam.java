import java.util.Scanner; // For reading user input
import java.util.Random;  // For generating random numbers

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        Random random = new Random();             // Create Random object

        while (true) { // Loop until the user gets a perfect score
            int score = 0; // Initialize score for each round

            // Loop through 10 multiplication problems
            for (int i = 1; i <= 10; i++) {
                int factor1 = random.nextInt(10) + 1; // Random number between 1 and 10
                int factor2 = random.nextInt(10) + 1; // Random number between 1 and 10
                int correctAnswer = factor1 * factor2;

                // Ask the user the multiplication question
                System.out.printf("\nProblem %d: What is %d * %d? ", i, factor1, factor2);
                int userAnswer = scanner.nextInt();

                // Check the user's answer
                if (userAnswer == correctAnswer) {
                    System.out.println("\nCorrect!");
                    score++; // Increase score for correct answer
                } else {
                    System.out.printf("\nIncorrect. The correct answer is %d.\n", correctAnswer);
                }
            }

            // Display the user's score
            System.out.println("\nYour score: " + score + "/10");

            // Check if the user got all answers correct
            if (score == 10) {
                System.out.println("\n🎉 Congratulations! You've mastered the multiplication tables!");
                break; // Exit the loop
            } else {
                System.out.println("\nLet's try again to improve your score!\n");
            }
        }

        scanner.close(); // Close Scanner to free resources
    }
}
