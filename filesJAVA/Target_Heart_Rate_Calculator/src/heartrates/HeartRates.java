package heartrates;
import java.util.Scanner;


import heartrates.Constructor;
public class HeartRates
{
	public static void main(String[]args)
	{
	Scanner myScanner=new Scanner(System.in);
	String firstName;
	String lastName;
	int yearOfBirth;
	int currentYear=2017;
	int dateOfBirth;
	int age;
	String monthOfBirth="";
	
	System.out.println("Please Enter firstName");
	firstName = myScanner.nextLine();
	System.out.println("Please Enter lastName");
	 lastName= myScanner.nextLine();
		System.out.println("Please Enter Year of Birth");
		 yearOfBirth= myScanner.nextInt();
			System.out.println("Please Enter Current Year");
			 currentYear= myScanner.nextInt();
				System.out.println("Please Enter Date Of Birth");
				 dateOfBirth= myScanner.nextInt();
				 System.out.println("Please Enter Month of Birth");
				 monthOfBirth=myScanner.nextLine();
				  age=currentYear-yearOfBirth;
				  System.out.println("Your age is "+age);
				

					Constructor person1=new Constructor();
					person1.setFirstName("Sheila");
					person1.setLastName(" Mwaura");
					person1.setYearOfBirth(89);
					System.out.println("The account Balance is "+person1.getFirstName());
					System.out.println("The account Holders Name is "+person1.getLastName());
					System.out.println("The account Pin is "+person1.getYearOfBirth());
					System.out.println("The account Pin is "+person1.getDateOfBirth());
					System.out.println("The account Pin is "+person1.getMonthOfBirth());
	}

	
}
