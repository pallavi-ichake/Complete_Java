package StringCount;

public class countOfEachCharter 
{
	public static void main(String[] args) 
    {  
       String str = "aabbccddab"; 
       int[] count = new int[str.length()];  
       char[] ch = str.toCharArray();   
       
       for(int i = 0; i <str.length(); i++) 
       {  
    	   count[i] = 1 ;  
           for(int j = i+1; j<str.length(); j++) 
           {  
               if(ch[i] == ch[j])
               {   
            	   count[i]++;  
            	   ch[j] = '0';
               }  
           }  
           if(ch[i] != ' ' && ch[i] != '0')  
           {
               System.out.print(ch[i] + ""+ count[i]);  
           }  
       }            
   }  
}  
