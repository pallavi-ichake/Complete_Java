package StringMislenius;
public class SwapWithoutTemp 
{  
    public static void main(String args[]) 
    {  
        String a = "Pallavi";  
        String b = "SnehaS";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  