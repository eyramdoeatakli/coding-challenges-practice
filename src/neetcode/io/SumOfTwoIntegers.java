package neetcode.io;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIntegers {
	
	public static void main(String[] args) {
		int [] elemsArray= {5,7,1,2,8,4,3};
		System.out.println(ifSumOfTwoIntegersExist(elemsArray, 19));

	}
	
	
	
	static boolean ifSumOfTwoIntegersExist(int [] inputArray,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < inputArray.length; i++) {
			int integer = inputArray[i];
			int diff=target-integer;
			
		 if(map.containsValue(diff)) {
			 return true;
		 }
		 else {
			 map.put(i, integer);
		 }
			
		}
		return false;
		
	}
	

}
