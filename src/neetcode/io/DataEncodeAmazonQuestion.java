package neetcode.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataEncodeAmazonQuestion {
	
	public static void main(String[] args) {
		
		//System.out.println(encodeString2("aaabbc"));
		System.out.println(encodeString("aaabbc"));
	}
	
	
	static String encodeString(String plainString) {
		
		StringBuilder encodedString = new StringBuilder();
		int counter=0;
		char [] charArray=plainString.toCharArray();
		char previousChar=charArray[0];


			
		
		for (char c:charArray) {
			
			char currentChar=c;
		//	System.out.println(currentChar);
			System.out.println("previousChar"+previousChar+"  "+"currentChar"+currentChar);


			
			if(previousChar==currentChar) {
				counter++;
			}
			else {
				encodedString.append(counter).append(previousChar);
				
				previousChar=currentChar;
				counter=1;
			}	
			
		}
		  encodedString.append(counter).append(previousChar);

		
		return encodedString.toString();
		
	}
	
	
	static String encodeString2(String plainString) {
		
		StringBuilder encodedString = new StringBuilder();
		int counter=0;
		List<Character> charlist=new ArrayList<>();
		Map <Character,Integer> charMap= new HashMap<>();


		
		for (int i = 0; i <plainString.length(); i++) {
			char currenthar=plainString.charAt(i);
			
			if(charMap.containsKey(currenthar)) {
				charMap.put(currenthar, charMap.get(currenthar)+1);

			}else {
				charMap.put(currenthar,1);
				charlist.add(currenthar);
			}
		}
		
		
		for (int i = 0; i <charlist.size(); i++) {
			char currenthar=charlist.get(i);
			encodedString=encodedString.append(charMap.get(currenthar)).append(currenthar);
			
		}
	
		return encodedString.toString();
		
	}

}
