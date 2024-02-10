package StringCount;

public class NonDuplicateChar 
{
	public static Character firstNonRepeatChar(String s){
		int[] found = new int[256];
		char[] chars = s.toCharArray();

		for(int i=0; i< chars.length; i++)
		found[chars[i]]++;

		for(int i=0; i< chars.length; i++){
		if(found[chars[i]]==1)
		return chars[i];
		}
		return null;
		}

		public static void main(String[] args) 
		{
			System.out.println(firstNonRepeatChar("aaPallavi"));
		}
}
