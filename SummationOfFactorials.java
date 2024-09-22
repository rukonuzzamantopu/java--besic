import java.util.Scanner;

public class SummationOfFactorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n = ");
        int n = scan.nextInt();
        scan.close(); // Closing the scanner

        int sum = 0;
        
        // Loop through each number from 1 to n
        for (int i = 1; i <= n; i++) {
            int fact = 1;

            // Calculate the factorial of i
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }

            // Add the factorial of i to the sum
            sum += fact;
        }

        System.out.println("Summation of factorials from 1 to " + n + " = " + sum);
    }
}
