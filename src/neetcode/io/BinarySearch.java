package neetcode.io;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int array[]= {2,3,4,5,6};
		int low=0;
		int high=array.length-1;
		int element=5;
		
		//System.out.println(binarySearch(array,element,low,high));
		iteratebackwards();
		
	}

	
	static int binarySearch(int array[], int element, int low, int high) {
		int index=-1;
	

	    while (low <= high) {
	        int mid = low  + ((high - low) / 2);
	        if (array[mid] < element) {
	            low = mid + 1;
	        } else if (array[mid] > element) {
	            high = mid - 1;
	        } else if (array[mid] == element) {
	            index = mid;
	            break;
	        }
	    }
	    return index;
}
	
	
	static void iteratebackwards() {
		int k=3;
		//int array[]= {1,2,2,3,3,4,5,5,6};
		//int array[]= {1,2,3,4,5,6};
		int array[]={ 1, 23, 12, 9,
            30, 2, 50 };
		Arrays.sort(array);
		int counter=0;
		int l=array.length-1;
		
		while(counter<k) {
			
			System.out.println(array[l]);
			l--;
			counter++;
		}
	
			
		

		
	}
	
	
}
