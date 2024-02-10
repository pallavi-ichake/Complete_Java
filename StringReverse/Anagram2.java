package StringReverse;

import java.util.Arrays;

public class Anagram2 
{
	public static void main(String[] args)
	{
		boolean status = true;
		
        String str = "pallavi";
        String str1 = "mary";
        
        char[] ch1 = str.toLowerCase().toCharArray();
        char[] ch2 = str1.toLowerCase().toCharArray();
      
        Arrays.sort(ch1);  
        Arrays.sort(ch2);  
        
        status = Arrays.equals(ch1, ch2);  
		
		  if (status) 
	            System.out.println(str + " and " + str1 + " are anagrams");  
		  else  
	            System.out.println(str + " and " + str1 + " are not anagrams");  
	    
	}
}
