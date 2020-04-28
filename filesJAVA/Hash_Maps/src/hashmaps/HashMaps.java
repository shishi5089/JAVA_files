package hashmaps;
import java.util.HashMap;
public class HashMaps
{
	public static void main(String[]args)
	{
		HashMap<Integer,String> myMap=new HashMap<Integer,String>();
		myMap.put(1,"20" );
		myMap.put(2, "Kim");
		myMap.put(3,"James");
		myMap.put(4,"Mutethia");
		myMap.put(5,"Mukiri");
		myMap.put(6,"Kirimi");
		System.out.println(myMap.values());
		System.out.println (myMap.values());
		System.out.println (myMap.get(3));
		
		
	}

}
