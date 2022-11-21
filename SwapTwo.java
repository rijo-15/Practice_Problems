import java.util.Scanner;

public class SwapTwo {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter the First num: ");
		
		int a = input.nextInt(); 
		
		System.out.println("Please enter the Second num: ");
		
		int b = input.nextInt(); 
		
		
		System.out.println("Before Swapping First Num: " + a + " Second Num: " + b);
		
		
		
		swap(a,b); 
			
		
	}
	
	static void swap(int a, int b) {
		
	int temp = 0; 
	
	temp = a;
	
	a = b;
	b = temp; 
	
	System.out.println("After swapping First Num: " + a + " Second Num: " + b);
	
	
	
		
	}

}
