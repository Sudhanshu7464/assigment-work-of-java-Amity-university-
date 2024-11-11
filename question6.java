import java.util.Scanner;

public class SecondLargestFinder {

    // Method to find the second largest number in the array
    public static Integer findSecondLargest(int[] array) {
        if (array.length < 2) {
            return null; // Not enough elements for second largest
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : array) {
            if (largest == null || num > largest) {
                secondLargest = largest; // Update second largest before largest
                largest = num; // Update largest
            } else if (num != largest) {
                if (secondLargest == null || num > secondLargest) {
                    secondLargest = num; // Update second largest if needed
                }
            }
        }

        return secondLargest; // Return the second largest number found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of integers (n) from the user
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        // Create an array to store the integers
        int[] numbers = new int[n];

        // Accept n integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // Store each integer in the array
        }

        // Find and display the second largest number
        Integer secondLargest = findSecondLargest(numbers);
        if (secondLargest != null) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("Not enough unique numbers to determine the second largest.");
        }

        scanner.close(); // Close the scanner
    }
}