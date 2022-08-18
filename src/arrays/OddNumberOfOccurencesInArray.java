package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OddNumberOfOccurencesInArray {
	
	public static void main(String[] args) {
		
		//int[] elementArray= {9,3,9,3,2};		
		int[] elementArray= {9,3,9,3,9,7,9};		
		System.out.println(" values "+getUnpairedElementMap(elementArray));	
	}
	
	
	
	
	
	
	public static Set getUnpairedElementMap(int[] elementArray) {
	int counter=0;
	int OddElement=0;
	Set<Integer> elementSet= new HashSet();
	
	for (int i = 0; i < elementArray.length; i++) {
		int elOne = elementArray[i];
		
		for (int j = i+1; j < elementArray.length; j++) {
			int elTwo = elementArray[j];
			
			if (elOne==elTwo) {
				elementSet.add(elOne);
			}else {
				OddElement=elOne;
			}
		}
		
	}
	
	return elementSet;
	
}

	
	
	
//	public static int getUnpairedElement(int[] elementArray) {
//		int counter=0;
//		int OddElement=0;
//		boolean isOdd=false;
//		Map<Integer, Integer> elementMap= new HashMap<>();
//		
//		for (int i = 0; i < elementArray.length; i++) {
//		int elOne = elementArray[i];
//		
//		
//		for (int j = 1; j < elementArray.length; j++) {
//			int elTwo = elementArray[j];
//			
//			if (elOne==elTwo) {
//				counter=1;
//			}
//		}
//		if(counter==0) {
//			OddElement=elOne;
//		}
//		
//		
//	 }
//		
//		return OddElement;
//				
//		
//		
//		
//	}
//	
	
//	
//	if (elOne==elTwo) {
//		counter++;
//		boolean isOddCount=isOddNoOfOccurences(counter);
//		if(isOddCount) {
//			OddElement=elOne;
//		}
//		
//	}
//	
		
//	public static int getUnpairedElement(Map<Integer,Integer> elementMap) {
//		
//		for (int i = 0; i < elementMap.size(); i++) {
//			elementMap.get(elementMap)
//			
//			
//		}
//		
//	}
//		
		
		
		
		
		
//	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean isOddNoOfOccurences(int counter) {
		
		boolean isOdd=false;
		
		if(counter%2!=0) {
			isOdd=true;
		}
		return isOdd;
	}

}
