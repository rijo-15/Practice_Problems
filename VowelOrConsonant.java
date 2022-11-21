import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an Alphabet: ");
		
		char a = input.next().charAt(0);
		
		
		switch(a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is a vowel");
			break; 
			
			default: 
				System.out.println("It is not a vowel");
		}

	}
	
	

}
