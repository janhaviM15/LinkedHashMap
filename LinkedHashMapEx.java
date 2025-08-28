package Array;


import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapEx 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String>map = new LinkedHashMap<Integer,String>();
		map.put(89, "Ram");
		map.put(12,"John");
		map.put(44, "Om");
		map.put(65, "Sita");
		map.put(null, null);
		map.put(null, "Shyam");
		map.put(6, null);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
