import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter a number");
		
		int a = input.nextInt(); 
		
		evenOrOdd(a); 
		
		

	}
	
	static void evenOrOdd(int a) {
		
		if(a % 2 == 0) {
			System.out.println(a + " is an even Number");
		}else {
			System.out.println(a + " is an odd Number");
		}
		
	}

}
