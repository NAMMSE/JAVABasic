package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {

	/*
	 1. ����ڷκ��� ���ڸ� �Է¹����� 1���� �ش� ���� ���̿� �ִ� 5�� ����� ��� ���
	 */
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>>");
		int num = sc.nextInt(); 

		// �� �ڵ�
		int n = 0 ,cnt = 0;

		if(num>0) {
			for(int i=1;n<(num/5*5);++i) {
				n = (5*i);
				System.out.printf("%-4d", n);

				if(cnt++%7==0) {
					System.out.print("\n");
				}
			}

		}
		else
		{
			for(int i=1;n>(num/5*5);i++) {
				n = (-5*i);
				System.out.printf("%-4d", n);

				if(cnt++%7==0) {
					System.out.print("\n");
				}
			}
			/* ����� �ڵ�
		for(int num = 1; num<userNum ; ++num) {
			if(num%5==0) {
				System.out.print(num + " ");
			}
		}
		*/
			
	}
}
}
