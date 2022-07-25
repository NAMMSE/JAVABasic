
public class A01_Escape {

	/*
	 # Escape 문자
	 - 특수한 기능을 가진 문자
	 - 그냥 출력하기 애매한 문자들을 표현하기 위한 방식
	 - \와 하나의 문자가 합쳐져 하나의 문자로 인식하고 특수한 기능 수행(' ' 내부에 넣을 수 있다)
	 */
	public static void main(String [] args) {
		System.out.println("안녕하세요..");
		
		// \t : tab의 기능을 가진 특수문자
		System.out.println("안녕하\t세요..");
		// \\ : \ 하나 출력
		System.out.println("안녕하\\세요..");
		// \" : 큰 따옴표 하나 출력
		System.out.println("안녕하\"세요..");
		// \' : 작은 따옴표 하나 출력
		// ' ' 를 문자열로 사용하는 언어에서 유용하게 사용할 수 있다 (자바는 "" 사용하므로 그냥 ''써도됨)
		System.out.println("안녕하\'세요..");
		System.out.println("안녕하'세요..");
		System.out.println('\'');
		
		}
}
