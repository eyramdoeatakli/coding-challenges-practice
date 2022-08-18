package arrays;

public class GetPassingCars {
	
	
	static int getPassingCars(int[] A, int n)
	{
	    int result = 0;
	    for (int i = 0; i < n - 1; i++)  {
	    if (A[i] == 0)
	    {
	        for (int j = i + 1; j < n; j++)
	            if (A[j] == 1)
	                result++;
	    }
	    
	    }
	    return result;
	}
	
	public int solution(int[] A) {
	    int zeros = 0;
	    int carPasses = 0;
	   
	    for(int i=0; i<A.length; i++) {
	    	if(A[i] == 0) {
	    		zeros++; 
	    		}
	    	else if(A[i] == 1) { //for every 1 - there will be an extra car pass for ALL the 0's that came before it carPasses += zeros; if(carPasses > 1000000000) {
	          return -1;
	        }
	      }
	    return carPasses;
	  }
	
	

}
