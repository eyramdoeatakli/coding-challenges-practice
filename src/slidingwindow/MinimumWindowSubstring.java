package slidingwindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MinimumWindowSubstring {
	
	public static void main(String[] args) {
		
		System.out.println(minSubString("ADOBECODEBANC", "ABC"));
		
	}
	
	
	
	public static String minSubString(String mainString, String sbtr) {
		//check for base cases
		if (mainString.isEmpty()||sbtr.isEmpty() || Objects.isNull(sbtr)|| Objects.isNull(mainString)) {
			return "One of the strings is empty please check again";
		}
		
		//Step 1: Decompose substring into map
		
		Map<Character, Integer> charMap= new HashMap<>();
		 for (int i = 0; i < sbtr.length(); i++) {
			 char c=sbtr.charAt(i);
			 charMap.put(c, charMap.getOrDefault(c, 0)+1); // we could have simply used charMap.put(c,1)
		}
		
		 
		 //Step 2: Initialize tracking variables
		
		int right=mainString.length();
		int left=0;
		int count =charMap.size();
		boolean found=false;
		int minlength=mainString.length();
		int i=0; 
		int j=0;
		
		
		// Step 3: Perform checks for j pointer 
		while (j<mainString.length()) {
			
			char endChar=mainString.charAt(j++);
			if(charMap.containsKey(endChar)) {
				charMap.put(endChar, charMap.get(endChar)-1);
				if (charMap.get(endChar)==0) {
					count--;
				}
				
				// Step 4 : If j pointer conditions still hold then continue, else check
				//i pointer conditions and loop
				if (count >0) {
					continue;
				}
				
				while (count==0) {
					char startChar=mainString.charAt(i++);
					if(charMap.containsKey(startChar)) {

					charMap.put(startChar, charMap.get(startChar)+1);
					if (charMap.get(startChar)>0) {
						count++;
					}	
				}
				}
				
				//Step 5: if i pointer conditions are satisfied also then perform re initialization of new
				//variables values and positions
				
				 if (j-i<minlength) {
					 left =i;
					 right=j;
					 minlength=j-i;
					 found = true; 
				 }

			}
			
		}
		//Step 6 : Return min window substring
		return sbtr.substring(left-1, right-1);
		
		
		
		
		
		
	}

}
