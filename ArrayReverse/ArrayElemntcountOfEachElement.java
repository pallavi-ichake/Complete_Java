package ArrayReverse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayElemntcountOfEachElement {

	public static void main(String[] args) 
	{
        int arr[] ={4,6,2,8,9,8,9};
        Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i:arr)
        {
        	if(hm.containsKey(i))
        	{
        		hm.put(i,hm.get(i)+1);
        	}
        	else
        	{
        		hm.put(i, 1);
        	}
        }

System.out.println(Arrays.toString(arr));
System.out.println(hm);
	}

}
