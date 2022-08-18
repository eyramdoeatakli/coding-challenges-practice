package permutations;

import java.util.Arrays;

public class FindFrequentlyMostOccuringCharacter {
	
	public static void main(String[] args) {

		//System.out.println(maxFreq("boooo"));	
		System.out.println(minFreq("aaabaa"));	
		//System.out.println((int)'a');
	}	
	
	static  Character maxFreq(String s) {
		
		int ASCII_SIZE = 256;
		int maxFrequency = -1;   
		char maxFrequencyChar='0';
		//int counter=0;
		
		int freq[] = new int [ASCII_SIZE];
		
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			freq[c]++;
			
			if(maxFrequency<freq[c]) {
			  maxFrequency=freq[c];
			  maxFrequencyChar=c;
			 // counter ++;
		}

	}

		return maxFrequencyChar;

}
	
	static  Character minFreq(String s) {
		
		int ASCII_SIZE = 256;
		int minFrequency = Integer.MAX_VALUE;  
		char minFrequencyChar='0';
		//int counter=0;
		
		int freq[] = new int [ASCII_SIZE];
		
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			freq[c]++;	
			
		    if (freq[c]<=minFrequency) {
		    	minFrequency = freq[c];
		    	minFrequencyChar = c;
		
	}
		}
		
		//Arrays.stream(freq).forEach(System.out::println);
		
//		//Character cmin=Arrays.stream(freq).filter(i->i==1).c
		return minFrequencyChar;

	}
}