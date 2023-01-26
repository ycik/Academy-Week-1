package introtojava.Day2;
import java.util.Scanner;

public class FactorialChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int product = 1;
		
		//set up Scanner
		System.out.println("Enter a number and I'll give out the factorial of that number");
		input = scanner.nextInt();
		scanner.close();
		
		//set up loop; assuming 0 and no negatives are used
		for (int m = input; m != 0; m-- ) {
			//factorial calc
			product = product * m;
		}
		//print product
		System.out.println(product);
	}

}
