package quiz;

import java.util.Scanner;

public class B07_CountAlphabet {

	
	/*
	 ����ڰ� ����� �˻��ϰ� ���� ���ĺ��� �Է��ϸ� �ش� ���ĺ��� ��ȸ �����ϴ��� �˷��ִ� ���α׷�
	 (��/�ҹ��� ��� ����� ��) 
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		String sen = sc.nextLine();

		System.out.print("�˻��ϰ� ���� ���ĺ��� �Է��ϼ���>>");
		String alp = sc.next();
		int big = 0;
		int small = 0;
		int cnt=0;

		/* ���ڵ�
		if( alp.length()>1) {
			System.out.print("�˻���� �ϳ��� �Է��ϼž� �մϴ�."); 
			return;
			}
		
		for (int i = 0; i < sen.length(); i++) {
			if ((int) alp.charAt(0) < 91 && (int) alp.charAt(0)>64) { // �ƽ�Ű �ڵ� ���� �빮�� ���� ����
				if (sen.charAt(i) == (char) (alp.charAt(0))) { // �Է¹��� ������ ���� ���ڿ� �˻��ϰ� ���� ���ĺ� ��
					big++;
				} else if (sen.charAt(i) == (char) (alp.charAt(0) + 32)) { // �ҹ����� ��� �ҹ��� ī��Ʈ
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
		System.out.printf("\"%s\" ���� %s �� ������ �빮�ڴ� %d��, �ҹ��ڴ� %d�� �Դϴ�.", sen, alp, big, small);
*/
		char q1 = alp.charAt(0);
		char q2;
		
		//'a' = 97, 'A' = 65
		// �ҹ��ڰ� �빮�ڰ� �Ǳ� ���ؼ��� -32 �ݴ�� +32
		if (q1 >= 'a' && q1 <= 'z') {
			q2 = (char) (q1 - Math.abs('A' - 'a'));
		} else if (q1 >= 'A' && q1 <= 'Z') {
			q2 = (char) (q1 + 32);
		} else {
			System.out.println("�˻���� ��� �Է��� �� �ֽ��ϴ�..");
			return;
		}

		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (ch == q1 || ch == q2) {
				cnt++;

			}
		}
		System.out.printf("%s���� %c, %c�� %dȸ �����մϴ�.\n", sen, q1, q2, cnt);
	}

}
