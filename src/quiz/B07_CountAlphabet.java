package quiz;

import java.util.Scanner;

public class B07_CountAlphabet {

	
	/*
	 사용자가 문장과 검색하고 싶은 알파벳을 입력하면 해당 알파벳이 몇회 등장하는지 알려주는 프로그램
	 (대/소문자 모두 세어야 함) 
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요>>");
		String sen = sc.nextLine();

		System.out.print("검색하고 싶은 알파벳을 입력하세요>>");
		String alp = sc.next();
		int big = 0;
		int small = 0;
		int cnt=0;

		/* 내코드
		if( alp.length()>1) {
			System.out.print("검색어는 하나만 입력하셔야 합니다."); 
			return;
			}
		
		for (int i = 0; i < sen.length(); i++) {
			if ((int) alp.charAt(0) < 91 && (int) alp.charAt(0)>64) { // 아스키 코드 에서 대문자 범위 설정
				if (sen.charAt(i) == (char) (alp.charAt(0))) { // 입력받은 문장의 개별 문자와 검색하고 싶은 알파벳 비교
					big++;
				} else if (sen.charAt(i) == (char) (alp.charAt(0) + 32)) { // 소문자일 경우 소문자 카운트
					small++;
				}
			}

			else if ((int) alp.charAt(0) > 96 && (int) alp.charAt(0)<123) {
				if (sen.charAt(i) == (char) (alp.charAt(0) - 32)) {
					big++;
				} else if (sen.charAt(i) == (char) (alp.charAt(0))) {
					small++;
				}
			}
		}
		System.out.printf("\"%s\" 에서 %s 의 개수는 대문자는 %d개, 소문자는 %d개 입니다.", sen, alp, big, small);
*/
		char q1 = alp.charAt(0);
		char q2;
		
		//'a' = 97, 'A' = 65
		// 소문자가 대문자가 되기 위해서는 -32 반대는 +32
		if (q1 >= 'a' && q1 <= 'z') {
			q2 = (char) (q1 - Math.abs('A' - 'a'));
		} else if (q1 >= 'A' && q1 <= 'Z') {
			q2 = (char) (q1 + 32);
		} else {
			System.out.println("검색어는 영어만 입력할 수 있습니다..");
			return;
		}

		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (ch == q1 || ch == q2) {
				cnt++;

			}
		}
		System.out.printf("%s에서 %c, %c는 %d회 등장합니다.\n", sen, q1, q2, cnt);
	}

}
