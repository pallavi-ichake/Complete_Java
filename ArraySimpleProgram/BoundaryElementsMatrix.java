package ArraySimpleProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoundaryElementsMatrix 
{
	public static void main(String args[]) throws IOException 
	{
		    int i, j, m, n;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    // enter rows and columns.
	    System.out.print("Enter the rows : ");
	    m = Integer.parseInt(br.readLine());
	    System.out.print("Enter the columns : ");

	    n = Integer.parseInt(br.readLine());

	    //Creating the array
	    int A[][] = new int[m][n];

	    // Input the elements.
	    for (i = 0; i < m; i++) {
	      for (j = 0; j < n; j++) {
	        // enter elements.
	        System.out.println("Enter the elements : ");
	        A[i][j] = Integer.parseInt(br.readLine());
	      }
	    }

	    // this will print the boundary elements.
	    System.out.println("The Boundary Elements are:");
	    for (i = 0; i < m; i++) {
	      for (j = 0; j < n; j++) {
	        // condition for obtaining the boundary elements
	        if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
	          System.out.print(A[i][j] + "\t");
	        else
	          System.out.print(" \t");
	      }
	      System.out.println();
	    }
	  }

}
