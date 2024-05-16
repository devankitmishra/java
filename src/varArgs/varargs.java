package varArgs;

public class varargs {
    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }
    static int sum(int...arr){
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcom to varargs Tutorial");
        // int a;
        // int b;
        // int c;
        // int d;
        // System.out.println("The sum of 4 and 5 is "+ sum(a = 4, b = 5));
        // System.out.println("The sum of 4 ,3 and 5 is "+ sum(a=4,b=3,c=5));
        // System.out.println("The sum of 4 ,3 ,5 and 6 is "+ sum(a=4,b=3,c=5,d=6));
        System.out.println("The sum of Nothing is "+ sum());
        System.out.println("The sum of 1 is "+ sum(1));
        System.out.println("The sum of 4 and 5 is "+ sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is "+ sum(4, 3, 5));
        System.out.println("The sum of 4, 3, 5 and 6 is "+ sum(4, 3, 5, 6));

    }
}





// class calculate {

//     static int add(int ...arr){
//         int result = 0;
//         for (int a : arr){
//             result = result + a;
//         }
//         return result;
// }

// public static void main(String[] args){
//     System.out.println(add(1,2));
//     System.out.println(add(2,3,4));
//     System.out.println(add(4,5,6));
// }
// }
