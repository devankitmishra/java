// 4. Write a java program to find following without using looping and decision making

package assignment;

public class fourDigitOperations {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        // I. Sum of all digits of any 4 digit number
        int sumAllDigits = d1 + d2 + d3 + d4;

        // II. Find the face value and position value of any 4 digit number
        System.out.println("Face Value of digits: " + d1 + ", " + d2 + ", " + d3 + ", " + d4);
        System.out.println("Position Value of digits: " + (d1 * 1000) + ", " + (d2 * 100) + ", " + (d3 * 10) + ", " + d4);

        // III. Find the value available at position required by user it may be 10, 100, or 1000
        int positionValue = Integer.parseInt(args[1]);
        int digitAtPosition = (num / positionValue) % 10;

        // IV. Sum of product of consecutive digits of any 4 digit number
        int sumProductConsecutiveDigits = (d4 * d3) + (d3 * d2) + (d2 * d1);

        // V. Sum of product of corresponding digits of two 4-digit numbers
        int num2 = Integer.parseInt(args[2]);
        int d1b = num2 / 1000;
        int d2b = (num2 / 100) % 10;
        int d3b = (num2 / 10) % 10;
        int d4b = num2 % 10;
        int sumProductCorrespondingDigits = (d4 * d4b) + (d3 * d3b) + (d2 * d2b) + (d1 * d1b);

        // VI. Find bitwise AND, OR, and XOR of 2nd and 4th digit
        int andResult = d2 & d4;
        int orResult = d2 | d4;
        int xorResult = d2 ^ d4;

        // VII. Left shift, right shift and zero fill of summation of all digits by 3rd digit
        int leftShiftResult = sumAllDigits << d3;
        int rightShiftResult = sumAllDigits >> d3;
        int zeroFillResult = sumAllDigits >>> d3;

        System.out.println("Sum of all digits: " + sumAllDigits);
        System.out.println("Value at position " + positionValue + ": " + digitAtPosition);
        System.out.println("Sum of product of consecutive digits: " + sumProductConsecutiveDigits);
        System.out.println("Sum of product of corresponding digits: " + sumProductCorrespondingDigits);
        System.out.println("Bitwise AND of 2nd and 4th digit: " + andResult);
        System.out.println("Bitwise OR of 2nd and 4th digit: " + orResult);
        System.out.println("Bitwise XOR of 2nd and 4th digit: " + xorResult);
        System.out.println("Left shift of sum of all digits: " + leftShiftResult);
        System.out.println("Right shift of sum of all digits: " + rightShiftResult);
        System.out.println("Zero fill right shift of sum of all digits: " + zeroFillResult);
    }
}

/*
Sample Output:
java FourDigitOperations 1234 100 5678
Face Value of digits: 1, 2, 3, 4
Position Value of digits: 1000, 200, 30, 4
Sum of all digits: 10
Value at position 100: 2
Sum of product of consecutive digits: 20
Sum of product of corresponding digits: 70
Bitwise AND of 2nd and 4th digit: 0
Bitwise OR of 2nd and 4th digit: 6
Bitwise XOR of 2nd and 4th digit: 6
Left shift of sum of all digits: 80
Right shift of sum of all digits: 1
Zero fill right shift of sum of all digits: 1
*/

