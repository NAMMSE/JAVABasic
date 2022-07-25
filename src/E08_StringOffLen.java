
public class E08_StringOffLen { // 0519 목요일

	public static void main(String[] args) {
		char[] arr = new char[] { 'a','b','c','d','e','f','g','h'};
		
		System.out.println(new String(arr));
		System.out.println(new String(arr, 3, 2)); // 3부터 2개
		System.out.println(new String(arr, 3, 3)); // 3부터 3개
		System.out.println(new String(arr, 3, 4)); // 3부터 4개의 문자를 사용해 문자열 생성
		System.out.println(new String(arr, 0, 5)); // 0부터 5개
	}
}
