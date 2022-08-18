package arrays;

import java.util.Arrays;

public class CyclicRotation {
     final int limit=1000000;

	
	public static void main(String[] args) {
		int[]oldarr= {4,3,2,5};
		copyArrIntoNewArr(oldarr,2);
	}
	
	
	static void copyArrIntoNewArr(int[]oldarr,int countValue) {
		int counter=countValue;
		
		if(counter==0) {
			for (int j : oldarr) {
				System.out.println(j);
			}
		}
		else {
			int [] newArr=new int[oldarr.length];
			int lenghthOfOldArr=oldarr.length;
			
			newArr[0]=oldarr[lenghthOfOldArr-1];
			
			for (int i = 0; i < oldarr.length-1; i++) {
				newArr[i+1] = oldarr[i];
			}
			counter=counter-1;
			copyArrIntoNewArr(newArr,counter);
		}
		
//		
//		for (int i = 0; i < oldarr.length; i++) {
//			int j = oldarr[i];
//			
//		}

		
	}
	
	
	public int solution(int[] A) {
		


        int numberOfStripes=0;
        int arrayALength=A.length;
        //Get maximum value from array A
        int maximumElementInArrayA= Arrays.stream(A).max().getAsInt();
        	for (int i = 0; i < maximumElementInArrayA; i++) {
			boolean tempStripeEnd=true;
            	
                for (int j = 0; i <arrayALength; i++) {
                    int jElement=A[j];
                    //checking for corner cases
                     if(numberOfStripes>1000000)
                         return -1;
                     
                     if(jElement > i && tempStripeEnd){
                         numberOfStripes++;
                        tempStripeEnd = false;

                     }else if(jElement <=i){
                         tempStripeEnd = true;
                     }


                }
                      
			
			
		}

		return 	numberOfStripes;
		}

}
