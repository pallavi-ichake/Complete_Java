package ArrayConversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
		 
	    public static void main(String[] args) {
	 
	        String[] stringArray = { "My", "name", "is", "Pallavi", "!" };
	 
	        String string1 = UsingtoString(stringArray);
	        System.out.println("Using Arrays.toString(): " + string1);
	 
	        String string2 = UsingAppend(stringArray);
	        System.out.println("Using StringBuilder.append(): " + string2);
	 
	        String string3 =UsingJoin(stringArray);
	        System.out.println("Using String.join(): " + string3);
	 
	        String string4 = UsingJoining(stringArray);
	        System.out.println("Using Collectors.joining(): " + string4);
	 
	    }
	 
	    // 1. Using the Arrays.toString() method
	    public static String UsingtoString(String[] stringArray) {
	        return Arrays.toString(stringArray);
	    }
	 
	    // 2. Using the StringBuilder.append() method
	    public static String UsingAppend(String[] stringArray) {
	        StringBuilder stringBuilder = new StringBuilder();
	 
	        for (int i = 0; i < stringArray.length; i++) {
	            stringBuilder.append(stringArray[i]);
	        }
	        return stringBuilder.toString();
	    }
	 
	    // 3. Using the String.join() method
	    public static String UsingJoin(String[] stringArray) {
	        String str = String.join(" ", stringArray);
	        return str;
	    }
	 
	    // 4. Using the Collectors.joining() method
	    public static String UsingJoining(String[] stringArray) {
	        String str = Arrays.stream(stringArray).collect(Collectors.joining());
	        return str;
	    }
	 
	}


