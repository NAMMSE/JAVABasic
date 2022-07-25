package quiz;

import java.util.Scanner;

public class B07_Palindrome {

	/*
	 * 사용자로부터 단어를 하나 입력받았을때 해당단어가 완벽하게 대칭인지 아닌지 구분하는 프로그램
	 * 
	 * 단어 예시 - LEVEL 스위스 일요일 기러기 abba
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요>>");
		String word = sc.nextLine();
		int cnt = 0;

		if(word.length() == 1) {
			System.out.println("이 단어는 1글자입니다.");
		}

		else {
			for (int i = 1; i <= word.length() / 2; i++) { // 글자의 50%만 비교해도 대칭 유무 확인 가능하기 때문에 반복문 조건에 /2 붙여줌
				// System.out.printf("%c ",word.charAt(i-1));
				// System.out.printf("%c ",word.charAt(word.length()-i));
				if (word.charAt(i - 1) == word.charAt(word.length() - i)) { // 첫글자와 마지막글자 그뒤와 그 앞 글자 비교해줘서 같으면 카운트 +1
					cnt++;
				}
			}
			if (cnt == word.length() / 2) {// 마찬가지로 50%만 비교하면 확인 가능하고 실제로 50%만 비교했기때문에 카운트도 길이의 반값만큼 카운트가 됐는지 확인
				System.out.println("이 단어는 대칭인 단어입니다.");
			} 
			else {
				System.out.println("이 단어는 비대칭인 단어입니다.");
			}
		}

	}
}

/*
 * 강사님 코드
 * for( int index = 0; index < word.length(); ++index){
 * char ch = word.charAt(index);
 * System.out.println(index + "번째 글자: " + ch);
 * char front_ch = word.charAt(index);
 * char back_ch = word.charAt(word.length()- index -1);
 * 이후론 코드 똑같음
 */

				

