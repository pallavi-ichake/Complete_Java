package ArraySimpleProgram;

import java.util.Scanner;

public class CountTotalPositivesNegativesZeros
{
	public static void main(String args[])
    {
        int n=6,positive=0, negative=0, zero=0, i;
        int arr[] = {4,5,-1,6,3,7};
       
        for(i=0; i<n; i++)
        {
            arr[i] = n;
        }
        for(i=0; i<n; i++)
        {
            if(arr[i] < 0)
            {
                negative++;
            }
            else if(arr[i] == 0)
            {
                zero++;
            }
            else
            {
                positive++;
            }
        }
        System.out.print("Positive Numbers are: " + positive );
        System.out.print("\nNegative Numbers are: " + negative );
        System.out.print("\nZeros are: " + zero );
    }

}
