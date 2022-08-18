package neetcode.io;

import java.util.Arrays;
import java.util.List;

public class TwoSumIISumSlidingWindowApproach {
	
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(1,3,4,5,7,11);
		int target=9;
		
		int ans[]=twoSum(nums, target);
		System.out.println(ans[0]+" "+ans[1]);
	}

	//This problem deals with an ordered set
	
	static int [] twoSum(List<Integer> nums,int target) {
		
		int ipointer=0;
		int jpointer=nums.size()-1;
		//int [] targetIndices = new int[2];
		
		while (ipointer<jpointer) {
			
			int suspectedTarget=nums.get(ipointer)+nums.get(jpointer);
			if(suspectedTarget>target) {
			 jpointer--;
			}
		else if(suspectedTarget<target) {
			ipointer++;
		}else {
			return new int[] {ipointer+1,jpointer+1};

		}
	}
		return new int[] {};
}

}