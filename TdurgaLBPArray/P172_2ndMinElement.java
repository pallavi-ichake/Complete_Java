package TdurgaLBPArray;

import java.util.Arrays;

public class P172_2ndMinElement {

	public static void main(String[] args)
	{
		int arr[] = {2,4,9,6,7};
		 for(int i=0;i<arr.length;i++)
		 {
	        Arrays.sort(arr);
	        
	    }
	 System.out.print(arr[arr.length-1]);
	}
}


