package quiz;

import java.util.Scanner;

public class B07_PrintReverse {

	/*
	 * ����ڷκ��� ������ �Է¹����� �� ������ �Ųٷ� ����ϴ� ���α׷��� ��������
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���>>");
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
