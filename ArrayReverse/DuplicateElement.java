package ArrayReverse;

public class DuplicateElement
{
	 public static void main(String[] args) 
	    {
	        String[] arr = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
	        for (int i = 0; i < arr.length-1; i++)
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if( (arr[i].equals(arr[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate Element is : "+arr[j]);
	                }
	            }
	        }
	    }    
}
