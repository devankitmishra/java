package methodes;

public class methode_overloading {
    static void foo(){
        System.out.println("Good morning bruh!");
    }
    static void foo(int a){
        System.out.println("Good morning "+a+" bruh!");
    }
    // static void change(int a){
    //     a=98;
    // }
    // static void change2(int [] arr){
    //     arr[0]=98;
    // }
    
    // static void telljoke(){
    //     System.out.println("I invented a new world!\n"+
    //             "Plagiarism!");
    // }
    public static void main(String[] args) {
        // telljoke();
        
        // CASE 1:changing an int 
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running xhange is - "+x);

        // CASE 2:changing the Array
        // int [] marks = {52,73,77,89,98,94};
        // change2(marks);
        // System.out.println("The value of x after running change is: "+marks[0]);

        //METHODE OVERLOADING
        foo();
        foo(200);

    }
}
