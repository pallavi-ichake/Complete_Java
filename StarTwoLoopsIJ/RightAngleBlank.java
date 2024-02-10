package StarTwoLoopsIJ;

public class RightAngleBlank {

	public static void main(String[] args) 
	{
		int rows=7;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==rows)
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
