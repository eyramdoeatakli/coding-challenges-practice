package simplestrings;

public class ReversString {
	
	
	
	public static void main(String[] args) {
		System.out.println("Reversed array is: ");
       // new ReversString().reverseString("barbi");
		new ReversString().reverseStringMoreElegantSol("soul");

		
	}
	
	
	public void reverseString(String strToBeReversed) {
		
		//convert string to character array
		char [] charArray=strToBeReversed.toCharArray();
		//what are the edge cases for this
		int i = 0;
		while (i<charArray.length) {
			for (int j = charArray.length-1; j >= 0; j--) {
				
				if((i==j) ) {		
				System.out.print(charArray);
				
                   return;
				}
				
				else if ( j-i==1) {
					swap(charArray, i, j);
					System.out.println(charArray);
	                return;
				}
				else {
					swap(charArray, i, j);
					i++;
				}
				
			}
		}
	}
	
	public void reverseStringMoreElegantSol(String strToBeReversed) {
		//convert string to character array
		char [] charArray=strToBeReversed.toCharArray();
		String reversedStr="";
		//what are the edge cases for this
			for (int j = charArray.length-1; j >= 0; j--) {
				reversedStr= reversedStr+charArray[j];
			}
			System.out.print("More elegant solution is ");
			System.out.print(reversedStr);
	
	}
	
	
	
	


	
	public void swap(char [] charArray, int i,int j) {
		
		char temp =charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
	}

}
