package ArraySimpleProgram;

import java.util.Scanner;

public class SparseMatrix 
{
	public static void main(String args[]) {
	    //scanner class object creation
	    Scanner sc = new Scanner(System.in);

	    //input numbers of rows and cols
	    System.out.print("Enter the dimensions of the matrix : ");
	    int m = sc.nextInt();
	    int n = sc.nextInt();

	    //declare two_d array (matrix) object
	    double[][] mat = new double[m][n];

	    //variable to store zero count
	    //initializing it with 0
	    int zeros = 0;

	    //input matrix 
	    System.out.println("Enter the elements of the matrix : ");
	    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < n; j++) {
	        mat[i][j] = sc.nextDouble();
	        if (mat[i][j] == 0) {
	          //counting zeros
	          zeros++;
	        }
	      }
	    }

	    //check condiion
	    if (zeros > (m * n) / 2) {
	      System.out.println("The matrix is a sparse matrix");
	    } else {
	      System.out.println("The matrix is not a sparse matrix");
	    }

	    sc.close();
	  }
}
