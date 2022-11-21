import java.util.Scanner;

public class BignumThree {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter the First num: ");
		
		int a = input.nextInt(); 
		
		System.out.println("Please enter the Second num: ");
		
		int b = input.nextInt(); 
		
		System.out.println("Please enter the Third num: ");
		
		int c = input.nextInt();
		
		
		
	
		
		bignum(a,b,c);
		
		
		
	}
	
	static void bignum(int a, int b, int c) {
		
		if(a > b && a > c) {
			System.out.println("The Largest num is: " + a );
		}else if(b > a && b > c) {
			System.out.println("The Largest num is: " + b);
		}
		else {
			System.out.println("The Largest num is: " + c);
		}
		
	}

}
