package ArraySimpleProgram;

import java.util.Scanner;

public class EvenOddElements 
{
	 public static void main(String[] args) 
	 {
		    int n;
		    Scanner s = new Scanner(System.in);
		    System.out.print("Enter no. of elements you want in array : ");
		    n = s.nextInt();
		    int a[] = new int[n];

		    // enter all elements.
		    System.out.println("Enter all the elements : ");
		    for (int i = 0; i < n; i++) {
		      a[i] = s.nextInt();
		    }
		    System.out.print("Odd numbers in the array are : ");
		    for (int i = 0; i < n; i++) {
		      if (a[i] % 2 != 0) {
		        System.out.print(a[i] + " ");
		      }
		    }
		    System.out.println("");
		    System.out.print("Even numbers in the array are : ");
		    for (int i = 0; i < n; i++) {
		      if (a[i] % 2 == 0) {
		        System.out.print(a[i] + " ");
		      }
		    }
		  }
}
