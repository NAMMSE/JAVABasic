import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// split(delimiter) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다
		String[] split = fruits.split("/");
		System.out.println(Arrays.toString(split));
		
		// String.join(delimiter, CharSequence...) : 뒤에 나열한 문자열을 모두 연결한다
		// String.join(delimiter, iterable) : 배열(또는 리스트 등)의 모든 문자열을 연결한다
		String join = String.join(",", "tiger", "lion", "bear", "hawk", "panda");
		System.out.println(join);
		
		join = String.join("/", split); // 위에서 /기준으로 자른 배열을 다시 /로 붙여줌
		System.out.println(join);
		
		// contains(seq) : 해당 문자열에 seq 내용이 있는지 true false 로 알려준다
		System.out.println("오렌지가 있나요? "+fruits.contains("orange"));
		System.out.println("복숭아가 있나요? "+fruits.contains("peach"));
		
		// startsWith(seq) : 해당 문자열로 시작하는지를 검사한다
		String url = "http://www.naver.com";

		System.out.println("www로 시작하나요? "+url.startsWith("www"));
		System.out.println("http로 시작하나요? "+url.startsWith("http"));
		System.out.println("https로 시작하나요? "+url.startsWith("https"));

		// endsWith(seq) : 해당 문자열로 끝나는지를 검사한다
		String filename = "screenshot.pdf";

		System.out.println(".gif로 끝나나요? "+filename.endsWith(".gif"));
		System.out.println(".jpg로 끝나나요? "+filename.endsWith(".jpg"));
		System.out.println(".pdf로 끝나나요? "+filename.endsWith(".pdf"));
		
		//replace(old, new) : 문자열을 교체한 새로운 문자열을 반환한다
		String email = "billgates@microsoft.com";
		
		String replaced = email.replace("microsoft.com", "naver.com");
		
		System.out.println(email); // 교체한 문자열을 반환하는 것이지 기존의 문자열을 수정하는 것이 아님
		System.out.println(replaced);
		
		// substring(start) : 문자열을 자른다
		// substring(start, end) : 문자열을 start부터 end미만까지 자른 결과를 반환한다
		email.substring(5);
		
		System.out.println(email); // 역시나 원본은 수정되지 않음
		System.out.println(email.substring(5));
		System.out.println(email.substring(5,10));
		
		// toUpperCase() : 문자열의 알파벳을 모두 대문자로 변환한 인스턴스를 반환한다
		System.out.println(email.toUpperCase());
		
		// toLowerCase() : 문자열의 알파벳을 모두 소문자로 변환한 인스턴스를 반환한다
		System.out.println(email.toLowerCase().toUpperCase().toLowerCase()); // 인스턴스 반환이기때문에 이런것도 가능함
		
		char[] arr = (email.substring(9).toUpperCase().toCharArray());
		System.out.println(arr);
		
		// indexOf(seq) : 원하는 문자열이 몇번쨰 인덱스에 있는지 반환한다
		// indexOf(seq, from) : from부터 원하는 문자열을 검색하여 인덱스를 반환한다
		System.out.println(email.indexOf('@'));
		System.out.println(email.indexOf("micr"));
		int e = email.indexOf('@');
		
		String test = "apple@naver.com, abc@yahoo.co.kr, ddd@hanmail.com";
		
		System.out.println(test.indexOf('@', 0));
		System.out.println(test.indexOf('@', 10));
		System.out.println(test.indexOf('@', 25));
		
		fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// 연습문제 : fruits에서 모든 "apple"의 인덱스를 찾아 출력(반복문 사용)
		
		int index =-1 ; int i=0;
		while(true) {
			index = fruits.indexOf("apple", index+1);
			if(index==-1)break;
			System.out.printf("%d번째 apple 위치 : %d \n", ++i, index);
		}

		// String.format(format, args,...) : 원하는 문자열을 서식을 이용해 생성할 수 있다.
		
	}
}
