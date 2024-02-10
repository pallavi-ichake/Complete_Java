package StringCount;

public class PrintUniqueWord 
{
    public static void main(String[] args)
    {
        String[] str = "Welcome to geeks for geeks pallavi Abhi".split(" ");
	    int count;
	       
	        for (int i = 0; i < str.length; i++)
	        {
	            count = 1;
	            for (int j = i + 1; j < str.length; j++) 
	            {
	                if (str[i].equalsIgnoreCase(str[j])) 
	                {
	                    count++;
	                    str[j] = "";
	                }
	            }
	            
	            if (count > 1 && str[i] != "")
	                System.out.print(str[i]+" ");
	        }
	    }
   }
	

