package simplestrings;

public class RemoveGivenElementFromString {
	
	public static void main(String[] args) {
		//removeGivenElement('n', "given");
	    String sub = "give".substring(1);
	    System.out.println(sub);

		
	}
	
	
	public static void removeGivenElement(char elementToBeRemoved,String str) {
		char [] charArray=str.toCharArray();
	    String 	newStr="";
	
		for (int i = 0; i < charArray.length; i++) {
			if ( charArray[i]==elementToBeRemoved) {
		      System.out.println("Do nothing");	
			}
			else {
				newStr=newStr+charArray[i];
			}
		}
	      System.out.println(newStr);	
		
	}



}
