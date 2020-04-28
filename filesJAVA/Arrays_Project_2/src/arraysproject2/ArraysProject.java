package arraysproject2;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraysProject {

	
	public static void main(String[] args)
	{
		ArrayList myList=new ArrayList();
		int x=0;
		do
		{
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter name ");
		myList.add(myScanner.nextLine());
		x++;
		}
		while(x<5);
		{
		System.out.println("The students are: ");
		for(int i=0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		}
	
	}

}
