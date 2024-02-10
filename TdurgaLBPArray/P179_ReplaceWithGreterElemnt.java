package TdurgaLBPArray;

import java.util.Arrays;
import java.util.Scanner;

public class P179_ReplaceWithGreterElemnt 
{
	  public static void main(String[] args)
	  {
			int arr[] = {2,4,9,10,6,7};
			int i,j, max = 0;
	        for(i=0;i<arr.length;i++)
			//for(i=arr.length-1;i>=0;i--)
	        {
	        	Arrays.sort(arr);
	            max = arr[i];
	            
	           for(j=i+1;j<arr.length;j++)
	            {
	                if(max<arr[j])
	                {
	                   max=arr[j];
	                }
	            }
	            System.out.print(max+" ");
	        }
	    }
	}

