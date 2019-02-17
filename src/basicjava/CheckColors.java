package basicjava;

import java.util.Scanner;

public class CheckColors {
	
     public static void main(String[] args) {
    	 Scanner input  = new Scanner(System.in);
		 System.out.print("What color do you want? ");
		 String color = input.next();
		 if((color.equals("R")) || (color.equals("r"))) {
			System.out.println("You have chosen Red.");
		} else if((color.equals("B")) || (color.equals("b"))) {
			System.out.println("You have chosen Blue.");
		} else if((color.equals("G")) || (color.equals("g"))) {
			System.out.println("You have chosen Green.");
		} else {
			System.out.println("Unknown color: " + color);
		}
		
		
		input.close();
	}

}
