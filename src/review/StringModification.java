package review;

import java.util.HashMap;
import java.util.Map;

public class StringModification {
	
	public static void main(String[] args) {
		//String [] input= {"brea3king3 news5:","1A 1circle is round1!"};
		String [] input={"break3ing news5:"," 1A 1circle is round!"};
	//	String [] input= {"","Fresh fried fish - fish fresh fried"};

		String fullSentence=output(input);
		System.out.println("Final Sentence "+fullSentence);
		//System.out.println(replaceNumbers("GeeksForGeeks123"));
	}
	
	
	
	public static String output(String [] input) {
		
		String tempSentence="";
		String tempSentence1="";
		
		StringBuffer finalSentence=new StringBuffer("");  

		for (int i = 0; i < input.length; i++) {
			if((input[i].length()!=0)) {
				tempSentence=replaceNumbers(input[i]);
				tempSentence1=capitalizeFirstLetter(tempSentence.trim());
				finalSentence.append(tempSentence1);	
			}
		}	
		return finalSentence.toString().trim();	
	}
	
	public static String replaceNumbers(String tempSentence ){
		String newTemp=tempSentence.replaceAll("\\d", "");
		
		
//		 Map<String,String> myMap = new HashMap<String,String>();
//		    myMap.put("a", "b");
//		    myMap.get(myMap)
		    
			return newTemp;

		
	}
	
	public static String capitalizeFirstLetter(String tempSentence) {
		String tempSent="";
		StringBuffer finalSentence=new StringBuffer("");  

		
		String [] splitInput =tempSentence.split(" ");
		for (int i = 0; i < splitInput.length; i++) {
			System.out.println("splitInput "+splitInput[i]);
			if(splitInput[i].matches("-")) {
			    finalSentence.append(" ").append(splitInput[i]);

			}else {
				String firstLetter=splitInput[i].substring(0, 1).toUpperCase();
			    String remainingLetters = splitInput[i].substring(1, splitInput[i].length());
			    tempSent=firstLetter+remainingLetters;
			    finalSentence.append(" ").append(tempSent);
			}

		    }
	 	return finalSentence.toString();	
		
	}

}
