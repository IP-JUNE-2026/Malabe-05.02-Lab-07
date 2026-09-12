import java.util.Scanner;

public class IT26102361Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter total bill amount for customer " + i + ": ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {

                double discount = bill * 0.05;
                double amountToPay = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (mode == 'O' || mode == 'o') {

                double discount = 0;
                double amountToPay = bill;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}