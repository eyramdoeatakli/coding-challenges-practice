package neetcode.io;

import java.util.Arrays;

public class AnagramExample {
	public static void main(String[] args) {
		System.out.println(isAnagram("cart", "tarcs"));
		
	}
	
	static boolean isAnagram(String a, String b) {
		
        char aCharArray[] = a.toCharArray();
		Arrays.sort(aCharArray);

		char bCharArray[] = b.toCharArray();
		Arrays.sort(bCharArray);
		

	
		
		if(String.valueOf(aCharArray).equalsIgnoreCase(String.valueOf(bCharArray))) {
			return true;
		}
		return false;
	}
	
	

}
