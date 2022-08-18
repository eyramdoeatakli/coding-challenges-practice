package hackerrank;

public class SubstringEasy {
	
	public static void main(String[] args) {
		System.out.println("sb "+substring("helloworld", 3, 7));
		
	}
	
	
	
	static String substring(String s, int start,int end) {
		String sb=s.substring(start, end-1);
		return sb;
	}

}
