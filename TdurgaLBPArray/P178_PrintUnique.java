package TdurgaLBPArray;

import java.util.Arrays;
import java.util.Scanner;

public class P178_PrintUnique 
{
	public static void main(String[] args) 
	{
		  Scanner obj = new Scanner(System.in);
	        int n=obj.nextInt(),i,c,key;
	        int a[]=new int[n];
	        for(i=0;i<n;i++)
	            a[i] = obj.nextInt();
	        key=obj.nextInt();
	        c=0;
	        for(i=0;i<n;i++)
	        {
	            if(a[i]==key)
	                c++;
	        }
	        System.out.println(c);
	    }
	}