package assignment.temp;
import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        // Create an array to store N numbers
        int[] numbers = new int[N];

        // Input N numbers
        System.out.println("Enter the " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and print the second smallest number
        int secondSmallest = findSecondSmallest(numbers);
        System.out.println("The second smallest number is: " + secondSmallest);

        scanner.close();
    }

    // Method to find the second smallest number in an array
    private static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
            return -1;
        } else {
            return secondSmallest;
        }
    }
}
