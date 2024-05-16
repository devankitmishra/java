import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementFrequency {
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

        // Find the frequency of each element using a HashMap
        Map<Integer, Integer> frequencyMap = findElementFrequency(numbers);

        // Display the frequency of each element
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    // Method to find the frequency of each element in an array
    private static Map<Integer, Integer> findElementFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : array) {
            // If the number is already in the map, increment its frequency; otherwise, add it to the map with frequency 1
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }
}
