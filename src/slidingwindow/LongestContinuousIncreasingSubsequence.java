package slidingwindow;

public class LongestContinuousIncreasingSubsequence {
	
	public static void main(String[] args) {
		//int nums[]= {1,3,5,4,7};
		int nums[]= {1,0,1,0};
		System.out.println("LCI is "+findLength(nums));
		//System.out.println("LCI is "+findLengthOfLCIS(nums));
		
		
	}
	
	
	
	public static int findLength(int nums[]) {
		int result=0;
		int anchor=0;
		
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i-1]>=nums[i]) 
				anchor=i;
			    result =Math.max(result, i-anchor+1)  ;
			    System.out.println("i and anchor "+(i-anchor+1));
			    System.out.println("i "+i);

		}
	    return result;

	}
	
	public static int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        // I am assuming they set ans and temp to 1 becuase the LCIS will always be 1 for a repeating set
        int ans = 1;
        int temp = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                temp++;
            }else{
                temp = 1;
            }
            ans = Math.max(ans, temp);
        }
        
        return ans;
    }
	

}
