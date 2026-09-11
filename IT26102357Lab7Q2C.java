public class IT26102357Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop starts at 5 and decrements down to 1
        for (int i = 5; i >= 1; i--) {
            // Inner loop prints the number 'i', 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
    }
}