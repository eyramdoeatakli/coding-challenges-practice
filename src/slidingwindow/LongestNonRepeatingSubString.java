package slidingwindow;

import java.util.HashSet;

public class LongestNonRepeatingSubString {
	public static void main(String[] args) {
		System.out.println(longestNonRepeatingss("abcbbghfu"));
	}
	
	
	public static int longestNonRepeatingss(String s) {
		
		int a_pointer=0;
		int b_pointer=0;
		int max=0;
		
		HashSet<Character> hashset=new HashSet<>();
		
		while(b_pointer<s.length()) {
			if(!hashset.contains(s.charAt(b_pointer))){
				hashset.add(s.charAt(b_pointer));
				b_pointer++;
				max=Math.max(hashset.size(), max);
				
			}
			else {
				hashset.remove(s.charAt(a_pointer));
				a_pointer++;
			}
			System.out.println("hashset vals "+ hashset);
			
		}
		return max;
	}

}
