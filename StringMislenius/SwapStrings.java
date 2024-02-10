package StringMislenius;

public class SwapStrings {
	 
    public static void main(String[] args) {
 
        String a = "one";
        String b = "two";
 
        a = a + b;  
        b = a.substring(0, (a.length() - b.length())); 
        a = a.substring(b.length());
 
        System.out.println("The a String  = " + a);
        System.out.println("The b String = " + b);
 
    }
 
}