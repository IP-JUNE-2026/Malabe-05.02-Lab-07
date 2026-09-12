import java.util.Scanner;

public class IT26102317Lab7Q3 {
    public static void main(String[] args) {
        final int NUMBER_OF_CUSTOMERS = 5;
        final double DISCOUNT_RATE = 0.05;
		
        Scanner input = new Scanner(System.in);

        for (int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++) {
            System.out.println("Customer " + customerCount);
            
            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().toUpperCase().charAt(0);

            if (paymentMode == 'C') {
                double discount = billAmount * DISCOUNT_RATE;
                double amountToPay = billAmount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
				
            } else if (paymentMode == 'O') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
				
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}