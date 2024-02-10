package StringCount;

public class ChangeCaseWithoutBuiltIn
{
	public static void main (String args[])
    {
	    String s = "PallaviICHAke";
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch>64&&ch<91)
            {
                ch=ch+32;
                System.out.print( (char) ch);
            }
            else if(ch>96&&ch<123)
            {
                ch=ch-32;
                System.out.print( (char) ch);
            }
            if(ch==32)
            System.out.print(" ");
            
        }
    }
}
 
/*		char ch1 = 'a';
int ascii = ch1;
System.out.println("The ASCII value of " + ch1 + " is: " + ascii);*/