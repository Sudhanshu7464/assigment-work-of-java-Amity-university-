import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept integer input from the user
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Print the pyramid of numbers
        for (int i = 1; i <= n; i++) { // Loop for each row
            // Print leading spaces for pyramid shape
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Print spaces
            }
            // Print numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print numbers from 1 to i
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}