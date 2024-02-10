package ArraySimpleProgram;

public class CountStringsIntegers 
{
	public static void main(String arg[]) 
	{
	    String str[] = { "Raj","77","101","99","Jio"};
	    int cn = 0, cs = 0;
	    System.out.println("Array elements are: ");
	    for (int i = 0; i < str.length; i++) {
	      System.out.print(str[i]+" ");
	    }
	    for (int i = 0; i < str.length; i++)
	    {
	      try
	      {
	        int j = Integer.parseInt(str[i]);
	        cn++;
	      } 
	      catch (NumberFormatException e) 
	      {
	        cs++;
	      }
	    }
	    System.out.print("Numeric:" + cn + "\nStrings:" + cs);
	  }
}
