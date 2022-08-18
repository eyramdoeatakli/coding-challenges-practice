package review;

public class Test {
	public static String removeAllDigit(String str)
    {
        // Replaces all the sequence of characters
        // that matches the given regex with
        // the given replacement string
        return str.replaceAll("\\d", "");
    }
  
    // Driver Code
    public static void main(String args[])
    {
  
        // Given alphanumeric string str
        String str = "GeeksForGeeks123";
        str="345";
  
        // Print the modified string
        System.out.println(str);
    }
}


