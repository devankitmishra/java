import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
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

        // Print the duplicate elements in the array
        printDuplicateElements(numbers);

        scanner.close();
    }

    // Method to print the duplicate elements in an array
    private static void printDuplicateElements(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for (int number : array) {
            // If the number is already in uniqueSet, it's a duplicate; add it to duplicateSet
            if (!uniqueSet.add(number)) {
                duplicateSet.add(number);
            }
        }

        // Display the duplicate elements
        if (!duplicateSet.isEmpty()) {
            System.out.println("Duplicate elements in the array:");
            for (int duplicate : duplicateSet) {
                System.out.print(duplicate + " ");
            }
        } else {
            System.out.println("No duplicate elements in the array.");
        }
    }
}
