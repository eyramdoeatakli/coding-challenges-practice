package simplestrings;

import java.util.HashSet;

public class PrintDuplicateElements {
	
	public static void main(String[] args) {
		//System.out.println("hello world".replaceAll("\s+",""));
		String charString="yes";
		System.out.printf("The duplicate characters are: ");
		printDuplicateCharacters(charString);
	}

	
	
	public static void printDuplicateCharacters(String charString) {
		
		charString=removeSpaces(charString);
		char charArray[] = charString.toCharArray(); 
		char duplicateCharArray[]= new char[charString.length()];
		HashSet dupcheck= new HashSet<>();
		
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				
				if (charArray[i]==charArray[j]) {
					//duplicateCharArray[i]=charArray[i];
					dupcheck.add(charArray[i]);
					
				}
			}
			
		}
		
		   char c = charArray[0];
		   if( Character.isDigit(c))
		
		System.out.println(dupcheck);
		
	} 
	
	
	
	
	public static String  removeSpaces(String charstring) {
		return charstring.replaceAll("\s+","");
	}
}
