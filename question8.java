import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept integer input from the user
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Print the inverted triangle of numbers
        for (int i = n; i >= 1; i--) { // Loop for each row starting from n down to 1
            // Print numbers in the current row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " "); // Print numbers from i down to 1
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}