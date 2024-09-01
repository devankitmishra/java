// 1. Write a java program to print your biodata using command line arguments.

package assignment;

public class bioDataUsingCmdLine {
    public static void main(String[] args) {
        String name = args[0];
        String age = args[1];
        String address = args[2];
        String phoneNumber = args[3];

        System.out.println("Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

/*
Sample Output:
java bioDataUsingCmdLine "Ankit Mishra" "22" "Puri, Odisha, India" "9776285287"
Biodata:
Name: Ankit Mishra
Age: 22
Address: Puri, Odisha, India
Phone Number: 9776285287
*/
