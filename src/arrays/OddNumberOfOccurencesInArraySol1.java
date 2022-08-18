package arrays;

import java.util.HashSet;
import java.util.Set;

public class OddNumberOfOccurencesInArraySol1 {
	
	public static void main(String[] args) {
		
		int[] elementArray= {9, 3, 9, 3, 9, 7, 9};		
	//System.out.println(solution(elementArray));		
			
	}
	
	public  int solution(int[] A) {

		Set<Integer> res=getSingleElementFromArray(A);
		int  val =res.stream().reduce(Integer::sum).orElse(0);
		return val;
	}
	
	
	
	
	public static Set  getSingleElementFromArray(int[] elementArray) {
		int oddElement=0;
		Set<Integer> hashset= new HashSet<>();
	for (int i = 0; i < elementArray.length; i++) {
		int elOne = elementArray[i];	
		int res=compareWithOtherArrayElements(elementArray, elOne);
//			hashset.add(res);
		
	}
	
	return hashset;
}
	
	public static int compareWithOtherArrayElements(int[] elementArray,int elOne) {
		int count =0;
		int oddElement=0;
		
		for (int j = 0; j < elementArray.length; j++) {
			if (elementArray[j]==elOne) {
				count++;
			}
		}
		
		if(isOddNoOfOccurences(count)) {
			oddElement= elOne;
		}
		
		
		return oddElement;
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
