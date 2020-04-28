package objects;

public class Objects {

	
	public static void main(String[] args) 
	
	{
		CarClass sheila;
		sheila= new CarClass();
		sheila.age=18;
		sheila.bloodGroup='A';
		sheila.complexion="Dark";
		sheila.height=6.0;
		sheila.weight=74.3f;
		System.out.println("The age of sheila is "+sheila.age);
		
		CarClass Jemma=new CarClass();
		Jemma.age=20;
		Jemma.bloodGroup='B';
		Jemma.complexion="Light Skin";
		Jemma.height=5.6;
		Jemma.weight=97.9f;
		System.out.println("The age of Jemma is "+Jemma.age);
		System.out.println("The Blood Group of Jemma is "+Jemma.bloodGroup);
		System.out.println("The complexion of Jemma is "+Jemma.complexion);
		

	}

}
class CarClass
{
	String complexion;
	double height;
	int age;
	char bloodGroup;
	float weight;
}