package andela.hackerrank;

public class Question2 {
	public static void main(String[] args) {
		System.out.println(pointsBelong(0, 0, 2, 0, 4, 0, 2,0, 4, 0));
		
	}
	
	
	
	
	public static double findLength(int x1,int y1,int x2,int y2) {
		int diffX=x2-x1;
		int diffY=y2-y1;
		
		double length= Math.sqrt(Math.pow(diffX, 2)+ Math.pow(diffY, 2)); 
		return length;
		
	}
	
	
	public static Double areaOfTriangle(int x1,int y1,int x2,int y2,int x3,int y3) {
		return Math.abs ((x1 * (y2 - y3) + x2 * (y3 - y1)
			 + x3 * (y1 - y2)) /2.0);
	}
	
	public static boolean isInsideTriangle(int x1,int y1,int x2,int y2,int x3,int y3,int x,int y) {
		   double areaOfABP =areaOfTriangle(x1, y1, x2, y2, x, y);
		   double areaOfBCP =areaOfTriangle(x2, y2, x3, y3, x, y);
		   double areaOfACP =areaOfTriangle(x1, y1, x3, y3, x, y);
		   
		   double areaOfABC =areaOfTriangle(x1, y1, x2, y2, x3, y3);
		   return (areaOfABP+areaOfBCP+areaOfACP)  ==areaOfABC;
	}
	
	
	public static int pointsBelong(int x1,int y1,int x2,int y2,int x3,int y3,int xp,int yp,int xq,int yq) {
		int scenario=0;
		Boolean isDegerateTraingle=isDegenerateTriangle(x1, y1, x2, y2, x3, y3);
		Boolean pointPIsInsideTriangle=isInsideTriangle(x1, y1, x2, y2, x3, y3, xp, yp);
		Boolean pointQIsInsideTriangle=isInsideTriangle(x1, y1, x2, y2, x3, y3, xq, yq);
		
		
		

		 
		 if(isDegerateTraingle) {
			 
			 if(pointPIsInsideTriangle==true &&pointQIsInsideTriangle==false) {
				 scenario=1;
				 return scenario;
			 }else if(pointQIsInsideTriangle==true &&pointPIsInsideTriangle==false) {
				 return scenario=2;
				 
			 }else if(pointPIsInsideTriangle&&pointPIsInsideTriangle) {
				 return scenario=3;
			 }else {
				 return scenario=4;
 
			 }
			 
			 
			 
		 }else {
			 return scenario;	 
		 }
		 
	}
	
	
	public static Boolean isDegenerateTriangle(int x1,int y1,int x2,int y2,int x3,int y3) {
		
		double ab,bc,ac=0;
		
		double ans=Math.abs(findLength(x1,y1,x2,y2));

		
		ab=Math.abs(findLength(x1,y1,x2,y2));
		bc=Math.abs( Math.sqrt(Math.pow(x2-x3,2)+(Math.pow(y2-y3,2))));
		ac=Math.abs( Math.sqrt(Math.pow(x1-x3,2)+(Math.pow(y1-y3,2))));	
		
		if(ab+bc>ac && bc+ac>ab && ab+ac>bc) {
			
			return true;
		}
		return false;
	}
	
	

}
