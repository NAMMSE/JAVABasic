package quiz;

import java.util.Scanner;

public class B01_CeltoFahr {

	/*
	 ����ڷκ��� ���� �µ��� �Է¹����� ȭ���� � ���� �˷��ִ� ���α׷��� ����� ������

	 *
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�ϰ� ���� ���� �µ��� �Է��ϼ���: ");
		double temp = sc.nextDouble(); // new Scanner(System in).nextDouble(); �� �����ѵ� �ѹ� �ۿ� ����
			
		System.out.printf("�ش� �µ��� ȭ�� �µ��� %.1f �� �Դϴ�. \n", ((temp*9/5)+32));
	}
}
