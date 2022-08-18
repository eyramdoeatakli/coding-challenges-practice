package amazon.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Problem2 {
	
	public static void main(String[] args) {
		//generatePossibleSubstrings("bbacccc");
		//System.out.println(getMaxFreqDeviation("bbacccc"));
		System.out.println(getMaxFreqDeviation("bbacccabab"));

		
	}


	public static int getMaxFreqDeviation(String s) {
		int maxFreqDeviation=0;
		Set<String> possibleSubstrings=generatePossibleSubstrings(s);
        List<String> listOfpossibleSubstrings = new ArrayList<String>(possibleSubstrings);
        
        List<Integer> maxFreqDevList = new ArrayList<Integer>();


		Set<Character> allCharsInStr=retrieveAllCharsInStr(s);
        List<Character> listOfallCharsInStr = new ArrayList<Character>(allCharsInStr);

		Map<Character,Integer> map= new HashMap<>();

		for (int i = 0; i < possibleSubstrings.size(); i++) {
		   	map= new HashMap<>();
			String possibleSubstring=listOfpossibleSubstrings.get(i);
			int j = 0;

			while (j<listOfallCharsInStr.size()) {
				char c=listOfallCharsInStr.get(j);
				int count = (int) possibleSubstring.chars().filter(ch -> ch == c).count();
				if(count==0) {
					j++;
					continue;
				}

				
				if(map.containsKey(listOfallCharsInStr.get(j))) {
					map.put(listOfallCharsInStr.get(j), map.get(listOfallCharsInStr.get(j))+count);
				}
				map.put(listOfallCharsInStr.get(j), count);
				j++;
			}
			maxFreqDeviation=Collections.max(map.values())-Collections.min(map.values());
			maxFreqDevList.add(maxFreqDeviation);

			System.out.println("possibleSubstring "+possibleSubstring);

			System.out.println("biggest "+Collections.max(map.values()));
			System.out.println("smallest "+Collections.min(map.values()));

		}
		
	
       //   System.out.println(Collections.max(maxFreqDevList));

		return Collections.max(maxFreqDevList);



	}
	
	
//	public static int getMaxFreqDeviationCopy(String s) {
//		int maxFreqDeviation=0;
//		Set<String> possibleSubstrings=generatePossibleSubstrings(s);
//        List<String> listOfpossibleSubstrings = new ArrayList<String>(possibleSubstrings);
//        
//        List<Integer> maxFreqDevList = new ArrayList<Integer>();
//
//
//		Set<Character> allCharsInStr=retrieveAllCharsInStr(s);
//        List<Character> listOfallCharsInStr = new ArrayList<Character>(allCharsInStr);
//
//		
//		Map<Character,Integer> map= new HashMap<>();
//		for (int i = 0; i < possibleSubstrings.size(); i++) {
//
//			String possibleSubstring=listOfpossibleSubstrings.get(i);
//
//			for (int j = 0; i < listOfallCharsInStr.size(); j++) {
//				int count = (int) possibleSubstring.chars().filter(ch -> ch == listOfallCharsInStr.get(j)).count();
//				
//				if(map.containsKey(listOfallCharsInStr.get(j))) {
//					map.put(listOfallCharsInStr.get(j), map.get(listOfallCharsInStr.get(j))+1);
//
//				}
//				map.put(listOfallCharsInStr.get(j), count);
//				j++;
//			}
//			maxFreqDeviation=Collections.max(map.values())-Collections.min(map.values());
//			maxFreqDevList.add(maxFreqDeviation);
//		}
//		
//	
//          System.out.println(Collections.max(maxFreqDevList));
//
//		return Collections.max(maxFreqDevList);
//
//
//
//	}
//	
//	
	
	
	  
	static Set<Character> retrieveAllCharsInStr (String s){
		  Set<Character> allCharacterInStr= new HashSet<>();
		       allCharacterInStr = s.chars()
				  .mapToObj(c -> (char) c)
				  .collect(Collectors.toSet());
			return allCharacterInStr;
		
	}
	  
	  static Set<String> generatePossibleSubstrings(String s){
		  
		  Set<String> possibleSubstrings= new TreeSet<>();
		  for (int i = 0; i < s.length(); i++) {
			   for (int j = i+1; j <= s.length(); j++) {
				   possibleSubstrings.add(s.substring(i,j));			 
			   }
			   
		  
	  }
		  // possibleSubstrings.stream().forEach(System.out::println); 

		return possibleSubstrings;
	
}
}