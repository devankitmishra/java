// 8. WAP to find sum and average of user-defined number of elements using command line arguments

package assignment;

public class sumAndAverage {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        double average = sum / (double) args.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

/*
Sample Output:
java SumAndAverage 10 20 30 40
Sum: 100
Average: 25.0
*/

