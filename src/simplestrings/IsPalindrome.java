package simplestrings;

public class IsPalindrome {
	
	public static void main(String[] args) {		
		System.out.println("Is Palindrome: "+checkIfStringIsPalindarome("deifie"));
	}
	
	
	
	public static boolean checkIfStringIsPalindarome(String sampleStr) {
		
		//Convert string to char array
		boolean isPalindrome=false;
		
		char [] charArray= sampleStr.toCharArray();
		int length=charArray.length;
		int i=0;
		
		while (i<length) {
			
			for (int j = length-1; j >=0; j--) {

				
				 if(i==j||j-i==1&&charArray[i]==charArray[j]) {
				isPalindrome=true;
				return isPalindrome; 
		 			 
				 }else {
					 
				if(charArray[i]==charArray[j]) {
				i++;
				}
				else {
					return isPalindrome; 
				}
				
				 }

				
			}
		}
		
		return isPalindrome;
		
	}
	

}
