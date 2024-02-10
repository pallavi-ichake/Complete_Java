package StringReverse;

public class reverserEachword2 {

	public static void main(String[] args) {
		String[] str="I am pallavi".split(" ");
		String revstr=" ";
		
		for(String w: str)
		{	
		StringBuffer sb=new StringBuffer(w);
		sb.reverse();
		revstr=revstr+sb.toString()+" ";
		}
			System. out. println("Reversed String: " + revstr);
		}
	}
