package TdurgaLBPArray;

import java.util.Arrays;
import java.util.Scanner;

public class P181_NumofEvenODDElement 
{
	  public static void main(String[] args)
	  {
		    int []a = {2,3,5,6,7,8,9};
	        int low = 0,high,i;
	        for(i=0;i<a.length;i++)
	        low=0;
	        high=a.length-1;
	        while(low<=high)
	        {
	            System.out.print((a[low]+a[high])+" ");
	            low++;
	            high--;
	        }
	    }
	}