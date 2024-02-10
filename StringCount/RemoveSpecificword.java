package StringCount;

public class RemoveSpecificword 
{
	public static void main(String[] args)
    {
        String str = "This is the Geeks For Geeks";
        String word = "the";
        str = str.replaceAll(word, "");
        str = str.trim();
        System.out.print(str);
    }
}


