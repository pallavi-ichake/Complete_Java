package ArrayReverse;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 2, 7, 10, 99, 5, 2, 1, 6 };

		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)

				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
        
		System.out.println(Arrays.toString(arr));
	}
}
