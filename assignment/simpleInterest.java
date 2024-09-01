// 2. Write a java program to find simple interest using command line arguments.

package assignment;

public class simpleInterest {
    public static void main(String[] args) {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + interest);
    }
}

/*
Sample Output:
java SimpleInterest 10000 5 2
Simple Interest: 1000.0
*/

