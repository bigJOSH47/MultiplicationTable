public class MultiplicationTable {
    public static void main(String[] args) {
        // Outer loop for rows (1 to 12)
        for (int i = 1; i <= 12; i++) {
            // Inner loop for columns (1 to 12)
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + "\t"); // Print product with a tab space
            }
            System.out.println(); // Move to the next row
        }
    }
}