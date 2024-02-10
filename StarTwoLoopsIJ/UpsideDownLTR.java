package StarTwoLoopsIJ;

/*
 
 ****
 ***
 **
 *
 *
 **
 ***
 ****
 
 */

public class UpsideDownLTR {

	public static void main(String[] args) 
	{
		int rows=4,col=3;
		for(int i=rows;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
