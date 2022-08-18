package arrays;

import java.util.Set;
import java.util.TreeSet;

public class FrogQuestion {
	
	public static void main(String[] args) {
		
		int[] A= {1,2,1,4,2,3,5,4};
		System.out.println(solution(5, A));
		
	}
	
	
	
	 public static int solution(int X, int[] A){
		    int steps=-1;
		    
		    Set<Integer> values = new TreeSet<Integer>();
		    for(int i=0; i<A.length;i++){
		        if(A[i]<=X){
		            values.add(A[i]);
		        	System.out.println("i "+i);

		        }
		        if(values.size()==X){ 	
		        	System.out.println("values size "+values.size());
		            steps=i;
		        	//System.out.println("steps "+steps);

		            break;
		        }
		        
		    }
		        return steps;
	 }

}
