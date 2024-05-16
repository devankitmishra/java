package typecasting;

// public class explicit_typecast {
//     public static void main(String [] args){
//         double a = 10.5; //8 bytes
//         int b=(int)a;    //4 bytes
//         System.out.println(b);
//     }
// }

class Parent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child");
    }
    void showChild(){
        System.out.println("Child class unique method");
    }
}

public class explicit_typecast{
    public static void main(String []aStrings) {
        Parent obj1 = new Child();
        // obj1.show();
        Child obj2 =(Child)obj1;
        obj2.showChild();
        obj2.show(); 
        
    }
}