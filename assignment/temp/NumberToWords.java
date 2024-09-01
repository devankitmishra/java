package assignment.temp;
public class NumberToWords {
    public static void main(String[] args) {
        // Example usage:
        int number = 7;
        printBottlesOnTheWall(number);
    }

    // Method to print the bottles on the wall message
    private static void printBottlesOnTheWall(int number) {
        if (number < 0 || number > 9) {
            System.out.println("Invalid input. Please enter a number between 0 and 9.");
            return;
        }

        String numberWord = convertNumberToWord(number);
        String pluralSuffix = (number == 1) ? "" : "s"; // Use "bottle" for 1, "bottles" for other numbers

        System.out.println(numberWord + " green bottle" + pluralSuffix + " standing on the wall");
    }

    // Method to convert a number to its word representation
    private static String convertNumberToWord(int number) {
        switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Invalid";
        }
    }
}
