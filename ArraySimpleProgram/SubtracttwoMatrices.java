package ArraySimpleProgram;

import java.util.Scanner;

public class SubtracttwoMatrices 
{
	 public static void main(String args[]) {
		    int n, i, j;
		    Scanner scan = new Scanner(System.in);
		    System.out.print("Enter the base of the matrices : ");
		    n = scan.nextInt();
		    int mat1[][] = new int[n][n];
		    int mat2[][] = new int[n][n];
		    int mat3[][] = new int[n][n];
		    System.out.println("Enter the elements of the first matrix : ");
		    for (i = 0; i < n; i++) {
		      for (j = 0; j < n; j++) {
		        mat1[i][j] = scan.nextInt();
		      }
		    }
		    System.out.println("Enter the elements of the second matrix : ");
		    for (i = 0; i < n; i++) {
		      for (j = 0; j < n; j++) {
		        mat2[i][j] = scan.nextInt();
		      }
		    }
		    System.out.println("Subtracting Matrices --Matrix1 - Matrix2--");
		    for (i = 0; i < n; i++) {
		      for (j = 0; j < n; j++) {
		        mat3[i][j] = mat1[i][j] - mat2[i][j];
		      }
		    }
		    System.out.println("Result of Matrix1 - Matrix2 is : ");
		    for (i = 0; i < n; i++) {
		      for (j = 0; j < n; j++) {
		        System.out.print(mat3[i][j] + " ");
		      }
		      System.out.println();
		    }
		  }
}
