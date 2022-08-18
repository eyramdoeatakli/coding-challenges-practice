package hackerrankpractice;

import java.util.Scanner;

public class IsPalindrome {
	
	public static void main(String[] args) {
		//String s="madams";
		
		
//	    Scanner scan=new Scanner(System.in);
//	    String s=scan.next();
//	    String ans=isPalidrome(s);
//		System.out.println(ans);
		
		if("TAC".equals("TAC")) {
			System.out.println("true");
		}else {
			System.out.println("false");

		}
		
		
	}

	
	
	
	public static String isPalidrome(String S) {
		String isPalindrome="No";
		String reversedStr="";
		S.toLowerCase();
		
		for (int i = S.length()-1; i >= 0; i--) {
			reversedStr=reversedStr+S.charAt(i);	
		}
		//System.out.println(reversedStr);
		
		if(S.equals(reversedStr)) {
			isPalindrome="Yes";
		}
		return isPalindrome;
	}
}
