package timeComplexity;

public class FrogJump {
	
	public static void main(String[] args) {
		
		int count=solution(10, 85, 30);
		System.out.println(count);
		 
	}
	
	
	
	static int solution(int X, int Y,int D) {
		int counter=0;
		int value=0;
		
		while(value<Y) {	
			if(value==0) {
			  value=X+D;
			}
			else {
				value=value+D;
			}
			counter++;
		}
		return counter;	
	}
	
	

}
