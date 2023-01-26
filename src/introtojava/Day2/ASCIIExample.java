package introtojava.Day2;
import java.util.Scanner;

public class ASCIIExample {

	public static void main(String[] args) {
		//char and int variables
		Scanner scanner = new Scanner(System.in);
		String input;
		int asciiValue;
		
		//get ascii value of input
		input = scanner.nextLine();
		char character = input.charAt(0);
		asciiValue = character;
		
		//print asciiValue
		System.out.println("ASCII value of " + character + " is: " + asciiValue);
	}

}
