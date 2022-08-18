package permutations;

public class StringPermutation {
	
	public static void main(String[] args) {
		
		String str="aabb";
		int n=str.length();
		calculate(str, 0, n-1);
		
	}
	

	
	
	
	private static void calculate(String str,int left,int right) {
		
		if(left==right) {
			System.out.println(str);
		}
		else {
			
			for (int i = left; i <= right; i++) {
	
				String swapped=swap(str, left, i);
				//System.out.println("swapped"+swapped);

				calculate(swapped, left+1, right);				
			}
		}
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
