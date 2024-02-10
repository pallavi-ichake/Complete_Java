package ArrayConversion;

public class ShareMarket2 
{
	public static void main(String[] args) 
	{
	int arr[] = { 2, 1, 3, 4, 7,5,9};
	int  profit = 0;
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i + 1; j <= arr.length-1; j++) 
			{
				if (arr[j] > arr[i])
				{
					int curr_profit = arr[j] - arr[i];
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		System.out.print("We got profit"+" : "+profit);
	}
}

