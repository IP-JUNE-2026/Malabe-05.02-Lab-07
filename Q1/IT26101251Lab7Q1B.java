import java.util.Scanner;

public class IT26101251Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.print("Student " + student);
            System.out.print("Enter marks: ");

            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            String grade;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else if (average >= 40) {
                grade = "Pass";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        input.close();
    }
}