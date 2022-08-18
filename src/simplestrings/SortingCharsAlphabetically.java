package simplestrings;

public class SortingCharsAlphabetically {
	
	public static void main(String[] args) {
		System.out.println(sort("albert"));
		
	}
	
	
	
	public static String sort( String sample) {
		char charray[]=sample.toCharArray();
		
		for (int i = 0; i < charray.length; i++) {
			for (int j = i+1; j < charray.length; j++) {
				System.out.println("i "+i);
				System.out.println("j "+j);
				if( Character.toLowerCase(charray[j]) < Character.toLowerCase(charray[i])) {
					
					swap(charray, i, j);
				}	
			}		
		}
		
		String sortedStr=String.valueOf(charray);
		return sortedStr;
		
	}
	
	
	
	public static void swap(char [] charArray, int i,int j) {
		
		char temp =charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
	}

}
