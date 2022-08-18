package amazon.hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
	
	
	
public static void main(String[] args) {
	
	List<String> logs =Arrays.asList("88 99 200","88 99 300","99 32 100","12 12 15");
	processLogs(logs, 2);
	
}


 static void processLogs(List<String> logs, int threshold) {
	 
	 String transaction="";
	 
	 Map <String,Integer> map=	new HashMap<>();
	 for (int i = 0; i < logs.size(); i++) {
		 transaction=logs.get(i);
		 
		String[] arr=transaction.split(" "); 
		for (int j = 0; j < arr.length-1; j++) {
			
			//System.out.println(arr[j]+" "+arr[j+1]);

			  if(Integer.valueOf(arr[j])==Integer.valueOf(arr[j+1])) {
				populateMap(map, 0, arr);
				break;
				
			}else {
				populateMap(map, j, arr);
			}
		}
		}
	 

	 iterateUsingEntrySet(map, threshold);
	 
	 
	}
 

 
 static void iterateUsingEntrySet(Map<String, Integer> map, int th) {
	 List<String> keys= new ArrayList<>();
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	    	if (entry.getValue()>=th)
	    		keys.add(entry.getKey());
	    }
	    
	    keys.stream().forEach(System.out::println);
	}


 static void populateMap(Map<String, Integer> map, int j, String[] arr) {
	if(map.containsKey(arr[j])) {
		map.put(arr[j], map.get(arr[j])+1);
	}else {
		map.put(arr[j], 1);
	}
}




}
