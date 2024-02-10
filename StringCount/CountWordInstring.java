package StringCount;

public class CountWordInstring {

	public static void main(String[] args)
	{
		String str="Pallavi P Patil";
		int count = 0;
		String[] strarray = str.split(" ");
		for(String s: strarray)
			if(!s.equals(""))
						count++;
					
			System.out.println("Count of word = "+count);
		

//Another Logic

//public static void main(String[] args) {
	
    String[] str1 = "Pallavi Abhijeet".split(" ");
    int[] count1 = new int[str1.length];
    for(int i=0;i<str1.length;i++)
    {
    	if(str1[i]!="")
    	{
    		count1[i]++;
    	}
    }
    System.out.println(count1.length);
}
}
    