import java.util.Scanner;

public class SummationOfOddFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n = ");
        int n = scan.nextInt();
        scan.close(); // Closing the scanner

        int sum = 0;

        // Loop through numbers from 1 to n, only considering odd numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if i is odd
                int fact = 1;

                // Calculate the factorial of the odd number
                for (int j = 1; j <= i; j++) {
                    fact *= j;
                }

                // Add the factorial of the odd number to the sum
                sum += fact;
            }
        }

        System.out.println("Summation of factorials of odd numbers up to " + n + " = " + sum);
    }
}

