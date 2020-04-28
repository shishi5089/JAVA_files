package bmicalculator;
import java.util.Scanner;
public class BmiCalculator 
{
	public static void main(String[]args)
	{
		double weight;
		double height;
		double BMI;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your weight in kilograms ");
		weight=input.nextDouble();
		System.out.println("Please enter your height in meters ");
		height=input.nextDouble();
		BMI=weight/height*height;
		System.out.println("Your Body Mass Index(BMI)is: "+BMI);
		
	}
}
