import java.util.Scanner;

public class IT26102357Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            // Handle payment mode logic
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * 0.05;
                double amountToBePaid = totalBill - discount;
                
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } 
            else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
            } 
            else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); // Blank line between customers
        }

        scanner.close();
    }
}