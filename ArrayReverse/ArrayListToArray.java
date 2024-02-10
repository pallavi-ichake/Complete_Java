package ArrayReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray 
{
	public static void main(String[] args) 
    {    
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS"};  
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));   
        System.out.println(list);
    }    
}
