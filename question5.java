import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept integer input from the user
        System.out.print("Enter the number of terms (n) for Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Create an array to store the Fibonacci sequence
        int[] fibonacci = new int[n];

        // Generate the Fibonacci sequence
        if (n >= 1) {
            fibonacci[0] = 0; // First term
        }
        if (n >= 2) {
            fibonacci[1] = 1; // Second term
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Calculate the next term
        }

        // Print the Fibonacci sequence
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + (i < n - 1 ? ", " : "")); // Print with comma
        }
        
        System.out.println(); // New line after printing the sequence

        scanner.close(); // Close the scanner
    }
}