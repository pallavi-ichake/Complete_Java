package StringCount;

import java.util.HashMap;

public class CountOfcharusingMap 
{
	 public static void main(String[] args) 
	    {  
		String str = "pallavi ichake";
		char[] ch = str.toCharArray();
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
	    for (char i : ch) 
	    {
	        if(map.containsKey(i))
	        {
	            map.put(i, map.get(i)+1);
	        }
	        else
	        {
	            map.put(i, 1);
	        }
	    }  
	    System.out.println("Element Count : "+map);  
	}    
}



