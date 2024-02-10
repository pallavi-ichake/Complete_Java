package TdurgaLBPArray;

import java.util.Arrays;
import java.util.Scanner;

public class P176_NumofOccerance 
{
	 public static void main(String[] args) {
	        int i,j;
	        int count =0;
		    int []arr = {4,5,6,3,4,9,8};
	        for( i=0;i<arr.length;i++)
	        {
	            for( j=i+1;j<arr.length;j++)
	            {
	                if(arr[i]==arr[j])
	                   count++;
	            }
	            if(j==i)
	                System.out.print(arr[i]+" ");
	        }
	    }
	}