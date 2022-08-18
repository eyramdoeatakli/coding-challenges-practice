package amazon.hackerank;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
	
	public static void main(String[] args) {
	
		//List<String> logins=Arrays.asList("bag","sfe","cbh","cbh","red");
		List<String> logins=Arrays.asList("");
		System.out.println(countFamilyLogins(logins));
	}
	
	static int countFamilyLogins(List<String> logins) {
		int familyLoginCount=0;
		if(logins.size()==0) {
			return familyLoginCount;
		}
		
		
		for (int i = 0; i < logins.size(); i++) {
			String array_elementi = logins.get(i);
			
			for (int j = i+1; j < logins.size(); j++) {
				String array_elementj = logins.get(j);
				if(array_elementi.equals(array_elementj)) {
					continue;
				}
				String sb= "";

				
				if(array_elementi.charAt(0)-array_elementj.charAt(0)==-1) {

					for (int k = 0; k < array_elementi.length(); k++) {
						if(array_elementi.charAt(k)=='z') {
							sb=sb+'a';		
						}else {
							sb=sb+((char)(array_elementi.charAt(k)+1));			
						}

					}
					if(array_elementj.equals(sb)) {
						familyLoginCount++;
					}
					
				}else if(array_elementi.charAt(0)-array_elementj.charAt(0)==1) {

					for (int k = 0; k < array_elementj.length(); k++) {
						if(array_elementj.charAt(k)=='z') {
							sb=sb+'a';		
						}else {
							sb=sb+((char)(array_elementj.charAt(k)+1));			
						}

					}
					if(array_elementi.equals(sb)) {
						familyLoginCount++;
					}
				}
				
			}
			
		}
		return familyLoginCount;
		
		
		
		
		
		
		
		
		
	}

}
