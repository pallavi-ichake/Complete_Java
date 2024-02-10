package ArraySimpleProgram;

import java.util.Scanner;

public class AverageAllArray 
{
	public static void main(String[] args) 
    {
        int n=5,sum = 0;
        float average;
        int a[] = {4,5,6,7,8};
        for(int i = 0; i < n ; i++)
        {
            sum = sum + a[i];
        }
        System.out.print("Sum of the array elements is : " +sum+"\n");
        average = (float)sum / n;
        System.out.print("Average of the array elements is : " +average);
    }
}
