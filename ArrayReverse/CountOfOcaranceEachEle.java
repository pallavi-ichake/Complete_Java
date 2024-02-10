package ArrayReverse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOfOcaranceEachEle 
{
	public static void main(String[] args) 
	{
		String s = "Pallavi";
        char[] ch=s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for(Character i:ch)
        {
        	if(map.containsKey(i))
        	{
        		map.put(i,map.get(i)+1);
        	}
        	else
        	{
        		map.put(i, 1);
        	}
        }

System.out.println(Arrays.toString(ch));
System.out.println(map);
	}

}