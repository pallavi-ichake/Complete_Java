package StringReverse;

public class PalindromeString {

	public static void main(String[] args)
	{
		String str="madam";
		String revstr="";
		
		for(int i=str.length()-1;i>=0;i--)
			revstr=revstr+str.charAt(i);
		
			if(revstr.equalsIgnoreCase(str))
				System.out.println(str+" "+"This is palidrome string ");
			else
				System.out.println(str+" "+"This is not palidrome string ");
		}
	}


