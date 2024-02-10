package TdurgaLBPArray;

public class P157_SumOfElementEndingwith3
{
    public static void main(String[] args) 
    {
		int[] arr = {33,25,33,020,23,78};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%10==3)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

}
