package TdurgaLBPArray;

import java.util.Arrays;
import java.util.Scanner;

public class P169_BinarySearch
{
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt(),index,i,key;
        int a[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        key=obj.nextInt();
        Arrays.sort(a);
        index = Arrays.binarySearch(a,key);
        System.out.println(index<0?-1:index);
    }
}


