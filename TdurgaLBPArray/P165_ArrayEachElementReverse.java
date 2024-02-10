package TdurgaLBPArray;

import java.util.Scanner;

public class P165_ArrayEachElementReverse
{
	   public static int rev(int n)
	    {
	        int r=0,d;
	        while(n!=0)
	        {
	            d=n%10;
	            r=r*10+d;
	            n=n/10;
	        }
	        return r;
	    }
	    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int i,n = obj.nextInt();
	        int a[] = new int[n];
	        for(i=0;i<n;i++)
	            a[i] = obj.nextInt();
	        for(i=0;i<n;i++)
	            System.out.print(rev(a[i])+" ");
	    }
	}