package assignment.temp;
public class sumeven {
    public static void main(String []args){
        int a=1234;
        int b=a,s=0,v=0;
        int d;
        d=b%10;
        v=(b%2==0)?d:0;
        s=s+v;
        b=b/10;
        d=b%10;
        v=(d%2==0)?d:0;
        s=s+v;
        d=b/10;
        v=(b%2==0)?d:0;
        s=s+v;
        System.out.println("sum of even digit numbers"+s);
    }
}
