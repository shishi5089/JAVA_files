package clevermethod;

public class CleverMethod 
{
	public static void main(String[]args)
	{
		add(79,90);
		subtract(45,89);
		multiply(67,8);
	}
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum of the two numbers is "+sum);
	}
	public static void subtract(int a,int b)
	{
		int subtract=b-a;
		System.out.println("The difference of the two numbers is "+subtract);
	}
	public static void multiply(int a,int b)
	{
		int multiple=a*b;
		System.out.println("The product of the two numbers is "+multiple);
	}

}
