package introtojava.Day2;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner = new Scanner(System.in);
		
		//prompt user for input and use nextInt()
		System.out.println("Type in a number... (press Enter to send)");
		num = scanner.nextInt();
		scanner.close();
		
		//if even or odd (modulo), print output
		if (num > 0) {
			System.out.println("Positive!");
		} else if (num == 0) {
            System.out.println("Output is 0!");
        } else {
			System.out.println("Negative!");
		}
		

	}

}
