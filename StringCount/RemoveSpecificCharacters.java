package StringCount;

public class RemoveSpecificCharacters
{ 
	{
        String str = "PallaviIchake";
       // String result = str.replace("a", "");
       // System.out.println(result);
        
        //without Builtin Function
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++)
        if(ch[i]=='a')
        {
        	ch[i]=' ';
        }
        System.out.println(ch);
    }
}