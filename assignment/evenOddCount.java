// 7. WAP to find total number of even and odd numbers available in an array of user-defined numbers of elements using command line arguments

package assignment;

public class evenOddCount {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}

/*
Sample Output:
java evenOddCount 1 2 3 4 5 6 7 8
Total Even Numbers: 4
Total Odd Numbers: 4
*/

