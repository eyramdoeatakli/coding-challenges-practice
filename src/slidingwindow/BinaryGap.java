package slidingwindow;

import java.util.Arrays;

public class BinaryGap {
	public static void main(String[] args) {

		int number=12;
		System.out.println(findLongestSequence(number));
		
	}
	
	
	
	public static int findLongestSequence(int number) {
		
		
		String binaryRep=getBinaryRepresentation(number);
		boolean isHasBinGap=isNumberBinaryGap(binaryRep);
		int max=0;

		if(isHasBinGap) {
			char array[]=binaryRep.toCharArray();
			int count=0;
					
			for (int i = 0; i < array.length; i++) {
				if (array[i]=='0') {
					count++;
					max= Math.max(max, count);
				}
				else {
					count=0;
				}		
			}
		}
		return max;

		
	}
	
	
	public static String getBinaryRepresentation(int number) {
		return Integer.toBinaryString(number);
	}
	
	public  static boolean isNumberBinaryGap(String binaryRep) {
		int counter=0;
		boolean isNumberBinary=false;
		String binaryRepAray[]=binaryRep.split("");
		int[] arr = Arrays.stream(binaryRepAray)
                 .mapToInt(Integer::parseInt)
                 .toArray();
		
	
		for (int j = 0; j < arr.length-1; j++) {
			if(counter<2) {
				if(arr[j]-arr[j+1]!=0) {
					counter++;
				}
			}
		}
		
		if(counter>=2) {
			isNumberBinary=true;
		}else {
			isNumberBinary=false;
		}
		
		
		
		return isNumberBinary;

	}
}
