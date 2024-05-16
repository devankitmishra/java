package bits;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        Scanner sc = new Scanner (System.in);
        int oper = sc.nextInt();
        

    int bitMask = 1<<pos;
    if(oper == 1){
        //set oper
        
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    else{
        //clear
        int newBitMask = (~bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
         
    }
    }
}
