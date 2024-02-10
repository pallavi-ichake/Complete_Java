package StringMislenius;

public class StringLength
{
		   public static void main(String args[]) throws Exception
		   {
		      String str = "pallaviIchake";
		      int count = 0;
		      for(char c: str.toCharArray())
		      {
		         count++;
		      }
		      System.out.println("Length of the given string ::"+count);
		   }
}