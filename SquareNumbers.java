public class SquareNumbers {
    public static void main(String[] args) {
        int count = 0;
        int square = 0;

        while (count < 100) { 
            // Print the first 100 square numbers
            System.out.print(square + " ");

            // Increment count and calculate the next square number
            count++;
            square = square + count + count - 1; // Using the pattern of differences

            // Print 10 numbers per line
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}

