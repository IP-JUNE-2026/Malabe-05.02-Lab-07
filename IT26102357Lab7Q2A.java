public class IT26102357Lab7Q2A {
    public static void main(String[] args) {
        // Outer loop for 4 rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for 5 columns
            for (int j = 1; j <= 5; j++) {
                System.out.print("$ ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}