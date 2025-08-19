import java.util.Scanner;
import java.util.Random;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int score = 0;

            for (int i = 1; i <= 10; i++) {
                int factor1 = random.nextInt(10) + 1; // 1 to 10
                int factor2 = random.nextInt(10) + 1; // 1 to 10
                int correctAnswer = factor1 * factor2;

                System.out.printf("\nProblem %d: What is %d * %d? ", i, factor1, factor2);
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("\nCorrect!");
                    score++;
                } else {
                    System.out.printf("\nIncorrect. The correct answer is %d.\n", correctAnswer);
                }
            }

            System.out.println("\nYour score: " + score + "/10");

            if (score == 10) {
                System.out.println("\n🎉 Congratulations! You've mastered the multiplication tables!");
                break;
            } else {
                System.out.println("\nLet's try again to improve your score!\n");
            }
        }

        scanner.close();
    }
}
