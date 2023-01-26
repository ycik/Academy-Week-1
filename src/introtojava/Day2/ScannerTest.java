package introtojava.Day2;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		//Input username and press Enter
		System.out.println("Type in your username...");
		userName = myObj.nextLine();
		myObj.close();
		// Print the username
		System.out.println(userName);
	}

}
