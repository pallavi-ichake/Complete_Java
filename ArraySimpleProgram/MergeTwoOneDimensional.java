package ArraySimpleProgram;

import java.util.Scanner;

public class MergeTwoOneDimensional
{
	 public static void main(String args[]) {
		    // initialize the required array.
		    int size1, size2, size, i, j, k;
		    int arr1[] = new int[50];
		    int arr2[] = new int[50];
		    int merge[] = new int[100];
		    Scanner scan = new Scanner(System.in);

		    // enter size and elements of first array.
		    System.out.print("Enter size of the first array : ");
		    size1 = scan.nextInt();

		    System.out.println("Enter elements of the first array : ");
		    for (i = 0; i < size1; i++) {
		      arr1[i] = scan.nextInt();
		    }

		    // enter size and elements of second array.
		    System.out.print("Enter size of the second array : ");
		    size2 = scan.nextInt();

		    System.out.println("Enter elements of the second array : ");
		    for (i = 0; i < size2; i++) {
		      arr2[i] = scan.nextInt();
		    }

		    // merge both the array.
		    System.out.print("Merging both the Arrays...\n");
		    for (i = 0; i < size1; i++) {
		      merge[i] = arr1[i];
		    }

		    size = size1 + size2;

		    for (i = 0, k = size1; k < size && i < size2; i++, k++) {
		      merge[k] = arr2[i];
		    }

		    // new array after merging.
		    System.out.print("New array after merging is :\n");
		    for (i = 0; i < size; i++) {
		      System.out.print(merge[i] + "  ");
		    }
		  }
}
