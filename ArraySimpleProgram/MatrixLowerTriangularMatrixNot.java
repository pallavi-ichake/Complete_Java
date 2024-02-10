package ArraySimpleProgram;

import java.util.Scanner;

public class MatrixLowerTriangularMatrixNot
{
	public static void main(String args[]) throws Exception {
	    // create object of scanner class
	    Scanner sc = new Scanner(System.in);

	    // enter the size.
	    System.out.print("Enter the size of the matrix : ");

	    int m = sc.nextInt();
	    int A[][] = new int[m][m];

	    // Input the matrix.
	    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < m; j++) {
	        System.out.print("Enter the elements : ");
	        A[i][j] = sc.nextInt();
	      }
	    }

	    // printing the matrix.
	    System.out.println("*************************");
	    System.out.println("The Matrix is : ");
	    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < m; j++) {
	        System.out.print(A[i][j] + "\t");
	      }
	      System.out.println();
	    }

	    System.out.println("*************************");

	    int p = 0;

	    for (int i = 0; i < m; i++) {
	      for (int j = i + 1; j < m; j++) {
	        // check for lower matrix or not.
	        if (A[i][j] != 0) {
	          p = 1;
	          break;
	        }
	      }
	    }

	    // print matrix is lower triangular or not.
	    if (p == 0)
	      System.out.println("The matrix is Lower Triangular");
	    else
	      System.out.println("The matrix is not Lower Triangular");
	  }

}
