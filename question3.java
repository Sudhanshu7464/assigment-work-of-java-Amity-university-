import java.util.Scanner;

public class MenuDrivenCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            // Variables to hold the operands
            double num1, num2;

            // Switch case to perform the chosen operation
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            if (choice == 1) {
                // Addition
                double result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            } else if (choice == 2) {
                // Subtraction
                double result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            } else if (choice == 3) {
                // Multiplication
                double result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            } else if (choice == 4) {
                // Division
                if (num2 != 0) {
                    double result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
            }

            System.out.println(); // Print a blank line for better readability

        } while (choice != 5); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner
    }
}