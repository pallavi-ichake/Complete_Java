package StringReverse;

public class ReverseWord 
{
	public static void main(String[] args) 
	{
		String[] str="I am pallavi".split(" ");
		String rev=" ";
		int len=str.length;
		for (int i = len- 1; i >= 0; i--) 
		{
			rev =rev+ str[i] + " ";
		}
			System. out. println("Reversed String: " + rev);		
	}
}
