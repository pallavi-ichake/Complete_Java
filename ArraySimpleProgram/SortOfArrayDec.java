package ArraySimpleProgram;

import java.util.Scanner;

public class SortOfArrayDec 
{
	 public static void main(String[] args) {
		    int n=0, temp;
		    int a[] = {2,8,6,4,5,9};
		    System.out.println("Enter all the elements:");
		    for (int i = 0; i < n; i++) {
		      a[i] = n;
		    }
		    for (int i = 0; i < n; i++) {
		      for (int j = i + 1; j < n; j++) {
		        if (a[i] < a[j]) {
		          temp = a[i];
		          a[i] = a[j];
		          a[j] = temp;
		        }
		      }
		    }
		    for (int i = 0; i < n; i++) {
		      System.out.println(a[i]);
		    }
		  }
	}

