import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
	
		HashSet<String> test = new HashSet<>();
		
		test.add("123");
		test.add("456");
		
		System.out.println(test.contains("123"));
		System.out.println(test.contains("23"));
	}
	
}
