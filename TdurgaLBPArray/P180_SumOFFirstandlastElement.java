package TdurgaLBPArray;

import java.util.Arrays;
import java.util.Scanner;

public class P180_SumOFFirstandlastElement 
{
	  public static void main(String[] args)
	  {
		  int even=0,odd=0,i;
		  int []arr= {3,4,5,8,9,10};
	       
	        for(i=0;i<arr.length;i++)
	        {
	            if(arr[i]%2==0)
	                even=even+1;
	            else
	                odd=odd+1;
	        }
	        
	        System.out.println("Even count:"+" "+even);
	        System.out.println("ODD count:"+" "+odd);
	    }
}