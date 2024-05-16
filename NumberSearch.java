import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of 10 numbers (you can modify these numbers as needed)
        int[] numbers = {5, 12, 8, 3, 20, 15, 7, 10, 25, 18};

        System.out.print("Enter the number to search: ");
        int targetNumber = scanner.nextInt();

        int index = linearSearch(numbers, targetNumber);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }

        scanner.close();
    }

    // Linear search method to find the index of a number in an array
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the number is found
            }
        }
        return -1; // Return -1 if the number is not found
    }
}
