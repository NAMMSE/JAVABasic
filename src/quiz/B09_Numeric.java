package quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
	 ����ڰ� � �ܾ �Է����� �� �ش� �ܾ ��� ���ڷθ� �����Ǿ� �ִ��� �˻��ϴ� ���α׷��� ��������
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
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
			System.out.println("�ش� �ܾ�� ��� ���ڷ� �����Ǿ� �ֽ��ϴ�.");
		} 
		else {
			System.out.println("�ش� �ܾ�� ���� �ܿ� �Ҽ����� ���ֽ��ϴ�.");
		}
*/
		//����� �ڵΤ�
		boolean numbersOnly = true;
		
		for(int i=0; i<str.length() ;i++) {
			char ch = str.charAt(i);
			if(ch<'0' || ch > '9') {
				numbersOnly = false;
				break;
			}
		}
		System.out.println("���ڷθ� �̷�����ֳ���?" + numbersOnly);
	}
}
