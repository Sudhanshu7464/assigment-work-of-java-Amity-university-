import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDigitSum {

    // Method to calculate factorial
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        String numberStr = number.toString();
        
        for (char digit : numberStr.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            BigInteger factorialResult = factorial(number);
            System.out.println("Factorial of " + number + " is: " + factorialResult);
            
            // Calculate sum of digits
            int digitSum = sumOfDigits(factorialResult);
            System.out.println("Sum of the digits of " + number + "! is: " + digitSum);
        }

        scanner.close();
    }
}