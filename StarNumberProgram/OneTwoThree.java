package StarNumberProgram;

public class OneTwoThree 
{
	public static void main(String[] args) 
	{
		int rows=4,num=1;
		char ch=65;
		for(int i=rows;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
			
			}
			ch++;
			System.out.println();
		}

	}


}
