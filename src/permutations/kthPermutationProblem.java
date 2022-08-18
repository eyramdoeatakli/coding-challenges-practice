package permutations;

import java.util.ArrayList;
import java.util.List;

public class kthPermutationProblem {
	
	public static void main(String[] args) {
		
		String str="ABC";
		int n=str.length();
		int k=4;
		List<String> permList= new ArrayList<>();
		//List<String> kthperm=calculate1(str, 0, n-1,4,permList);
		String kthperm=calculate(str, 0, n-1,k);
		System.out.println(kthperm);
		
	}
	

	
	
	
	 static String calculate(String str,int left,int right,int k) {
		int kcounter=0;
		System.out.println("kcounter "+kcounter);
		if(left==right &&k==4) {
			return str ;
			//System.out.println(str);
			//permList.add(str);
		}
		else {
			
			for (int i = left; i <= right; i++) {
	
				 String swapped=swap(str, left, i);
				 kcounter++;
				 calculate(swapped, left+1, right,k);				
			}
		}
		return str;
	} 
	
	
	
	private static List<String> calculate1(String str,int left,int right,int k,List<String>permList) {
		int kcounter=0;
		
		if(left==right &&k==4) {
			System.out.println(str);
			//permList.add(str);
		}
		else {
			
			for (int i = left; i <= right; i++) {
	
				 String swapped=swap(str, left, i);
				 kcounter++;
				 calculate1(swapped, left+1, right,k,permList);				
			}
		}
		return permList;
	} 
	
	
	
	
	private static String swap(String str,int i, int j) {
		 char temp;
		char [] arr=str.toCharArray();
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

}
