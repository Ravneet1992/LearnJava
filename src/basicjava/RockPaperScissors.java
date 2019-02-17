package basicjava;

import java.util.Scanner;

public class RockPaperScissors {
	
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Does the playerOne chooses rock, paper or scissors? ");
     String PlayerOne  = input.next();
     System.out.print("Does the playerTwo chooses rock, paper or scissors? ");
     String PlayerTwo  = input.next();
     
     if(PlayerOne.equals("rock")) {
    	 
    	 if(PlayerTwo.equals("scissors")) {
    		 System.out.println("PlayerOne wins");
    		 
    	 } else if(PlayerTwo.equals("paper")) {
    		 System.out.println("PlayerTwo wins");
    		 
    	 } else {
    		 System.out.println("Its a tie!");
    		 
    	 }
     
     
  } else if(PlayerOne.equals("scissors")) {
    	 
    	 if(PlayerTwo.equals("paper")) {
    		 System.out.println("PlayerOne wins");
    		 
    	 } else if(PlayerTwo.equals("rock")) {
    		 System.out.println("PlayerTwo wins");
    		 
    	 } else {
    		 System.out.println("Its a tie!");
    		 
    	 }
     
    	 
   } else {  //(PlayerOne.equals("paper")) {
    	 
    	 if(PlayerTwo.equals("rock")) {
    		 System.out.println("PlayerOne wins");
    		 
    	 } else if(PlayerTwo.equals("scissors")) {
    		 System.out.println("PlayerTwo wins");
    		 
    	 } else {
    		 System.out.println("Its a tie!");
    		 
    	 }
     }
     

	}

}
