package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class SentencesConsecutiveOrSIngle {
	
	public static void main(String[] args) {
		String sentenceOne="Black is white.  Day is night.  Understanding is ignorance.";
		String sentenceTwo="Truth is fiction.  Safety is danger.";
		String allSentences=sentenceOne+"\n"+sentenceTwo;
		//String sentenceToWorkwith=allSentences.replace("  ", " ");
		//System.out.println(sentenceToWorkwith);
		System.out.println(getEligibleSentences(allSentences,30,37));

		;

		
	}
	
	
	static String getEligibleSentences(String sentenceToWorkwith,int min, int max) {	
		String result="not found 1";
		StringBuffer res= new StringBuffer();
		
		//check min max to see if they are positive integers between 0 and 1000
		String [] arrToProcess =splitStringToArr(sentenceToWorkwith);
		for (int i = 0; i < arrToProcess.length; i++) {
			String string = arrToProcess[i]+" ";
		 	System.out.println("i"+i); 

	
			
			if(min==max) {	
			 	System.out.println(string); 
			 //	System.out.println(string.length()); 
				if(string.length()==max||string.length()+1==max) {
					res=res.append("\n").append(string);
				 //	System.out.println(res.toString()); 
				    result= res.toString();
				}
//				}else {
//					result="not found 1";
//				}
			}
		
			else {
			 	System.out.println("i"+i); 

				if(i<4) {
				 string = arrToProcess[i]+" "+arrToProcess[i+1];
				 	//System.out.println(string); 
				if (string.length()>=min&&string.length()<=max) {
					result=arrToProcess[i]+" "+arrToProcess[i+1];
				}	
			}
				
				
				
			}
			
		}

		
		
		
		return result;
	}
	
	
	
	static String[] splitStringToArr(String sentenceToWorkwith) {
		    String newSe=sentenceToWorkwith.replace("\n", "  ");
            String[] split = newSe.split("  ");
		    String processedStr[]=new String[split.length];
	        for (int i = 0; i < split.length; i++) {
				//processedStr[i]= split[i]+" ";
				processedStr[i]= split[i];
				
			}
	        
	        return processedStr;
	        
	        
	     //   Stream stream = Arrays.stream(processedStr);
	       // stream.forEach(System.out::println);
	     //   System.out.println(processedStr.length);
	       // System.out.println(processedStr[0]+processedStr[1]+processedStr[2]+processedStr[3]+processedStr[4]);
	    //    
	

}
	
	
}