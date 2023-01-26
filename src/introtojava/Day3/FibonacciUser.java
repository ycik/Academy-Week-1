package introtojava.Day3;
import java.util.Scanner;

public class FibonacciUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int a = 0;
		int b = 1;
		int c = 0;
		
		//input
		input = scanner.nextInt();
		scanner.close();
		
		//evaluate if positive
		if (input > 0) {
			for(int i = 1; i <= input; i++) {
				if (i == 1) {
					System.out.println(a);
				} else if (i == 2) {
					System.out.println(b);
				} else {
					c = a + b;
					a = b;
					b = c;
					System.out.println(c);
				}
			}	
		} else {
			System.out.println("Cannot display Fibonacci series with this value.");
		}
	}

}
