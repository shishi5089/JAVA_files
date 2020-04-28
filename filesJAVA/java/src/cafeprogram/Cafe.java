package cafeprogram;

import java.util.Scanner;

public class Cafe 
{
     public static void main(String[]args)
     {
    	 Scanner myScanner=new Scanner(System.in);
    	 System.out.println("please enter your name");
    	 String username=myScanner.nextLine();
    	 System.out.println("please enter password");
    	 String password=myScanner.nextLine();
    	   
    	 if(username.equalsIgnoreCase("sarah")&&password.equalsIgnoreCase("sly"));
    	 {
    		 System.out.println("Welcome"+username+"To java cafe");
    		  System.out.println("for breakfast enter 1"+"\nfor lunch enter 2"+"\nfor dinner ");
    		  int meal;
    		  meal=myScanner.nextInt();
    		  
    		  
    		  
    		     breakfast();
				switch(meal)
    		    {
    		    case 1:
    		     String breakfast=new String();
    		    	 System.out.println(breakfast);
    		    	 String price=myScanner.nextLine();
    		    	 System.out.println("****Breakfast Menu****");
    		    	 System.out.println("1.Tea");
    		    	 System.out.println("2.Kebab");
    		    	 System.out.println("3.Bacon");
    		    	 
    		    	 if(price.equalsIgnoreCase("tea"))
    		    	 {
    		    	
    		    		System.out.println("you will be served shortly"+"\nyour bill is ksh30,thank you");
    		    	}
    		    	 else if(price.equalsIgnoreCase("kebab"));
    		    	 {
    		    		 System.out.println("you will be served shortly"+"\nyour bill is ksh90,thank you");
    		    	}
    		    	  if (price.equalsIgnoreCase("bacon"))
    		    	 {
    		    		 System.out.println("you will be sreved shortly"+"\nyour bill is ksh120,thank you");
    		    	}
    		    	 break;
    		    	 
    		    case 2:
    		    	 System.out.println("***lunch menu***"+"\n 1.rice and beef stew"+"\n 2.ugali and choma"+"\n3. mukimo");
    		    	 break;
    		  
    		 
    		    	 
    		    	
    		    
    		    
    		    }
    		    
    		    
    	 }
    	 
    	 
     }

	private static void breakfast() {
		// TODO Auto-generated method stub
		
	}


}
