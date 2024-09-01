package assignment.temp;
//  wap to find sum of all even digits of any 4 digit number using conditional operator

class sumOfEven {
    public static void main(String[] args) {
        int n = 1234;
        
        // Extract each digit
        int digit1 = n / 1000;            // First digit
        int digit2 = (n / 100) % 10;      // Second digit
        int digit3 = (n / 10) % 10;       // Third digit
        int digit4 = n % 10;              // Fourth digit
        
        // Calculate sum of even digits using conditional operator
        int sumOfEvenDigits = (digit1 % 2 == 0 ? digit1 : 0) +
                              (digit2 % 2 == 0 ? digit2 : 0) +
                              (digit3 % 2 == 0 ? digit3 : 0) +
                              (digit4 % 2 == 0 ? digit4 : 0);
        
        System.out.println("Sum of even digits is " + sumOfEvenDigits);
    }
}


