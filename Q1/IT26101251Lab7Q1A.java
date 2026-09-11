import java.util.Scanner;

public class IT26101251Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = 4;
        double totalMarks = 0;

        System.out.println("Enter marks for four subjects:");

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            double mark = scanner.nextDouble();
            totalMarks += mark;
        }

        double average = totalMarks / numberOfSubjects;

        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else if (average >= 0 && average < 50) {
            grade = "Fail";
        } else {
            grade = "Invalid Marks"; 
        }

        System.out.println("\nAverage is : " + average);
        System.out.println("Overall Grade is : " + grade);

        scanner.close();
    }
}