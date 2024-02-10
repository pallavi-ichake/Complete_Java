package ArrayReverse;

import java.util.Arrays;

public class moveZerosToEnd 
{
	   public static void main(String[] args)
	   {
	        int[] arr = new int[] {12, 0, 7, 0, 8, 0, 3};
	        int count = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            if(arr[i] != 0)
	            {
	                arr[count] = arr[i];
	                count++;
	            }
	        }
	        while (count < arr.length)
	        {
	            arr[count] = 0;
	            count++;
	        }
	        System.out.println(Arrays.toString(arr));
	    }
	  
	}


