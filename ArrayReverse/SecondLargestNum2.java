package ArrayReverse;

public class SecondLargestNum2 
{
	public static void main(String[] args) 
	{
		int arr []={45,67,89,100,54};
		int largest = 0;
		int secondLargest = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest = arr[i];
			}
			else if (arr[i]>secondLargest)
			{
				secondLargest=arr[i];
			}
		}	
     System.out.println(secondLargest);
	}

}

