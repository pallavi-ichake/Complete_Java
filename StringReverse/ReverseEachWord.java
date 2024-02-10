package StringReverse;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
	    String[] str = "Pallavi Abhijeet".split(" ");
		String revstr="";
		
		for(String word: str)
		{
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			revstr=revstr+sb.toString();
		}
		System.out.println(revstr);
	}

}
