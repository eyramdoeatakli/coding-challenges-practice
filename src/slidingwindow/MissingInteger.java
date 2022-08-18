package slidingwindow;

import java.util.Arrays;

public class MissingInteger {
	
	public static void main(String[] args) {
		
	}

	
	
	static int missingInt(int arr[]) {
		int missingInteger=0;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int diff=arr[i+1]-arr[i];
			if(diff>1) {
				missingInteger=arr[i]+1;
			}	
			else if(diff<0) {
				missingInteger=1;
			}
		}
		return missingInteger;
		
	}
}
