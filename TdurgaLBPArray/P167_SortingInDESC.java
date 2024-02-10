package TdurgaLBPArray;

import java.util.Arrays;

public class P167_SortingInDESC
{
	public static void main(String[] args) 
	{
		int[] arr = {9,6,5,4,3,2,6};
		for(int i=arr.length-1;i>=0;i--)
		{
			Arrays.sort(arr);
			System.out.print(arr[i]);
		}
		
	}
}