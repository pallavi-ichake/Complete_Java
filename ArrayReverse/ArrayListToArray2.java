package ArrayReverse;

import java.util.ArrayList;

public class ArrayListToArray2
{
	public static void main(String[] args) 
    {    
        ArrayList<String> list = new ArrayList<String>();  
        list.add("JAVA");  
        list.add("JSP");    
        list.add("ANDROID");  
        String[] array = new String[list.size()]; 
        list.toArray(array); 
        for (String string : array)
        {
            System.out.println(string);
        }
    }    

}
