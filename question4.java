import java.util.Scanner;

public class PalindromeChecker {

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString(); // Reverse the string using StringBuilder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept string input from the user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine(); // Read the input string

        // Remove spaces and convert to lowercase for accurate palindrome check
        String cleanedInput = original.replaceAll("\\s+", "").toLowerCase();
        
        // Call the method to reverse the string
        String reversed = reverseString(cleanedInput);

        // Check if the original cleaned string is equal to the reversed string
        if (cleanedInput.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

        scanner.close(); // Close the scanner
    }
}