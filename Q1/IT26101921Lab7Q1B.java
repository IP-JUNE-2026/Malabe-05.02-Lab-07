import java.util.Scanner;

public class IT26101921Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            double mark1 = scanner.nextDouble();
            double mark2 = scanner.nextDouble();
            double mark3 = scanner.nextDouble();
            double mark4 = scanner.nextDouble();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average <= 74) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        scanner.close();
    }
}