package inbuiltpackage;
import java.util.Scanner;
public class InbuiltPackage 
{
	public static  void main(String[]args)
	{
		Scanner myScanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Please Enter num1");
		num1=myScanner.nextInt();
		
		System.out.println("Please Enter num2");
		num2 = myScanner.nextInt();
		
		int sum=num1+num2;
		System.out.println("The sum of the two numbers is "+sum);
		
	}
}
