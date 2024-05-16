package recursion;
import java.util.Scanner;

public class CALCULATOR {

	public static void main(String[] args) {
	    calculator();
		
	}
	static void calculator(){
		
    Scanner sc = new Scanner (System.in);
		
		System.out.println("ENTER FIRST NUMBER ");
		int a = sc.nextInt();
		
		System.out.println("ENTER SECOND NUMBER ");
		int b = sc.nextInt();
		
		System.out.println("ENTER THE OPERATION ");
		
		// sc.nextLine();
		char operation = sc.next().charAt(0);
		
		int result = 0;
		switch(operation) {
		case '+' :
			result = a+b;
			break;
		case '-' :
			result = a-b;
			break;
		case '*' :
			result = a*b;
			break;
		case '/' :
			result = a/b;
			break;
		case '%' :
			result = a%b;
			break;
			
			
			default :
				System.out.println("INVALID OPERATION");
		}
    System.out.println("THE RESULT IS "+result);
    System.out.println("DO U WANT TO CONTINUE...(Y/N)");
	    
	    char input = sc.next().charAt(0);
	    if(input == 'Y') {
	    		
		calculator();
	    }
		if(input == 'N'){
			System.out.println("FUCK OFF");
		}
		else{
			System.out.println("WHAT THE FUCK U ENTERED MF!");
		}
      sc.close();
		
	}

}