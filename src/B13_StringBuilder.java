
public class B13_StringBuilder {

	
	public static void main(String[] args) {
		
		
		// append(value) : 맨 뒤에 해당 값을 추가한다
		// insert(index, value) : 원하는 위치에 해당 값을 추가한다
		StringBuilder brutepassword = new StringBuilder(); // java.lang 패키지에 있는 클래스라 따로 import 없어도됨
		brutepassword.insert(0,'z');
		brutepassword.insert(0,'c');
		brutepassword.insert(0,'b');
		brutepassword.insert(0,'a');
		System.out.println(brutepassword);
		
		StringBuilder builder1 = new StringBuilder("abc");
		builder1.insert(2, 123);
		System.out.println(builder1);
	}
}
