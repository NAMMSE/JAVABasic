package quiz;

import java.util.Scanner;

public class B11_Count369_2 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in); // ���ڸ� �Է¹޾Ƽ� Ǫ�� ��� 1 
		
		System.out.print("���ڸ� �Է�>>");
		int num = sc.nextInt();
		int clap=0;
		for(int i =0;i<=num ;i++) {
			System.out.printf("%d : ",i);
			String numStr = "" +i; // ���ڷ� �� ���ڿ��� ����� ����
			
			for(int j=0;j<numStr.length();j++) {
				char ch = numStr.charAt(j);
				
				if(ch == '3' || ch == '6' || ch == '9') {
					System.out.print("¦");
					clap++;
				}
			}
			System.out.println();
			
		}
		*/
		Scanner sc = new Scanner(System.in); // ��¥ ���ڸ� �Է¹޾Ƽ� Ǫ�� ���
		System.out.print("���ڸ� �Է�>>");
		int num = sc.nextInt();
		int clap=0;
		for(int i = 1; i<=num; i++){
			//12345
			//1234
			//123
			//12
			//1
			int chknum = i;
			System.out.printf("%d : ",i);
			while(chknum>0) {
				int digit = chknum % 10; //�����ڸ��� �и�
				if(digit == 3||digit ==6||digit==9) { // �и��� �����ڸ� ��
					System.out.print("¦");
					clap++;
				}
				chknum /= 10; // ���ڸ��� ����Ʈ
			}
			System.out.println();
		}
	}
}
