package basicjava;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.print("What is your overall grade? ");
		int grade  = input.nextInt();

		if(grade>60) {
			System.out.println("Admitted");
		} else if(grade>40 ){
			System.out.println(" In waiting list");
		} else {
			System.out.println("Sorry! Try next time.");



		}

		input.close();
	}

}
