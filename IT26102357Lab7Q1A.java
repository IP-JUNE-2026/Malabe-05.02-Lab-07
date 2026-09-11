import java.util.Scanner;

public class IT26102357Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Enter marks for four subjects:");

        // Loop to get 4 subject marks
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            double mark = scanner.nextDouble();
            total += mark;
        }

        // Calculate average mark
        double average = total / 4;

        // Determine grade based on average
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display average and assigned grade
        System.out.println("\nAverage is : " + average);
        System.out.println("Overall Grade is : " + grade);

        scanner.close();
    }
}