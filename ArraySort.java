import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array
        System.out.print("Enter the number of elements (N): ");
        int N = scanner.nextInt();

        // Create an array to store N numbers
        int[] numbers = new int[N];

        // Input N numbers
        System.out.println("Enter the " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array using Arrays.sort
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
