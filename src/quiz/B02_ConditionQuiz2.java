package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	/*
	  1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
	  1. char�� ���� b�� �����̳� ���� �ƴ� �� true
	  1. char�� ���� c�� '0' ~ '9' �� �� true
	  1. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
	  1. char�� ���� e �ѱ��� �� true
	  1. char�� ���� f�� �Ϻ����� �� true
	  7. ����ڰ� �Է��� ���ڿ��� exit�� �� true 
	 
	 */
	
	
	public static void main(String[] args) {
		
		char a, b, c, d, e, f;
		
		a = 'q';
		System.out.print("1. ");
		System.out.println((a == 'q')||(a == 'Q'));
		
		b = ' ';
		System.out.print("2. ");
		System.out.println(!((b == ' ') || (a == '\t')));
		
		c = '5';
		System.out.print("3. ");
		System.out.println((c >= '0' && c<= '9'));
		
		
		d = 'g';
		System.out.print("4. ");
		System.out.println(((int)d>=65 && (int)d<=90) || ((int)d>=97 && (int)d<=122));
		//System.out.println((d>='a' && d<='z') || (d>='A' && d<='Z'));
		
		
		//�ѱ� ���� : AC00 - D7AF(55203)
		e = '�u';
		System.out.print("5. ");
		//System.out.println((char)44032);
		//System.out.println((char)55203);
		System.out.println(e>=44032 && e <=55203); // e>= '��' && e<= '�R'
		System.out.println(e>=0xAC00 && e <=0xD7AF);
		
		
		// �Ϻ��� ���� : 3040 - 309F
		f = 'g';
		System.out.print("6. ");
		System.out.println(f>=0x3040 && e <=0x309F);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�");
		String str = sc.next();
		System.out.print("7. ");
		System.out.println(str.equals("exit"));
	}
}
