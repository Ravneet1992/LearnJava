package basicjava;

import javax.swing.*;

public class TicketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entry = 0; int noEntry = 0; int count = 0;
		while(count<5) {
			int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age?"));
			if(age>18) {
				System.out.println(age + ": entry");
				entry++;
			} else {
				System.out.println(age + ": no entry");
				noEntry++;
			}
			count++;
		}
		System.out.println(noEntry  + " are not allowed entry");
		System.out.println(entry  + " are  allowed entry");
        System.out.println((entry*20) + "% of testers made into the program");
	}

}
