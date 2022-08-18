package andela.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3Copy {
	
	public static void main(String[] args) {
		//System.out.println(substringPalChecker("xxdnssuqevu", 3));
		System.out.println(rearrangeSubstringToPalindrome("cde"));
		int [] startindex = {0};
		int [] endindex = {10};
		int [] subs = {3};
		String s="xxdnssuqevu";
		System.out.println(palindromeChecker(s,startindex,endindex,subs));
		
		
	}
	
	
	
	static String palindromeChecker(String s,int[]startIndex,int[]endIndex,int []sub) {
		StringBuilder result=new StringBuilder();
		
		if(s.isEmpty()) {
			result.append("0");
		}
		
		for (int i = 0; i < startIndex.length; i++) {
			int numberOfSubstitutions=sub[i];
			String subString="";
			int noOfSubstitutionsTracker=0;
			
			subString = s.substring(startIndex[i], endIndex[i]+1);
			
			noOfSubstitutionsTracker=rearrangeSubstringToPalindrome(subString);
			
			if(noOfSubstitutionsTracker<=numberOfSubstitutions) {
				result.append("1");
			}

			else {
				result.append("0");
			}
			
		}

		
		return result.toString();
		
	}
	
	static int rearrangeSubstringToPalindrome(String substring) {
		Set<Character> set= new HashSet<>();		
	 	 for (int i = 0; i < substring.length(); i++) {
	 		 
	 		 if(set.add(substring.charAt(i))==true) {
	 		 }else {
	 			set.remove((Character)(substring.charAt(i)));
	 		 }	
		} 
	 	 
	 	 
	 	 int size=set.size();
	 	 int res=0;
	 	 if(size!=0) {
	 		 res=size/2;
	 		 return res;
	 	 }
	 
		return res;
	}
	
	
	
//	public static int substringPalChecker(String substring,int numberOfSubs ) {
//		Boolean result=true;
//		  int n = substring.length();    
//		  int tracker=0;
//		    // Counting number of characters
//		    // that should be changed.
//		     
//		    for (int i = 0; i < n/2; ++i) {
//		     
//		    		  if (substring.charAt(i) != substring.charAt(n - i - 1)) {
//		    			  tracker++; 
//		    		  }
//		    	
//		    }
//		 
//			return tracker;
//	}
	
	


}
