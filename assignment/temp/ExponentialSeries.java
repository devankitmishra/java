package assignment.temp;
import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        double result = evaluateExponentialSeries(x, n);
        System.out.println("Result of the exponential series: " + result);

        scanner.close();
    }

    // Function to evaluate the exponential series
    private static double evaluateExponentialSeries(double x, int n) {
        double sum = 1.0; // First term of the series

        for (int i = 1; i < n; i++) {
            double term = Math.pow(x, i) / factorial(i);
            sum += term;
        }

        return sum;
    }

    // Function to calculate the factorial of a number
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
