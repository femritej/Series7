import java.util.Scanner;

public class GradeCalculator {

    // Gets a score from the user
    public static int getScore(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    // Computes the average of three scores
    public static double computeAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Prints a message based on the average
    public static void printReport(double avg) {
        System.out.println("Average score: " + avg);

        if (avg >= 90) {
            System.out.println("Excellent work!");
        } else if (avg >= 70) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practicing!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1 = getScore(input, "Enter score 1: ");
        int s2 = getScore(input, "Enter score 2: ");
        int s3 = getScore(input, "Enter score 3: ");

        double avg = computeAverage(s1, s2, s3);
        printReport(avg);
    }
}
