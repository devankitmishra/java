package arrays;

import java.util.Scanner;

public class arrays{
    public static void main(String[] args) {


            /* Class room of 500 students - you have to store marks of these 500 students*/
           
           
                    // int [] marks;        //declaration
                    // marks = new int[5];  //memory allocation


            // int [] marks = new int [5];  //declartion + memory allocation
           
           
            // marks[0] = 100;  // initialige
            // marks[1] = 68;
            // marks[2] = 78;
            // marks[3] = 98;
            // marks[4] = 86;


        //     int [] marks = {188,78,99,178,90}; // declaration + initialigation
        // System.out.println(marks[3]);

        int size,i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array ");
            size = sc.nextInt();
            

            int a[] = new int [size];
            for(i=0;i<size;i++){
                a[i]=sc.nextInt();

            }
            // sc.close();

            System.out.println("Printed array elements ");
            for(i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
        }

        
        

    }
}