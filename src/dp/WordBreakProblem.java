package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakProblem {
	
	public static void main(String[] args) {
		String str="applepen";
		List<String> dict= new ArrayList<>();
		dict.add("apple");
		dict.add("pen");
		System.out.println(wordBreak(str, dict));
		
		
	}

	
	static boolean wordBreak(String s, List < String > wordDict) {
		  Set < String > wordDictSet = new HashSet < > (wordDict);
		  boolean[] dp = new boolean[s.length() + 1];
		  dp[0] = true;
		  for (int i = 1; i <= s.length(); i++) {
		    for (int j = 0; j < i; j++) {
		      if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
		        dp[i] = true;
		        break;
		      }
		    }
		  }
		  System.out.println(s.length());
		  return dp[s.length()];
		}
}
