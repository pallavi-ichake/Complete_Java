package ArrayReverse;

import java.util.Arrays;

public class MoveZeroToFront
{
	static void moveZerosToFront(int arr[])
    {
       // System.out.println("Input Array :"+Arrays.toString(arr));
        int count = arr.length-1;
        for (int i = arr.length-1; i >= 0; i--)
        {
            if(arr[i] != 0)
            {
                arr[count] = arr[i];
                count--;
            }
        }
        while (count >= 0)
        {
            arr[count] = 0;
            count--;
        } 
        System.out.println(Arrays.toString(arr));
    }
  
    public static void main(String[] args)
    {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});
    }
}


