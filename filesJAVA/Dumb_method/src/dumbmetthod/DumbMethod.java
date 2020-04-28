package dumbmetthod;

public class DumbMethod 
{
	public static void main(String[]args)
	{
		add();
		multiply();
		division();
		subtract();
	}
	public static void add()
	{
		int a=9,b=15;
		int sum=a+b;
		System.out.println("The sum of the two numbers is "+sum);
	}
	public static void multiply()
	{
		int z=6;
		int w=7;
		int multiple=z*w;
		System.out.println("The Multiple of the two numbers is "+multiple);
	}
	public static void division()
	{
		int s=72;
		int t=9;
		int division=s/t;
		System.out.println("The quotient of the two numbers is "+division);
		
	}
	public static void subtract()
	{
		int d=90;
		int e=7;
		int subtract=d-e;
		System.out.println("The difference between the two numbers is "+subtract);
	}
}

