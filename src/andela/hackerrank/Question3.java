package andela.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class Question3 {
	
	public static void main(String[] args) {
		//System.out.println(substringPalChecker("xxdnssuqevu", 3));
		//System.out.println(rearrangeSubstringToPalindrome("cde"));
		int [] startindex = {2,64,7,33,20,3,32,4,15,6,69,5,39,16,6,54,45,30,1,39,124,29,20,45,1,25,26,110,89,75,53,21,22,18,44,39,47,2,46,4,7,22,37,83,94,87,34,79,76,3,60,82,47,5,40,40,21,112,42,32,2,131,46,67,54,48,42,74,21,54,21,32,118,16,76,75,95,71,20,51,54,88,79,72,51,53,69,22,16,29,55,11,1,68,61,23,49,119,76,111,41,3,25,125,74,48,8,18,5,9,95,87,107,26,28,81,15,72,4,52,30,36,109,38,40,1,6,32,102,15,27,2,42,47,21,51,36,4,69,105,13,18,56,35,24,56,23,93,32,24,4,39,92,35,9,4,2,28,93,55
};
		int [] endindex = {93,106,62,64,111,115,61,19,80,66,73,30,43,43,133,103,56,122,107,90,129,123,55,61,101,31,34,116,97,111,68,98,100,28,66,96,127,131,134,17,42,100,88,133,112,89,126,132,79,120,97,91,108,99,54,88,130,132,131,35,89,135,88,126,59,134,78,133,125,114,23,88,126,34,80,111,132,107,30,52,72,137,98,94,108,117,73,100,127,32,131,129,131,86,137,60,103,135,98,129,104,11,64,130,95,95,62,35,59,69,134,131,116,104,63,107,101,137,95,136,31,72,135,119,41,39,76,128,123,57,135,75,46,76,54,93,87,63,100,111,88,66,79,107,130,132,103,129,84,50,80,100,136,130,59,68,102,118,122,95};
		int [] subs = {7,25,20,32,67,113,0,7,1,1,3,1,0,28,118,6,5,6,107,1,1,6,8,17,5,4,9,7,9,8,16,9,9,0,6,7,4,3,6,4,15,8,5,6,3,3,4,7,4,5,7,1,9,6,5,0,5,4,5,2,5,3,14,5,5,7,37,6,1,61,3,56,9,5,1,37,10,6,3,2,4,7,4,3,8,7,2,15,10,0,77,0,30,4,8,10,4,3,2,19,9,1,5,5,3,4,16,18,47,3,9,5,10,79,7,7,9,2,92,6,1,3,27,10,2,2,41,97,4,7,3,7,5,6,8,42,5,2,3,7,5,6,7,5,2,6,81,4,4,8,4,6,45,6,7,55,3,5,7,6
};
		String s="yczuykvelbobvfnjtfuqxxdnssuqevucxvwxgtetuuurzjaspvkounbpgyfmtboswmrcfvvzprqqbsksnvgkikzqigcdhqvdeoijkdkbxasyveskzyuiitaszdvgvsmchulrzwuwym";
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
			
			subString = s.substring(startIndex[i], endIndex[i]+1);
	
			Boolean canBeReArranged=rearrangeSubstringToPalindrome(subString,numberOfSubstitutions);
			
			if(canBeReArranged) {
				result.append("1");
			}

			else {
				result.append("0");
			}	
		}

		
		return result.toString();
		
	}
	
	static boolean rearrangeSubstringToPalindrome(String substring,int noOfSubstitutions) {
		Boolean canBeArrangedToPalindromeWithGivenNoOfSubs=false;
		int noOfSubstitutionsTracker=0;

		Set<Character> set= new HashSet<>();		
		for (int i = 0; i < substring.length(); i++) {

			if(set.add(substring.charAt(i))==true) {
			}else {
				set.remove((Character)(substring.charAt(i)));
			}	
		} 


		int size=set.size();
		if(size!=0) {
			noOfSubstitutionsTracker=size/2;

			
			if(noOfSubstitutionsTracker<=noOfSubstitutions) {
				canBeArrangedToPalindromeWithGivenNoOfSubs=true;
				return canBeArrangedToPalindromeWithGivenNoOfSubs;
			}
		}
		return canBeArrangedToPalindromeWithGivenNoOfSubs;

	}
	

	



}