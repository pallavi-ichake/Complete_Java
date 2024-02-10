package TdurgaLBPArray;

public class P158_SumOfElementAtOddIndex
{
	public static void main(String[] args) 
	{ 
		int sum=0;
		int[] arr = {3,2,9,8,10};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
				sum =sum + arr[i];
		}
		System.out.println(sum);
	}
}