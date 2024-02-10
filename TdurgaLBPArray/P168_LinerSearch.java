package TdurgaLBPArray;

import java.util.Scanner;

public class P168_LinerSearch 
{
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt(),i,index;
        int a[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        int key=obj.nextInt();
        index=-1;
        for(i=0;i<n;i++)
        {
            if(key==a[i])
                index=i;
        }
        System.out.println(index);
    }
}