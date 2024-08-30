import java.util.Scanner;

public class StudentGradeCalculator {

    // Function to calculate letter grade based on numeric score
    public static char calculateGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Function to calculate average of scores
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        
        double[] scores = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the score for subject " + (i + 1) + ":");
            scores[i] = scanner.nextDouble();
        }

        double average = calculateAverage(scores);
        char grade = calculateGrade(average);

        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
