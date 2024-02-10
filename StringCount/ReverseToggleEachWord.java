package StringCount;

public class ReverseToggleEachWord 
{
  public static void main(String[] args) 
	{   
	    String str = "PallaviIchake";
	    String words[]=str.split("\\s");  
	    String reverseToggle="";  
	    for(String w:words)
	    {  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();
	        
	        String first=sb.substring(0,1);  
	        String afterfirst=sb.substring(1);  
	        
	        reverseToggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	        System.out.println(reverseToggle);
	    }  
	    
	}  
}  

