import java.util.Scanner;

public class IT26102361Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.println("Enter 4 subject marks for Student " + student + ":");

            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            String grade;

            if (average >= 75)
                grade = "A";
            else if (average >= 65)
                grade = "B";
            else if (average >= 55)
                grade = "C";
            else if (average >= 45)
                grade = "D";
            else
                grade = "F";

            System.out.println("Average: " + average);
            System.out.println("Overall Grade: " + grade);
            System.out.println();
        }

        input.close();
    }
}