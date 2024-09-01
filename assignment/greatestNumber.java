// 3. Write a java program to find greatest among three numbers using command line arguments.

package assignment;

public class greatestNumber {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int greatest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("Greatest Number: " + greatest);
    }
}

/*
Sample Output:
java GreatestNumber 12 25 7
Greatest Number: 25
*/

