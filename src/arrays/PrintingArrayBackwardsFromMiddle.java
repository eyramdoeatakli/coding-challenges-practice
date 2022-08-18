package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintingArrayBackwardsFromMiddle {
	
	public static void main(String[] args) {
		
	          demo();
	}
	
	
	public static void demo() {
	int arr []= {3,8,9,7,6};
		
		int k=2;
		int newArr[]= new int [arr.length];
		int startIndex=arr.length-k;
		int j=0;
		//System.out.println("start index "+startIndex);

		
		for (int i =startIndex ; i <= newArr.length-1; i++) {
			newArr[j]=arr [i];
			//System.out.println(i);
			j++;
		}
		
		for (int i = 0; i <startIndex; i++) {
			newArr[j] =arr[i];
			j++;
		}
		
        IntStream stream = Arrays.stream(newArr);
        stream.forEach(System.out::println);
		//System.out.println(newArr[0]);
		
	}

}
