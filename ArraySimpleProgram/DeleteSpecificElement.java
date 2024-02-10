package ArraySimpleProgram;

import java.util.Scanner;

public class DeleteSpecificElement
{
	public static void main(String args[]) {
	    // initialize the objects.
	    int size = 0, i, del, count = 0,n=0;
	    int arr[] = {4,5,-1,6,3,7};
	    for (i = 0; i < size; i++)
	    {
	      arr[i] = n;
	    }

	    // enter elements which is to be deleted.
	    System.out.print("Enter Element to be Delete : ");
	    del = n;
	    for (i = 0; i < size; i++) {
	      if (arr[i] == del) {
	        for (int j = i; j < (size - 1); j++) {
	          arr[j] = arr[j + 1];
	        }
	        count++;
	        break;
	      }
	    }
	    if (count == 0) {
	      // print if entered element not found.
	      System.out.print("Element Not Found..!!");
	    } else {
	      // element deleted.
	      System.out.print("Element Deleted Successfully..!!");

	      // new array after deletion.
	      System.out.print("\nNow the New Array is :\n");
	      for (i = 0; i < (size - 1); i++) {
	        System.out.print(arr[i] + " ");
	      }
	    }
	  }

}
