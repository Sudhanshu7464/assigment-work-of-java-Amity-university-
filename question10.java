import java.util.Scanner;

public class CharacterCount {

    // Method to count occurrences of a character in a string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0; // Initialize count to 0
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character matches the specified character
            if (str.charAt(i) == ch) {
                count++; // Increment count if there's a match
            }
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept string input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Accept character input from the user
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // Call the method to count occurrences
        int count = countCharacterOccurrences(inputString, searchChar);

        // Display the result to the user
        System.out.println("The character '" + searchChar + "' occurs " + count + " time(s) in the string.");

        scanner.close(); // Close the scanner
    }
}