package arrays;

import java.util.Arrays;

public class MissingPermElement {
	
	public static void main(String[] args) {
		
		int[] permArray= {2,3,1,4,5};
		System.out.println(returnMissingElem(permArray));
		
	}
	
	static int returnMissingElem(int[] A) {
		Arrays.sort(A);
		int missingElem=0;
		//if length is zero then missing perm will be one
		
		for (int i = 0; i < A.length-1; i++) {
			int diff=A[i+1]-A[i];
			if(diff>1) {
				missingElem=A[i]+1;
			}
			
		}
		if(missingElem==0) {
			int lenghth=A.length;
			missingElem=A[lenghth-1]+1;
		}
		return missingElem;
		
	}

}
