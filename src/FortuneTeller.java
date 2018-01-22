import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// variables used
		String firstName;
		String lastName;
		int age;
		int month;
		String favColor;
		int siblings;
		int yrsToRetirement;
		String retireHome = null;
		String retireCar = null;
		double bankMoney;

		// questioning sectioning

		System.out.println("Hello, I'm going to attempt to tell you your future, what is your first name?");
		firstName = input.nextLine();
		System.out.println("What is your Last name?");
		lastName = input.nextLine();
		System.out.println("How old are you?");
		age = input.nextInt();
		input.nextLine();
		System.out.println("What month were you born in 1 through 12?");
		month = input.nextInt();
		input.nextLine();
		System.out.println("What is your favorite ROYGBIV color? If you need help, type Help");
		favColor = input.nextLine();
		while (favColor.equalsIgnoreCase("help")) {
			System.out.println("pick either red, orange, yellow, green, blue, indigo, or violet.");
			favColor = input.nextLine();
		}
		System.out.println("How many siblings do you have?");
		siblings = input.nextInt();

		if (siblings == 0) {
			retireHome = "Tempe, AZ";
		} else if (siblings == 1) {
			retireHome = "San Diego, CA";
		} else if (siblings == 2) {
			retireHome = "Key West, FL";
		} else if (siblings == 3) {
			retireHome = "Nashville, TN";
		} else if (siblings >= 4) {
			retireHome = "Phoenix, AZ";
		} else if (siblings < 0) {
			retireHome = "Juarez, Mexico";
		}

		// to figure out retirement age
		{
			if (age % 2 == 0)
				yrsToRetirement = 20;
			else
				yrsToRetirement = 23;
		}
		// bank balance section
		switch (month) {
		case 1:
		case 2:
		case 3:
		case 4:
			bankMoney = 379450.12;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			bankMoney = 421163.19;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			bankMoney = 3415321.73;
			break;
		default:
			bankMoney = 0.00;
		}
		input.nextLine();

		// last but not least, what kind of car do they get

		if (favColor.equalsIgnoreCase("red")) {
			retireCar = "Ford Mustang";
		} else if (favColor.equalsIgnoreCase("orange")) {
			retireCar = "Ford F150";
		} else if (favColor.equalsIgnoreCase("yellow")) {
			retireCar = "Volkswagen Bug";
		} else if (favColor.equalsIgnoreCase("green")) {
			retireCar = "Toyota Prius";
		} else if (favColor.equalsIgnoreCase("blue")) {
			retireCar = "Chevy Cruze";
		} else if (favColor.equalsIgnoreCase("indigo")) {
			retireCar = "Tesla Model S";
		} else if (favColor.equalsIgnoreCase("violet")) {
			retireCar = "Honda CRV";
		}

		System.out.println(firstName.substring(0, 1).toUpperCase() + (firstName.substring(1).toLowerCase()) + " "
				+ (lastName.substring(0, 1).toUpperCase()) + (lastName.substring(1).toLowerCase())
				+ " you will retire in " + yrsToRetirement + " years with $" + bankMoney
				+ " in the bank, a lovely estate in " + retireHome + " and drive a sweet " + retireCar + ".");
		System.out.println("Thank you so much for giving me a purpose!");

		input.close();
	}

}
