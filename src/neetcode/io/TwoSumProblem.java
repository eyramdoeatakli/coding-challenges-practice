package neetcode.io;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
	public static void main(String[] args) {
	//	int [] elemsArray= {2,7,11,15};
		int [] elemsArray= {3,2,4};

		
		int [] arr=twoSum2(elemsArray, 6);
		Arrays.stream(arr).forEach(System.out::println) ;
		
	}
	
	
	
    static int[] sum(int [] elemsArray,int target){
		

        int [] arrayTracker= new int [2];
		int i = 0;
		int j=i+1;

		
		while (i<elemsArray.length-1) {
			
			if(elemsArray[i]+elemsArray[j]==target) {
				arrayTracker[0]=elemsArray[i];
				arrayTracker[1]=elemsArray[j];
				j++;
				
				if(arrayTracker.length>0) {
					break;
				}
				
			}else {
				j++;
			}
			
			if(j==elemsArray.length) {
				i++;
				j=i+1;
			}
					
		}
		
		return arrayTracker;
		
	}

    
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            
            else {
                map.put(nums[i],i );
            }

        }

        return new int[] {};
    }
    
    static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            
            if (map.containsValue(diff)) {
            	
            	for ( Integer key : map.keySet() ) {
            	    if (map.get(key)==diff) {
                      return new int[] { key, i };
            	    }
            	}
            }
            
            else {
                map.put(i,nums[i] );
            }

        }

        return new int[] {};
    }
}
