package ArrayReverse;

import java.util.Arrays;

public class UsinginbuildMethod
{
	public static void main(String[] args)   
	{     
	int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};   
	Arrays.sort(array);   
	System.out.println("Elements of array sorted in ascending order: ");   
	//for (int i = 0; i < array.length; i++)   
		for (int i = array.length-1; i >0; i--)   
	{       
	System.out.print(array[i]+" ");   
	}   
	}  
}
