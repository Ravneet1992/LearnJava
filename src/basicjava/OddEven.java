package basicjava;

import java.util.Scanner;

public class OddEven {
	

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.print("Type a number: ");
		int number = input.nextInt();
	
	if (number%2==0) {
		System.out.println("even ");
	}
		else {
		System.out.println("odd ");
	}
	
	 input.close();
		
	}
	
}


