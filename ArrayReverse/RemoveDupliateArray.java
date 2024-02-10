package ArrayReverse;

import java.util.Arrays;

public class RemoveDupliateArray
{
	static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));
        int noOfUniqueElements = arrayWithDuplicates.length;
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {    
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {   
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
        System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
    }
      
    public static void main(String[] args) 
    {  
       removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
       removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
    }    
}
