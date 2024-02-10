package StringCount;

public class ChangeCaseOnlyForVowels {

	public static void main(String[] args) 
	{
		  String str = "pallavi";
		  char[] ch = str.toCharArray();
	        for (int i = 0; i < ch.length; i++) 
	        {      
	            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
	             
	                ch[i]=(char)(ch[i] - 32); 
	            }
	        }
	         
	        String result = new String(ch);
	        System.out.println(result);
	    }

	}


