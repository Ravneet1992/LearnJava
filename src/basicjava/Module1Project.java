package basicjava;

import java.util.Scanner;

public class Module1Project {

	static int days;
	static int moneyinUsd;
	static double currency;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		method1(input);
		method2(input);
		method3(input);
		method4(input);
	}

	public static void method1(Scanner input) {
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What is your name? ");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + "," + " where are you travelling to? ");
		String place = input.nextLine();
		System.out.println("Great! " + place + " sounds like a great trip");
		System.out.println("***********");
	}

	public static void method2(Scanner input) {
		System.out.print("How many days are you going to spend travelling? ");
		days = input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		moneyinUsd = input.nextInt();
		System.out.print("What is the three letter currency symbol for your travel destiantion? ");
		String letter = input.next();
		System.out.print("How many MXC are there in 1 USD? ");
		currency = input.nextDouble();
		System.out.println();
		System.out.println();

	}

	public static void method3(Scanner input) {
		System.out.println("If you are travelling for " + days + " days that is the same as " + days * 24 + " hours or "
				+ days * 24 * 60 + " minutes ");
		System.out.println("If you are going to spend $" + moneyinUsd + " USD that means per day you can spend up to $"
				+ String.format("%.2f", ((double) moneyinUsd / 14)) + " USD ");
		System.out.println("Your total budget in MXC is " + currency * moneyinUsd + "MXC, which per day is "
				+ String.format("%.2f", ((currency * moneyinUsd) / 14)) + " MXC");
		System.out.println("***********");
		System.out.println();
		System.out.println();

	}

	public static void method4(Scanner input) {
		System.out.print("What is the time difference, in hours, between your home and your destination ");
		int time = input.nextInt();
		System.out.println("That means that when it is midnight at home it will be in your travel destiantion");
		System.out.print("and when it is noon at home it will be  ");

	}

}
