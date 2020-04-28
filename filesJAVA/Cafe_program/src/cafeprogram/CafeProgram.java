package cafeprogram;
import java.util.Scanner;
public class CafeProgram 
{
	static  int meals;
	static String username;
	static String password;
	static int wrongEntries=3;
	static Scanner myScanner=new Scanner(System.in);
	static int breakfastItems;
	static int tea=10;
	static int coffee=15;
	static int uji=20;
	static int samosa=25;
	static int andazi=20;
	static int bill=0;
	static int choice=0;
	static int lunchItems;
	static int pilau=70;
	static int chapati=30;
	static int chips=100;
	static int dinnerItems;
	static int ugali=50;
	static int rice=30;
	static int fish=140;
	static int chicken=150;

	public static void main(String[]args)
	{
		Entries();
		LogIn();
	}
	
	public static void Entries()
	{
		System.out.println("Please enter username");
		username=myScanner.nextLine();
		System.out.println("Please enter password");
		password=myScanner.nextLine();
	}
		public static void LogIn()
		{
			if(username.equals("Sheila")&&password.equals("Nangila"))
			{
				System.out.println("Welcome "+username+" to our Cafe System");
				meals();
			}
			else
			{
				while(wrongEntries>1)
					wrongEntries--;
				System.out.println("Wrong Username and Password.You have "+wrongEntries+" attempts remaining.");
				Entries();
			}
			System.out.println("System Locked");
		}
		public static void meals()
		{
			System.out.println("Please pick a choice from the Menu below");
			System.out.println("1.Breakfast \n2.Lunch \n3.Dinner");
			meals=myScanner.nextInt();
			mealCategory();
		}
		
		private static void mealCategory()
		{
			switch(meals)
		{
			case 1:
				breakfast();
				break;
			case 2:
				lunch();
				break;
			case 3:
				dinner();
				break;
				default:
					System.out.println("Wrong Meal Choice");
		}
					
		}
		private static void breakfast()
		{
			System.out.println("...You have chosen the Breakfast Menu...Please make a choice from the list below ");
			listItems();
			breakfastItems=myScanner.nextInt();
			switch(breakfastItems)
			{
			case 1:
				System.out.println("You have chosen Tea.Do you want anything else??...\n1.Yes \n2.No");
				bill=bill+tea;
				choice=0;
				choice =myScanner.nextInt();
				chosenOption();
				break;
			case 2:
				System.out.println("You have chosen Coffee.Do you want anything else??...\n1.Yes \n2.No");
				bill=bill+coffee;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption();
				break;
			case 3:
				System.out.println("You have chosen Uji.Do you want anything else??...\n1.Yes \n2.No");
				bill=bill+uji;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption();
				break;
			case 4:
				System.out.println("You have chosen Samosa.Do you want anything else??...\n1.Yes \n2.No");
				bill=bill+samosa;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption();
				break;
			case 5:
				System.out.println("You have chosen Andazi.Do you want anything else??...\n1.Yes \n2.No");
				bill=bill+andazi;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption();
				break;
				default:
					System.out.println("You have made a Wrong Choice");
				
			}
		}
		private static void chosenOption()
		{
			switch(choice)
			{
			case 1:
				yes();
				break;
			case 2:
				no();
				break;
				default:
					System.out.println("Wrong Choice");
			}
		}
		private static void listItems()
		{
			System.out.println("1.Tea Ksh 10 \n2.Coffee Ksh 15 \n3.Uji Ksh 10 \n4.Samosa Ksh 25 \n5.Andazi Ksh 20");
			
		}
		private static void yes()
		{
			breakfast();
		}
		private static void no()
		{
			System.out.println("Your Total Bill is "+bill);
		}
		private static void lunch()
		{
			System.out.println("You have chosen the Lunch Menu....Please make a choice from the list below ");
			listItems2();
			lunchItems=myScanner.nextInt();
			switch(lunchItems)
			{
			case 1:
				System.out.println("You have chosen Pilau.Do you want anything else...\n1.Yes \n2.No");
				bill=bill+pilau;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption2();
				break;
			case 2:
				System.out.println("You have chosen Chapati.Do you want anything else...\n1.Yes \n2.No");
				bill=bill+chapati;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption2();
				break;
			case 3:
				System.out.println("You have chosen Chips.Do you want anything else...\n1.Yes \n2.No");
				bill=bill+chips;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption2
				();
				break;
				default:
					System.out.println("You have made a wrong choice");	
			}
		}
		private static void chosenOption2()
		{
			switch(choice)
			{
			case 1:
				yes2();
				break;
			case 2:
				no2();
				break;
				default:
					System.out.println("Wrong Choice");
					
			}
		}
		private static void listItems2()
		{
			System.out.println("1.Pilau Ksh 70 \n2.Chapati Ksh 30 \n3.Chips Ksh 100");
		}
		private static void yes2()
		{
			lunch();
		}
		private static void no2()
		{
			System.out.println("Your Total Bill is "+bill);
		}
		private static void dinner()
		{
			System.out.println("You have chosen the Dinner Menu...Please pick a choice from the list below");
			listItems3();
			dinnerItems=myScanner.nextInt();
			switch(dinnerItems)
			{
			case 1:
			System.out.println("You have chosen Ugali.Do you want anything else... \n1.Yes \n2.No");
			bill=bill+ugali;
			choice=0;
			choice=myScanner.nextInt();
			chosenOption3();
			break;
			case 2:
				System.out.println("You have chosen Rice.Do you want anything else... \n1.Yes \n2.No");
				bill=bill+rice;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption3();
				break;
			case 3:
				System.out.println("You have chosen Fish.Do you want anything else... \n1.Yes \n2.No");
				bill=bill+fish;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption3();
				break;
			case 4:
				System.out.println("You have chosen Chicken.Do you want anything else... \n1.Yes \n2.No");
				bill=bill+chicken;
				choice=0;
				choice=myScanner.nextInt();
				chosenOption3();
				break;
				default:
					System.out.println("You have made a wrong choice");	
					
			}
		}
		private static void listItems3()
		{
			System.out.println("1.Ugali Ksh 50 \n2.Rice Ksh 30 \n3.Fish Ksh 140 \n4.Chicken Ksh 150");
			
		}
		private static void chosenOption3()
		{
			switch(choice)
			{
			case 1:
				yes3();
				break;
			case 2:
				no3();
				break;
				default:
					System.out.println("Wrong Choice");
			}
		
		}
		private static void yes3()
		{
			dinner();	
		}
		private static void no3()
		{
			System.out.println("Your Total Bill is "+bill);
			
		}
}	