package arrays;

import java.util.HashMap;
import java.util.Map;

public class OddNumberOfOccurences {
	
	public static void main(String[] args) {
		
		int [] elements= {9,3,9,3,9,7,9};
		
	 System.out.println(findOccurence(elements));
		
	}

	
	
	static int findOccurence(int [] elements) {
		int oddNumOfOcc=0;
		Map<Integer, Integer> map= new HashMap<>();
		for (int i = 0; i < elements.length; i++) {
		        int elmone=elements[i];
			
			if(map.containsKey(elmone)) {
				map.put(elmone, map.get(elmone)+1);
			}else {
				map.put(elmone, 1);	
			}
			
			
		}
		
		
		for (int i = 0; i < elements.length; i++) {
			int j = elements[i];
			
			if(map.get(j)%2!=0) {
				oddNumOfOcc= j;
			}
			
		}
		
		
	
		
		return oddNumOfOcc;
		
	}
}
