package quiz;

import java.util.Scanner;

public class B07_Palindrome {

	/*
	 * ����ڷκ��� �ܾ �ϳ� �Է¹޾����� �ش�ܾ �Ϻ��ϰ� ��Ī���� �ƴ��� �����ϴ� ���α׷�
	 * 
	 * �ܾ� ���� - LEVEL ������ �Ͽ��� �ⷯ�� abba
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��ϼ���>>");
		String word = sc.nextLine();
		int cnt = 0;

		if(word.length() == 1) {
			System.out.println("�� �ܾ�� 1�����Դϴ�.");
		}

		else {
			for (int i = 1; i <= word.length() / 2; i++) { // ������ 50%�� ���ص� ��Ī ���� Ȯ�� �����ϱ� ������ �ݺ��� ���ǿ� /2 �ٿ���
				// System.out.printf("%c ",word.charAt(i-1));
				// System.out.printf("%c ",word.charAt(word.length()-i));
				if (word.charAt(i - 1) == word.charAt(word.length() - i)) { // ù���ڿ� ���������� �׵ڿ� �� �� ���� �����༭ ������ ī��Ʈ +1
					cnt++;
				}
			}
			if (cnt == word.length() / 2) {// ���������� 50%�� ���ϸ� Ȯ�� �����ϰ� ������ 50%�� ���߱⶧���� ī��Ʈ�� ������ �ݰ���ŭ ī��Ʈ�� �ƴ��� Ȯ��
				System.out.println("�� �ܾ�� ��Ī�� �ܾ��Դϴ�.");
			} 
			else {
				System.out.println("�� �ܾ�� ���Ī�� �ܾ��Դϴ�.");
			}
		}

	}
}

/*
 * ����� �ڵ�
 * for( int index = 0; index < word.length(); ++index){
 * char ch = word.charAt(index);
 * System.out.println(index + "��° ����: " + ch);
 * char front_ch = word.charAt(index);
 * char back_ch = word.charAt(word.length()- index -1);
 * ���ķ� �ڵ� �Ȱ���
 */

				

