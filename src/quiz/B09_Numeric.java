package quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
	 사용자가 어떤 단어를 입력했을 때 해당 단어가 모두 숫자로만 구성되어 있는지 검사하는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요");
		String str = sc.nextLine();
		int cnt = 0;
/*
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				cnt++;
			} 
			else {
				break;
			}
		}
		if (cnt == str.length()) {
			System.out.println("해당 단어는 모두 숫자로 구성되어 있습니다.");
		} 
		else {
			System.out.println("해당 단어는 숫자 외에 불순물이 껴있습니다.");
		}
*/
		//강사님 코두ㅡ
		boolean numbersOnly = true;
		
		for(int i=0; i<str.length() ;i++) {
			char ch = str.charAt(i);
			if(ch<'0' || ch > '9') {
				numbersOnly = false;
				break;
			}
		}
		System.out.println("숫자로만 이루어져있나요?" + numbersOnly);
	}
}
