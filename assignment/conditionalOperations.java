// 5. Write a java program to find following using conditional operator and without using looping and decision making

package assignment;

public class conditionalOperations {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        // a) Sum of all even digits of any 4 digit number
        int sumEvenDigits = (d1 % 2 == 0 ? d1 : 0) + (d2 % 2 == 0 ? d2 : 0) + (d3 % 2 == 0 ? d3 : 0) + (d4 % 2 == 0 ? d4 : 0);

        // b) Sum of all odd digits of any 4 digit number
        int sumOddDigits = (d1 % 2 != 0 ? d1 : 0) + (d2 % 2 != 0 ? d2 : 0) + (d3 % 2 != 0 ? d3 : 0) + (d4 % 2 != 0 ? d4 : 0);

        // c) Difference between average of all even digits except divisible by 4 and
        // average of all odd digits except divisible by 3
        double avgEvenEx4 = ((d1 % 2 == 0 && d1 % 4 != 0 ? d1 : 0) + (d2 % 2 == 0 && d2 % 4 != 0 ? d2 : 0) +
                (d3 % 2 == 0 && d3 % 4 != 0 ? d3 : 0) + (d4 % 2 == 0 && d4 % 4 != 0 ? d4 : 0)) / 4.0;

        double avgOddEx3 = ((d1 % 2 != 0 && d1 % 3 != 0 ? d1 : 0) + (d2 % 2 != 0 && d2 % 3 != 0 ? d2 : 0) +
                (d3 % 2 != 0 && d3 % 3 != 0 ? d3 : 0) + (d4 % 2 != 0 && d4 % 3 != 0 ? d4 : 0)) / 4.0;

        double diffAvg = avgEvenEx4 - avgOddEx3;

        // d) Sum of product of consecutive even digits of any 4 digit number
        int sumProductConsecutiveEvenDigits = (d1 % 2 == 0 && d2 % 2 == 0 ? d1 * d2 : 0) +
                (d2 % 2 == 0 && d3 % 2 == 0 ? d2 * d3 : 0) +
                (d3 % 2 == 0 && d4 % 2 == 0 ? d3 * d4 : 0);

        // e) Sum of product of consecutive odd digits of any 4 digit number
        int sumProductConsecutiveOddDigits = (d1 % 2 != 0 && d2 % 2 != 0 ? d1 * d2 : 0) +
                (d2 % 2 != 0 && d3 % 2 != 0 ? d2 * d3 : 0) +
                (d3 % 2 != 0 && d4 % 2 != 0 ? d3 * d4 : 0);

        // f) Difference between Sum of product of consecutive even digits except 2
        // and 6 and Sum of product of consecutive odd digits except 3 and 7
        int sumProdEvenEx26 = ((d1 % 2 == 0 && d1 != 2 && d2 != 6 ? d1 * d2 : 0) +
                (d2 % 2 == 0 && d2 != 2 && d3 != 6 ? d2 * d3 : 0) +
                (d3 % 2 == 0 && d3 != 2 && d4 != 6 ? d3 * d4 : 0));

        int sumProdOddEx37 = ((d1 % 2 != 0 && d1 != 3 && d2 != 7 ? d1 * d2 : 0) +
                (d2 % 2 != 0 && d2 != 3 && d3 != 7 ? d2 * d3 : 0) +
                (d3 % 2 != 0 && d3 != 3 && d4 != 7 ? d3 * d4 : 0));

        int diffProd = sumProdEvenEx26 - sumProdOddEx37;

        // g) Sum of product of corresponding even digits of first any digit number and
        // corresponding odd digit of any 4 digit number
        int num2 = Integer.parseInt(args[1]);
        int d1b = num2 / 1000;
        int d2b = (num2 / 100) % 10;
        int d3b = (num2 / 10) % 10;
        int d4b = num2 % 10;
        int sumProdEvenOdd = (d1 % 2 == 0 && d1b % 2 != 0 ? d1 * d1b : 0) +
                (d2 % 2 == 0 && d2b % 2 != 0 ? d2 * d2b : 0) +
                (d3 % 2 == 0 && d3b % 2 != 0 ? d3 * d3b : 0) +
                (d4 % 2 == 0 && d4b % 2 != 0 ? d4 * d4b : 0);

        System.out.println("Sum of all even digits: " + sumEvenDigits);
        System.out.println("Sum of all odd digits: " + sumOddDigits);
        System.out.println("Difference between average of all even digits except divisible by 4 and odd digits except divisible by 3: " + diffAvg);
        System.out.println("Sum of product of consecutive even digits: " + sumProductConsecutiveEvenDigits);
        System.out.println("Sum of product of consecutive odd digits: " + sumProductConsecutiveOddDigits);
        System.out.println("Difference between sum of product of consecutive even digits except 2 and 6 and odd digits except 3 and 7: " + diffProd);
        System.out.println("Sum of product of corresponding even digits of first and odd digits of second number: " + sumProdEvenOdd);
    }
}

/*
Sample Output:
java conditionalOperations 1624 1356
Sum of all even digits: 12
Sum of all odd digits: 1
Difference between average of all even digits except divisible by 4 and odd digits except divisible by 3: 2.0
Sum of product of consecutive even digits: 8
Sum of product of consecutive odd digits: 0
Difference between sum of product of consecutive even digits except 2 and 6 and odd digits except 3 and 7: 0
Sum of product of corresponding even digits of first and odd digits of second number: 0
*/

