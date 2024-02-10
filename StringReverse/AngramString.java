package StringReverse;

import java.util.Arrays;

public class AngramString
{
	 public static void main(String[] args) {
		 String str1 = "Army";
		 String str2 = "mary";

		        char[] ch = str1.toLowerCase().toCharArray();
		        char[] ch1 = str2.toLowerCase().toCharArray();       
		        Arrays.sort(ch);
		        Arrays.sort(ch1);
		       
		        boolean status = Arrays.equals(ch, ch1);
		        System.out.println(status);
		        
		    }
		}