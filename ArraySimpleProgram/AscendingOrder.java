package ArraySimpleProgram;

import java.util.Scanner;

public class AscendingOrder 
{
	 public static void main(String args[]) {
		    // initialize the objects.
		    int n, i, j, temp;
		    int arr[] = new int[50];
		    Scanner scan = new Scanner(System.in);
		    System.out.print("Enter number for the array elements : ");
		    n = scan.nextInt();
		    System.out.println("Enter " + n + " Numbers : ");
		    for (i = 0; i < n; i++) {
		      arr[i] = scan.nextInt();
		    }
		    System.out.print("Sorting array : \n");
		    for (i = 0; i < (n - 1); i++) {
		      for (j = 0; j < (n - i - 1); j++) {
		        if (arr[j] > arr[j + 1]) {
		          temp = arr[j];
		          arr[j] = arr[j + 1];
		          arr[j + 1] = temp;
		        }
		      }
		    }

		    System.out.print("Array Sorted Successfully..!!\n");
		    System.out.print("Sorted List in Ascending Order : \n");
		    for (i = 0; i < n; i++) {
		      System.out.print(arr[i] + "  ");
		    }
		  }
}
