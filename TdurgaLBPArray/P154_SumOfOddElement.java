package TdurgaLBPArray;

public class P154_SumOfOddElement 
{

	public static void main(String[] args)
	{
		int sum=0;
		int[] arr = {2,3,4,9,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
			sum = sum+arr[i];
			}
		}
		System.out.println(sum);
	}	
}