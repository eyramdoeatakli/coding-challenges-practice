
package simplestrings;

public class AccessModifiersDemo {
	public String name;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public String getAge() {
		return age;
	}
	void setAge(String age) {
		this.age = age;
	}


public static void main(String[] args) {
	new AccessModifiersDemo().name="";
}
}
