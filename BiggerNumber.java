import java.util.Scanner;

public class BiggerNumber {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter the First num: ");
		
		int a = input.nextInt(); 
		
		System.out.println("Please enter the Second num: ");
		
		int b = input.nextInt(); 
		
	
		
		bignum(a,b);
		
		
		
	}
	
	static void bignum(int a, int b) {
		
		if(a > b) {
			System.out.println("The Largest num is: " + a );
		}else {
			System.out.println("The Largest num is: " + b);
		}
		
	}

}
