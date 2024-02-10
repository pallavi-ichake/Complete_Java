package StringCount;

public class CountOfeahchar2 
{
	public static void main(String[] args) 
	{
			String str = "Pallavi Ichake";
			for(char ch = 'a' ; ch <= 'z' ; ch++ )
			{
				int charCount = 0;
				for(int i =0 ; i<str.length()-1; i++)
			     {
					if(str.charAt(i) == ch)
					{
						charCount++;
					}
			    }
				if(charCount!=0)
				{
					System.out.print(ch+"="+charCount+" ");
					charCount=0;
				}
			}
		}
	}

	