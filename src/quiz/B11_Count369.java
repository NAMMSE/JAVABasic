package quiz;

import java.util.Scanner;

public class B11_Count369 {

	/*
	 * ###############��Ǭ����#################
	 ����ڷκ��� ������ �ϳ� �Է¹ް� �ش� ���ڱ��� 369�� �ϸ� �ڼ��� �� �� �� �ľ��ϴ���
	 */
	/*
	 * 30 60 90 �϶�  /10 �ؼ� ���� ���� ==3||==6||==9 �϶� 
		==3 �̸� num-num/10*3 ��ŭ ī��Ʈ if num-num/10*3��ŭ �ݺ��� ������ 
		0���� num-num/10*3���� %3==0 ������ 
		ī��Ʈ �ѹ� �� 

		27
		num/10 = 2 ���� �ڼ� ������ num/10 *3 = 6
		num-(num/10*10) �ϸ� �����ڸ� ������
		0���� num-(num/10*10)���� �ݺ��� �����鼭 %3==0 �������� Ȯ�� ī��Ʈ
	 */
	
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���>>");
		int num;
		while(true) {  // 2�� �̻� �Է��� �� ���� �ο� �Է� �ޱ�
			num = sc.nextInt();
			if(num>0) {
				break;
			}
			System.out.print("�߸��� �Է��Դϴ� �ٽ� ");
			
		}
		
		System.out.print(3%1);
		int i=0;
		int cnt = 0;
		int num1 = 0;
		
		while(i<num) {
			i++;
			num1=i-(num/10*10);
			if(num1%3==0) {
				cnt++;
				System.out.printf("%d \n",cnt);
			}
		}*/
		
/*		Scanner sc = new Scanner(System.in); // ���ڿ� ���� �� Ǫ�� ���
		String num;				
		while(true) {
			System.out.printf("���ڸ� �Է�>>");
			num = sc.nextLine();
			boolean numeric = true;
			for(int i = 0 ;i<num.length();i++) {
				char ch = num.charAt(i);
				if(!(ch>='0'&&ch<='9')) {
					numeric = false;
					break;
				}
			}
			if(numeric) {
				break;
			}
			System.out.printf("�ٽ� ");
		}
		*/
	}
}
