package javacafeprogram;
import java.util.Scanner;
public class JavaCafeProgram 
{
	public static void main(String[]args)
	{
		Scanner myScanner=new Scanner(System.in);
		String username;
		String password;
		
		System.out.println("Please enter username");
		String username=myScanner. nextLine();
		System.out.println("Please enter password");
		String password=myScanner. nextLine();
		Scanner KeyIn=new Scanner(System.in);
		if(username.equals(username)&&password.equals(password))
		{
			System.out.println("Welcome"+username+" to LeShishi Cafe System");
			System.out.println("For Breakfast enter A"+ "\nFor Lunch enter B"+"\nFor Dinner enter C");
		}
		else
		{
			System.out.println("Get out Of Here...");
			String choice = myScanner.next();
			int choice1=1;
			choice1=myScanner.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("Breakfast Menu");
				String breakfast;
				breakfast=myScanner.nextLine();
				System.out.println("1.Tea");
				System.out.println("2.Coffee");
				System.out.println("3.Chocolate");
				System.out.println("4.Andazi");
				System.out.println("5.Samosa");
				System.out.println("6.Sausage");
				break;
				
			case 2:
				System.out.println("Lunch Menu");
				System.out.println("1.Pilau");
				System.out.println("2.Chips");
				System.out.println("3.Fish");
				System.out.println("4.Chicken");
				break;
				
			case 3:
				System.out.println("Dinner Menu");
				System.out.println("1.Ugali");
				System.out.println("2.Sukuma Wiki");
				System.out.println("3.Meat");
				break;
				
				default:
				System.out.println("Wrong Choice...Item Does Not Exist");
				
					
				
				
				
			}
			
		}
		
	}
}
