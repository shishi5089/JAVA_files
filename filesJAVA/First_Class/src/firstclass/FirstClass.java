package firstclass;

public class FirstClass 
{
	
	public static int AccountBalance;
	static double height;
	static long population;
	static short cars;
	static boolean married;
	static float salary;
	static char grade;
	static byte chairs;
	static public String AccountHolderName;
	  
	public FirstClass(int num1,double num2)
	{
		 
		AccountBalance=50000;
		AccountHolderName="Sheila Nangila";
		cars=80;
		chairs=1;
		married=false;
		salary=40000;
		grade='A';
		population=67000;
		height=6.0;
		System.out.println("I am the Constructor Running First");
		System.out.println("The Value of num1 is "+num1+"The value of num2 is "+num2);
		
	}
	
}
