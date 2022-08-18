package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinDeletionAnagram {
	
	public static void main(String[] args) {
		
		System.out.println("Total number of deletions "+numberOfdeletionsToMakeStringsAnagram("arcs", "cart"));
	}
	
	
	
	
	public static int numberOfdeletionsToMakeStringsAnagram(String stra,String strb) {
		
		//Step 1. Initialize integer array to hold count of both strings..this array is of length 26 
		//to hold all possible 26 alphabets
		int countOfStringsArr[]= new int [26];		
		int totalNumberOfDeletions=0;
		
		//Step 2. Loop over first string and store char counts in countOfStringsArr array 
		//calculate position to increment count of by subtracting charAtindex from a nb. this uses the ascii values
		//of the alphabets to match the
		//array positions from 0 to 26
		
		for (int i = 0; i < stra.length(); i++) {
			int j= stra.charAt(i)-'a';
			countOfStringsArr[j]++;
		}
		
		//Step 3. Loop over first string and store char counts in countOfStringsArr array 
		//calculate position to decrement count of by subtracting charAtindex from a nb. this uses the ascii values
		//of the alphabets to match the
		//array positions from 0 to 26
		
		
		for (int k = 0; k < stra.length(); k++) {
			int l= strb.charAt(k)-'a';
			countOfStringsArr[l]--;
		}
		
		//Loop over final array state and values to get total number of extra chars to be deleted to get anagram
		for (int i : countOfStringsArr) {
			totalNumberOfDeletions+=Math.abs(i);	
		}
		
		int sum = IntStream.of(countOfStringsArr).sum();
		int sum2 = Arrays.stream(countOfStringsArr).sum(); //prints 10

				               
		
		return totalNumberOfDeletions;
		
	}
	

}
