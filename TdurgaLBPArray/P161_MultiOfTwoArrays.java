package TdurgaLBPArray;

import java.util.Scanner;

public class P161_MultiOfTwoArrays 
{

	public static void main(String[] args)
	{
		        Scanner obj = new Scanner(System.in);
		        int i,n=obj.nextInt();
		        int a[] = {2,1,7,8,9};
		        int b[] = {2,1,7,8,9};
		        int c[] = {2,1,7,8,9};
		        for(i=0;i<a.length;i++)
		            a[i] = i;
		        for(i=0;i<b.length;i++)
		            b[i] = i;
		        for(i=0;i<c.length;i++)
		            c[i] = a[i] + b[i];
		        for(i=0;i<n;i++)
		            System.out.print(c[i]+" ");
	}
			
}
