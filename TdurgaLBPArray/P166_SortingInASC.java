package TdurgaLBPArray;

import java.util.Arrays;

public class P166_SortingInASC
{
	public static void main(String[] args) 
	{
		int[] arr = {9,6,5,4,3,2,6};
		for(int i=0;i<arr.length;i++)
		{
			Arrays.sort(arr);
			System.out.print(arr[i]);
		}
		
	}
}