import java.util.Scanner;

public class IT26102357Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");

            // Read 4 marks separated by space from a single line
            int mark1 = scanner.nextInt();
            int mark2 = scanner.nextInt();
            int mark3 = scanner.nextInt();
            int mark4 = scanner.nextInt();

            // Calculate total and average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            System.out.println("Average is : " + average);

            // Determine overall grade based on the average
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // Blank line between students
        }

        scanner.close();
    }
}