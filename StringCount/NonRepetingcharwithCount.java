package StringCount;

public class NonRepetingcharwithCount {
	public static void main(String[] args) {
		
		 String str = "pallavi";
		 char[] ch = str.toCharArray();
		 int[] count = new int[str.length()];
		
		 for(int i=0;i<str.length();i++)
		 {
			 count[i]=1;
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(ch[i]==ch[j])
				 {
				   count[i]++;
				   ch[j]='0';
				 }
			 }
		 }
		 for(int i=0;i<count.length;i++)
		 {
			 if(ch[i]!='0' && ch[i]!= ' ')
			 {
				 if(count[i]<=1 && count[i]!=' ')
				 {
				     System.out.println(count[i] + ""+ch[i]);
					// System.out.println(str.charAt(index));
				 }
			 }
		 }
		 
		}
	}
	        