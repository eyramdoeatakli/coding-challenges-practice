package hackerrankpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class lexicoorderedsubtringsWithLengthk {
	public static void main(String[] args) {
		String s="welcometojava";
	//	System.out.println(s.substring(0,3));
		
		//sortStringsLexicographically(s, 3);
		System.out.println(getSmallestAndLargest(s, 3));
		
	}
	
	/*
	 * Steps
	 * 1.Generate all possible substrings of a given length
	 * 2.sort them lexicographically and return largest
	 * and smallest.
	 * */

	
	
	static String getSmallestAndLargest(String s,int k) {
		String result="";
		List<String> listOfStrings=sortStringsLexicographically(s, k);
		
		result=listOfStrings.get(0)+"\n"+listOfStrings.get(listOfStrings.size()-1);
		return result;	
	} 
	
	
	public static  List<String> sortStringsLexicographically(String s,int k) {
		List<String> strList=new ArrayList<>();
		String strInquestion="";
		int i=0;
		int j=k;
		
		while(j<s.length()+1) {
			strInquestion=s.substring(i, j);
			strList.add(strInquestion);
			i++;
			j++;
		}
		
		Collections.sort(strList);
		return strList;
	}
	
	
	
	
//	 public static void main(String[] args) {
//	     Scanner scan=new Scanner(System.in);
//	    String str=scan.next();
//	    int k=scan.nextInt();
//	    System.out.println(getSmallestAndLargest(str, k));
//
//	    }
//	    
	
	
	//      How to sort strings java
	        static String getSmallestAndLargest2(String s,int k) {
	        String result="";
	        SortedSet<String>listOfStrings=sortStringsLexicographically2(s, k);
	        
	        result=listOfStrings.first()+"\n"+listOfStrings.last();
	        return result;    
	    } 
	    
	    
	    public static  SortedSet<String> sortStringsLexicographically2(String s,int k) {
	        SortedSet<String> strList=new TreeSet<>();
	        String strInquestion="";
	        int i=0;
	        int j=k;
	        
	        while(j<s.length()+1) {
	            strInquestion=s.substring(i, j);
	            strList.add(strInquestion);
	            i++;
	            j++;
	        }
	        
	        return strList;
	    }
	
	
}
