package product;
import java.util.Scanner;
public class Product {

	
	public static void main(String[] args)
	{
		int x;
		int y;
		int z;
	
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the first integer ");
		x=input.nextInt();
		System.out.println("Please enter the second integer ");
		y=input.nextInt();
		System.out.println("Please enter the third integer ");
		z=input.nextInt();
		int result=x*y*z;
		System.out.println("The product of the integers is "+result);
		
	

	}

}
