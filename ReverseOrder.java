import java.util.Scanner;

public class ReverseOrder {
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

        // Print the elements in reverse order
        System.out.println("Elements in reverse order:");
        printReverseOrder(numbers);

        scanner.close();
    }

    // Method to print the elements in reverse order
    private static void printReverseOrder(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
