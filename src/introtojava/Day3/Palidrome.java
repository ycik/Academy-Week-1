package introtojava.Day3;
import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// Palindrome: a string that is can read the same backwards as it does forwards
		// set up scanner
		// placeholder string value
		// string value of reversed string <-- check string methods
		Scanner scanner = new Scanner(System.in);
		String reversed = "";
		
		// get input
		System.out.println("Enter a word and see if it is a palidrome");
		String input = scanner.nextLine();
			// if no string methods, I need to create a loop based on string length
		// for loop ( starts at length, break when equal to 0, decrement --)
		for (int i = input.length(); i > 0; i--) {
			// reversed string = reversed string + input.substring(loop variable -1, loop variable); aka append the last character and as the loop continues, it will reduce the number
			//small concern: resource heavy
			reversed = reversed + input.substring((i - 1), i);
			
		}
		
		//check if string is equal to reversed string
		if (input.equals(reversed)) {
			//print boolean? or string? - not sure what output is expected yet
		}
		
		//check if string is equal to reversed string
		if (input.equals(reversed)) {
			System.out.print(input + " is a palidrome! It says " + reversed + " when backwards");
		} else {
            System.out.print(input + " is not a palidrome! It says " + reversed + " when backwards");
		}
        System.out.println(input);
		System.out.println(reversed);
	}

}
