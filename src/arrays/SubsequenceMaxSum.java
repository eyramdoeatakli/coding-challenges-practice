package arrays;

public class SubsequenceMaxSum {
	
	
	public static void main(String[] args) {
		int[] A= {3,2,-6,4,0};
		
		System.out.println(solution(A));
		
	}
	
//	   public static int solution(int[] A) {
//	        int maxSum = Integer.MIN_VALUE;
//	        int localSum = 0;
//	        for (int i = 0; i < A.length; i++) {
//	            localSum = Math.max(localSum + A[i], A[i]);
//	            maxSum   = Math.max(localSum, maxSum);
//	        }
//	        return maxSum;
//	    }

	
	 public static  int solution(int[] A) {
		    int absoluteMax = A[0];
		    int localMax = A[0];
		    int nextSum = 0;
		    int currentElement = 0;
		   
		    for (int i = 1; i < A.length; i++) {
		      currentElement = A[i];
		      nextSum = localMax + currentElement;
		      localMax = Math.max(A[i], nextSum);
		      absoluteMax = Math.max(absoluteMax, localMax);
		    }
		    return absoluteMax;
		  }
}
