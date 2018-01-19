import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello what is your First name?");
		String firstName = input.nextLine();
		System.out.println("What is your Last name?");
		String lastName = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("What month were you born in 1 through 12?");
		int month = input.nextInt();
		input.nextLine();
		System.out.println("What is your favorite ROYGBIV color? If you need help, type Help");
		String FavColor = input.nextLine();
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		System.out.println("Hello " + firstName + lastName + "");
		{
			if (age % 2 ==0)	
				System.out.println("will retire in 20 years");
			else 
				System.out.println("will retire in 23 years");
		}
		{	
			if (month <= 4)	
				System.out.println("you will have $379,450.12 in bank account");
				else if (month <= 8)
				System.out.println("you will have $421,163.19 in bank account");
				else if (month <= 12)
				System.out.println("you will have 3,415,321.73 in bank account");
				else if (month >= 13)
					System.out.println("you will be broke as a joke");
			
		}
		{
			if (siblings == 0)
				System.out.println("you will vacation in Tempe, AZ");
			else if (siblings == 1)
				System.out.println("you will vacation in San Diego, CA");
			else if (siblings == 2)
				System.out.println("you will vacation in Key West, FL");
			else if (siblings == 3)
				System.out.println("you will vacation in Nashville, TN");
			else if (siblings >= 4)
				System.out.println("you will vacation in Pheonix, AZ");
			else if (siblings < 0)
				System.out.println("you will vacation in Juarez, Mexico");
		}
		if ( FavColor == "red")
			System.out.println("you will drive a Mustang");
			
		
		input.close();
	}

}
