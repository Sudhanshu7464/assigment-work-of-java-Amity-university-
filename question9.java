import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept integer input from the user
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        int number = 1; // Starting number for Floyd's Triangle

        // Print Floyd's Triangle
        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for each column in the row
                System.out.print(number + " "); // Print the current number
                number++; // Increment the number for the next position
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}