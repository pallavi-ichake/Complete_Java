package ArrayConversion;
import java.util.Arrays;

public class Alltheleaders 
{
	 static void findTheLeaders(int arr[])
	    {
	        int len = arr.length;
	        int max = arr[len-1];
	  
	        System.out.println("The leaders in "+Arrays.toString(arr)+" are : ");
	  
	        System.out.println(arr[len-1]);
	  
	        for (int i = arr.length-2; i >= 0; i--)
	        {
	            if(arr[i] > max)
	            {
	                System.out.println(arr[i]);
	                max = arr[i];
	            }
	        }
	         
	        System.out.println("===================================");
	    }
	  
	    public static void main(String[] args)
	    {
	        findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
	  
	        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
	  
	        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
	  
	        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
	    }

}
