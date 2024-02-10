package StringReverse;

public class ReverseString {

	public static void main(String[] args)
	{
		String s= "Pallavi", revstr=" ";
		int len=s.length();
		
		for(int i=len-1;i>=0;i--)
			revstr=revstr+s.charAt(i);
			System.out.print(revstr);
		
	}
}

/*StringBuilder sb =new StringBuilder(s);
StringBuilder reverse = sb.reverse();
System.out.println("Reverser within built in funcatiuon:-" + " "+reverse);*/

		/*public static String reverseString(String str){  
		    char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev;  
		}  
		public static void main(String[] args) {
			ReverseString rs  = new ReverseString();
			System.out.println(rs.reverseString("PAlalvi"));
		}
		}  */


