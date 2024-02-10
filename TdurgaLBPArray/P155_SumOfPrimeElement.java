package TdurgaLBPArray;

public class P155_SumOfPrimeElement
{
	public static void main(String[] args) 
	{
		int count, sum = 0;
		{
			for (int i = 1; i <= 10; i++) 
			{
				count = 0;
				for (int j = 2; j <= i / 2; j++) 
				{
					if (i % j == 0) 
					{
						count++;
						break;
					}
				}
				if (count == 0 && i != 1)
				{
					sum = sum + i;
					System.out.println("Prime number: " + i);
				}
			}
			System.out.println("The Sum of Prime is from 1 to 20 is: " + sum);
		}
	}
}