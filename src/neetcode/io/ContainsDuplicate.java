package neetcode.io;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		
		int [] elemsArray= {1,2,3,1,4};
		System.out.println(containsDup2(elemsArray));
		
	}
	
	//optimal solution

	public boolean containsDuplicate(int[] nums) {
	    Set<Integer> uniques = new HashSet<>();
	    for (int i = 0; i < nums.length; i++) {
	        if (uniques.contains(nums[i])) {
	            return true;
	        }
	        uniques.add(nums[i]);
	    }
	    return false;
	}
	
     static boolean containsDup2(int [] elemsArray){
		
		Boolean containsDup=false;
		int counter=0;
		int i = 0;
		int j=0;

		
		while (i<elemsArray.length-1) {
			
			if(elemsArray[i]==elemsArray[j]) {
				counter++;
				j++;
				
				if(counter>1) {
					break;
				}
				
			}else {
				j++;
			}
			
			if(j==elemsArray.length) {
				i++;
				j=0;
				counter=0;
			}
					
		}
		
		System.out.println(counter);
		
		if (counter>1) {
			containsDup=true;
		}
		else {
			containsDup=false;

		}
	
		
		return containsDup;
		
	}



}
