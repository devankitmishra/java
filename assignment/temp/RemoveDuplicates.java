package assignment.temp;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
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

        // Remove duplicates using a Set
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Display the array without duplicates
        System.out.println("Array without duplicates:");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    // Method to remove duplicates from an array using a Set
    private static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int number : array) {
            uniqueSet.add(number);
        }

        // Convert the Set back to an array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int number : uniqueSet) {
            uniqueArray[index++] = number;
        }

        return uniqueArray;
    }
}
