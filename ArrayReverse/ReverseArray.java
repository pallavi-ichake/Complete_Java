package ArrayReverse;

import java.util.Arrays;

public class ReverseArray 
{
	 static void reverseArray(int arr[])
	    {
	       // System.out.println("Array Before Reverse : "+Arrays.toString(arr));  
	        int temp;
	        for (int i = 0; i < arr.length/2; i++) 
	        {
	            temp = arr[i];
	            arr[i] = arr[arr.length-1-i]; 
	            arr[arr.length-1-i] = temp;
	        }  
	        System.out.println("Array After Reverse : "+Arrays.toString(arr));
	    }   
	    public static void main(String[] args) 
	    {    
	        reverseArray(new int[]{4, 5, 8, 9, 10});     
	    }    
}
