// 6. Write a java program to find sum and carry of any 2 numbers following approach and bitwise operator

package assignment;

public class adderCircuits {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // a) Half Adder Circuit
        int sumHalfAdder = a ^ b;
        int carryHalfAdder = a & b;

        // b) Full Adder Circuit
        int carryIn = Integer.parseInt(args[2]);
        int sumFullAdder = (a ^ b) ^ carryIn;
        int carryFullAdder = (a & b) | (b & carryIn) | (carryIn & a);

        System.out.println("Half Adder - Sum: " + sumHalfAdder + ", Carry: " + carryHalfAdder);
        System.out.println("Full Adder - Sum: " + sumFullAdder + ", Carry: " + carryFullAdder);
    }
}

/*
Sample Output:
java adderCircuits 1 0 1
Half Adder - Sum: 1, Carry: 0
Full Adder - Sum: 0, Carry: 1
*/

