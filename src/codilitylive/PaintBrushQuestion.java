package codilitylive;

import java.util.Arrays;
import java.util.List;

public class PaintBrushQuestion {
	
	public static void main(String[] args) {
		//int [] heightArray= {1,3,2,1,2,1,5,3,3,4,2};
	//	int [] heightArray= {1,3,2,1,2,1,5,3,3,4,2};
	//	int [] heightArray= {4,1,2,1,2,2};
		int [] heightArray= {1,4,3,2,3,1};
		System.out.println(numberOfStrokes(heightArray));
		
	}

	
	
	static int numberOfStrokes(int [] heightArray) {	
		int minNumberOfStrokes=0;
		Integer [] minStrokeArray= new Integer [heightArray.length];
		minStrokeArray[0]=heightArray[0];
	//	System.out.println(minStrokeArray[0]);
		for (int i = 0; i < heightArray.length-1; i++) {
			
			if(heightArray[i+1]<=heightArray[i]) {
				minStrokeArray[i+1]=0;
			}else {
				minStrokeArray[i+1]=heightArray[i+1]- heightArray[i];
			//	System.out.println(minStrokeArray[i]);

			}
			
		}
		
		for (int i = 0; i < minStrokeArray.length; i++) {
				System.out.println(minStrokeArray[i]);
			
		}
		Arrays.stream(minStrokeArray).forEach(null);
		
		
		
	//	System.out.println(minStrokeArray[10]);

		List<Integer> integers =Arrays.asList(minStrokeArray);
		Integer sum = integers.stream()
				  .mapToInt(Integer::intValue)
				  .sum();
		
		//System.out.println(sum);
		return sum;
	}
	
}
