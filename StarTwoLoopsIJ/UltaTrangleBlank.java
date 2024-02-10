package StarTwoLoopsIJ;

public class UltaTrangleBlank 
{
	public static void main(String[] args) 
	{
		int rows=7;
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				if(j==rows||j==i||i==1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}


	}
}
