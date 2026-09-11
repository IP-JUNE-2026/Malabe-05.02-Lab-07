public class IT26102357Lab7Q2B {
    public static void main(String[] args) {
        // Outer loop for numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " - ");
            
            // Inner loop to print 'i' stars for each line
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}