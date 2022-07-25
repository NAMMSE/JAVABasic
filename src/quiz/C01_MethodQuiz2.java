package quiz;

import java.util.Arrays;
import java.util.Random;

public class C01_MethodQuiz2 {

	/*
	 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	 
	 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	    (StringBuilder 사용)
	 3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 메서드
	    (StringBuilder 사용)
	 4. 메서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 8개로 이루어진 배열을 반환하는 메서드
	 
	 */
	
	
	public static int appleBasket(int apple, int basket) {
		if(apple < 0 || basket<=0) {
			return -1; // 사과가 0보다 작거나 바구니가 0보다 작으면 에러가 발생할 수 있으므로 -1 반환
		}
		return apple%basket==0 ? apple/basket : apple/basket+1; // 나머지가 없으면 바구니 개수만큼 사과 개수가 딱 맞고 나머지가 생기면 바구니가 하나 더 있어야 함
	}
	
	public static StringBuilder randomstr(String str) {
		StringBuilder ranstr = new StringBuilder();    // 랜덤으로 골라낸 str의 각 문자들을 insert 해주기 위한 스트링빌더
		
		int[] ran = new int[str.length()];   // 중복없이 n개만큼 숫자를 뽑아서 배열에 저장하는 반복문
		for(int i = 0 ; i<ran.length;i++) {
			int newnum = (int)(Math.random()*str.length());
			ran[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==ran[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0 ; i<str.length();i++) {  // 스트링의 길이만큼 배열에 랜덤으로 인덱스를 저장하고 해당 인덱스의 문자들을 ranstr에 insert 하여 넣어줌
			ranstr.insert(0, str.charAt(ran[i]));
		}
		
		return ranstr;
	}
	
	//강사님 코드 - 문자열 섞기 1 
	public static String strShuffle(String str) {
		Random ran = new Random();
		//문자열 -> char[]로 바꾸기
		char[] arr = str.toCharArray();
		for(int i = 0 ;i<100;i++) {
			int random_index = ran.nextInt(arr.length);
			
			char temp = arr[0];
			arr[0] = arr[random_index];
			arr[random_index] = temp;
		}
		// 다 섞은 다음 char[]을 문자열로 변환하여 리턴 (그냥 arr 적으면 에러뜸)
		return new String(arr);
	}
	// 강사님 코드 - 문자열 섞기 2
	public static String BuilderShuffle(String str) {
		// 새로운 Stringbuilder를 만들때 문자열을 전달할 수 있다.
		StringBuilder builder = new StringBuilder(str);
		Random ran = new Random();
		for(int i =0;i<100; i++) {
			int random_index = ran.nextInt(builder.length());
			
			// builder.charAt(index) : 해당 인덱스의 문자를 하나 꺼내옴
			// builder.setCharAt(index, char) : 해당 인덱스를 전달한 문자로 수정함
			char temp = builder.charAt(0);
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
		}
		return builder.toString();
	}
	
	public static String reversestr(String str) {
		StringBuilder revstr = new StringBuilder();
		for(int i=0;i<str.length();i++) { // 0번째 문자부터 마지막 문자까지 문자열의 가장 앞에 넣어주면 끝까지 돌았을때 역순이 된다
			revstr.insert(0,str.charAt(i));
		}
		
		return revstr.toString();
	}
	
	// 강사님 코드 - 문자열 뒤집기
	public static String strReverse(String str) {
		StringBuilder builder = new StringBuilder(str);

		// builder. reverse() : 빌더에 들어있는 내용을 거꾸로 바꾼다
		 return builder.reverse().toString();
	}
	
	public static int[] randomnum() {
		Random random = new Random();
		int[] ran = new int[8];
		for(int i = 0 ; i<ran.length;i++) {
			int newnum = random.nextInt(45)+1;
			ran[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==ran[j]) { // 만약 겹치는 숫자가 나오면
					i--;			 // --i로 다시 숫자를 뽑음
					break;
				}
			}
		}
		return ran;
	}
	
	public static void main(String[] args) {
		//1번
		System.out.println("필요한 바구니의 개수 : "+appleBasket(6,5));
		int basketcount = appleBasket(21, 8);
		switch (basketcount) {
		case -1: // appleBasket 메서드에서 오류 발생할까봐 -1로 리턴한게 만약 오면 그걸 받아서 잘못된 경우라고 출력함
			System.out.println("잘못된 경우입니다.");
			break;
		default:
			System.out.println("필요한 바구니의 개수 : "+basketcount);
			break;
					
		}
		
		System.out.println(BuilderShuffle("hello, world!"));
		System.out.println(strShuffle("hello, world!"));
		
		
		//2번
		
		System.out.println("문자열 랜덤으로 >> "+randomstr("ABCDEFG"));
		
		//3번
		System.out.println("문자열 거꾸로 >> "+reversestr("ABCDEFG"));
		System.out.println("문자열 거꾸로 >> "+strReverse("ABCDEFG"));
		System.out.println("8개의 중복없는 랜덤 숫자 : "+Arrays.toString(randomnum()));
		
		
	
	}
}
