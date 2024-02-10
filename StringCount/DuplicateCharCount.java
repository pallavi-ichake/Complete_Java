package StringCount;

import java.util.ArrayList;

public class DuplicateCharCount 
{
	    public static void printDuplicates(String inputString) 
	    {
	        int count = 0;
	        ArrayList<Character> charList = new ArrayList<>();
	 
	        for (int i = 0; i < inputString.length(); i++) 
	        {
	            char ch = inputString.charAt(i);
	            for (int j = 0; j < inputString.length(); j++)
	            {
	                if (inputString.charAt(j) != ch)
	                {
	                    continue;
	                }
	                count++;
	            }
	            if (!charList.contains(ch)) 
	            {
	                if (count > 1 && ch != ' ')
	                {
	                    System.out.println("Char: " + ch + ", Count: " + count + " times.");
	                    charList.add(ch);
	                }
	            }
	            count = 0;
	        }
	    }
public static void main(String[] args) 
{
    String inputString = "My name is Pallavi Ichake";
    printDuplicates(inputString);
}
}
