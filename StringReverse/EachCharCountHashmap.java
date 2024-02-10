package StringReverse;

import java.util.HashMap;

public class EachCharCountHashmap 
{
	public static void main(String[] args) 
	{
	String str = "pallavi";
		HashMap<Character,Integer> map = new HashMap <Character,Integer>();
		char[] strArray = str.toCharArray();
		for(char c : strArray)
		{
			if(map.containsKey(c))
			{
				System.out.println(map.put(c, map.get(c) + 1));
			}
			else
			{
				map.put(c, 1);
			}
		}
				
	}
	
}