package andela.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Question1 {
	
	public static void main(String[] args) {
		
		int numbers[]= {6,2,4,10};
		//int numbers[]= {4,2,1,3};
		//int numbers[]= {4,-2,-1,3};
		closestNumber(numbers);
	}
	
	
	private class Key {
		int elementi;
		int elementj;

		public Key(int elementi, int elementj) {
			super();
			this.elementi = elementi;
			this.elementj = elementj;
		}
		public int getElementi() {
			return elementi;
		}
		public void setElementi(int elementi) {
			this.elementi = elementi;
		}
		public int getElementj() {
			return elementj;
		}
		public void setElementj(int elementj) {
			this.elementj = elementj;
		}	}

	
	
   public static void closestNumber(int numbers[]) {
    	
    	int absDifference=0;
    	Question1 question1 = new Question1();
    	Map<Key, Integer> map = new HashMap<>();
    	
    	
    	for (int i = 0; i < numbers.length; i++) {
			int ielem = numbers[i];
			
			for (int j = i+1; j < numbers.length; j++) {
				int jelem = numbers[j];
				absDifference=Math.abs(ielem-jelem);
		    	Question1.Key key =question1.new Key(ielem, jelem);
		    	map.put(key, absDifference);			
			}
			
			
			
		}
    	

    	
        int minAbsDifference = Collections.min(map.values());
          ArrayList<Integer> arrElemI= new ArrayList<>();
          ArrayList<Integer> arrElemJ= new ArrayList<>();
          
        for (Map.Entry<Key, Integer> entry : map.entrySet()) {
	    	if (entry.getValue()==minAbsDifference) {
	    		arrElemI.add(entry.getKey().getElementi());
	    		arrElemJ.add(entry.getKey().getElementj());
	    	}
	    }
        Collections.sort(arrElemI);	 
        Collections.sort(arrElemJ);
        int i=0;
   
        while(i<arrElemI.size()) {
            System.out.println(arrElemI.get(i)+" "+arrElemJ.get(i)+"\n");
            i++;
        }

    }
}
