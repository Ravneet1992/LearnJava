package basicjava;

import java.util.Scanner;

public class Module1Project {

	static int days;
	static int moneyinUsd;
	static String symbol;
	static double currency;
	static int area;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		method1(input);
		method2(input);
		method3(input);
		method4(input);
		method5(input);
	}

	public static void method1(Scanner input) {
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What is your name? ");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + "," + " where are you travelling to? ");
		String place = input.nextLine();
		System.out.println("Great! " + place + " sounds like a great trip");
		System.out.println("***********");
		System.out.println(" ");
		
	}

	public static void method2(Scanner input) {
		System.out.print("How many days are you going to spend travelling? ");
		days = input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		moneyinUsd = input.nextInt();
		System.out.print("What is the three letter currency symbol for your travel destiantion? ");
		symbol = input.next();
		System.out.print("How many " + symbol + " are there in 1 USD? ");
		currency = input.nextDouble();
		System.out.println(" ");

	}

	public static void method3(Scanner input) {
		System.out.println("If you are travelling for " + days + " days that is the same as " + days * 24 + " hours or "
				+ days * 24 * 60 + " minutes ");
		
		System.out.println("If you are going to spend $" + moneyinUsd + " USD that means per day you can spend up to $"
				+ Math.round((moneyinUsd /14)*100) /100.0+ " USD ");
		
		System.out.println("Your total budget in " + symbol +" is " + currency * moneyinUsd + symbol +" "+ " , which per day is "
			+ Math.round((currency * moneyinUsd) / 14)*100/100.0 +" "+ symbol);
		System.out.println("***********");
		System.out.println(" ");


	}

	public static void method4(Scanner input) {
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		int time = input.nextInt();
		System.out.println("That means that when it is midnight at home it will be "+ ((0+time)%24)+ ":00 in your travel destiantion");
		System.out.println("and when it is noon at home it will be  " + ((12+time)%24) + ":00 ");
		System.out.println("***********");
		System.out.println(" ");

	} 
	public static void method5(Scanner input) {
		System.out.print("What is the square area of your destination country in km2? ");
		area = input.nextInt();
		System.out.println("In miles2 that is " +Math.round (area*0.3861006769)*100/100.0);
		System.out.println("***********");
		System.out.println(" ");
		
	}

}
