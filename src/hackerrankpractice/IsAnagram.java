package hackerrankpractice;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    String str1=scan.next();
	    String str2=scan.next();
		System.out.println(areAnagram(str1, str2));
		
	}
	
	static boolean areAnagram(String str1, String str2)
    {
        // Get lengths of both strings
        int n1 = str1.length();
        int n2 = str2.length();
        
        str1=  str1.toLowerCase();
        str2=str2.toLowerCase();
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        char [] str1CharArr=str1.toCharArray();
        char [] str2CharArr=str2.toCharArray();
        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);
 
        
        System.out.println(String.valueOf(str1CharArr));
        // Compare sorted strings
        if(String.valueOf(str1CharArr).equals(String.valueOf(str2CharArr))) {
            return true;

          }
		return false;
 
    }

}
