package StringCount;

public class SingleCharCountinString 
{
	public static void main(String[] args) {
	String str="Pallavi";
	int l=str.length();
	int count=0;
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)== 'a')
		
			count++;	 
	}
	System.out.println(count + "a");
}
}

