package quiz;

import java.util.Scanner;

public class B01_DollarExchange {

	/*
	 �޷��� �Է� ������ �ѱ������� ������ �˷��ִ� ���α׷�
	 
	 */

	public static void main(String[] args) {
		double dollar, won;
		System.out.print("�޷� �Է��ϼ��� >");
		dollar = new Scanner(System.in).nextDouble();
		won = dollar * 1224.28;
		System.out.printf("%.0f�޷��� %.1f���Դϴ�.\n", dollar, won );
	}


}

