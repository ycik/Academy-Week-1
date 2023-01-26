package introtojava.Day2;

public class Fibonacci {

	public static void main(String[] args) {
		//define a,b,c
		int a = 0;
		int b = 1;
		int c = 0;
		
		//state the first two numbers, if a and b is 0 and 1
		if (a == 0 && b == 1 ) {
			System.out.println(a);
			System.out.println(b);
		}	
		
		//while c is less than or equal to 34
		while (c != 34) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
