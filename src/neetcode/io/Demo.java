package neetcode.io;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
		List<String> res=Arrays.asList("Hello","World");
		
		String val=res.stream()
				      .collect(Collectors.joining(" "));
		System.out.println(val);
	}

}
