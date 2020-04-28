package assignment3;

public class Assignment3 
{
	public static void main(String[]args)
	{
	
	String name="Jack";
	int age=18;
		double Bio=81;
		double Chem=86;
		double Eng=80;
	
		if(Bio>=83.5&&Chem>=85.0&&Eng>=79.5)
		{
		System.out.println(name+"You are qualified to be admitted to medical school");
		}
		
		else
		{
			System.out.println(name+" You are not qualified to join medical school");
			
		}
		if(Bio>=83.5&&Chem>=85.0&&Eng>=79.5&&age>=19)
		{
			System.out.println(name+" You can join Harvard Medical School");
			
		}
		else
		{
			System.out.println(name+" You cannot join Harvard Medical School");
			
		}
		
	}
}
