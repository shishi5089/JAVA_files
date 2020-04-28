package ifstatement;

public class IfStatement 
{ 
	public static void main(String[]args)
	{
		String username="John";
		String password="kim";
		if(username.equalsIgnoreCase("JoHN")&&password.equalsIgnoreCase("kIM"))
		{
			System.out.println("Welcome "+username+" To Our Systems");
			
		}
		else
		{
			System.out.println("Get Out of Here...");
			
		}

			int choice=5;
			
				 switch(choice)
				 {
				 case 1:
					 System.out.println("Safaricom Menu");
					 System.out.println("1. Safaricom Services");
					 System.out.println("2.M-PESA");
					 break;
					 
				 case 2:
					 System.out.println("Orange Menu");
					 System.out.println("1.Orange Services");
					 System.out.println("2.Orange Money");
					 break;
					 
				 case 3:
					 System.out.println("Airtel Menu");
					 System.out.println("1.Airtel Services");
					 System.out.print("2.Airtel Money");
					 break;
					 
				 case 4:
					 System.out.println("MTN Menu");
					 System.out.println("1.MTN Services");
					 System.out.println("2.MTN Money");
					 break;
					 
					 default:
						 System.out.println("Wrong Choice. The Item Does Not Exist.");
						 break;
						 
					  
				 
				 }
		
		
	
	}
}	
	