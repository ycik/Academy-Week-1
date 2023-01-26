package introtojava.Day4;

public class PrintCertainValuesofArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		for (int x = 0; x < arr.length; x++) {
			if (x % 2 != 0) {
				continue;
			}
			System.out.println(arr[x]);
		}
	}

}
