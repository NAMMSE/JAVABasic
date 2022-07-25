package quiz;

import java.util.Scanner;

public class B07_PrintReverse {

	/*
	 * 사용자로부터 문장을 입력받으면 그 문장을 거꾸로 출력하는 프로그램을 만들어보세요
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("문장을 입력하세요>>");
		String sen = sc.nextLine();

		for (int i = sen.length() - 1; i >= 0; i--) {
			System.out.print(sen.charAt(i));
		}

		System.out.print("\n");
		
		for(int i = 1 ; i <= sen.length()-1 ; i++) {
			System.out.print(sen.charAt(sen.length() - i));
			
		}
		
		
	}
}
