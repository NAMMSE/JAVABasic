package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	 ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�
	 ����ڰ� ����� ������ �Է��ϸ� ����� ��� ��� ���� �ʿ��� �ٱ��� ������ �˷��ִ� ���α׷��� ����ÿ�
	 */
	
	public static void main(String[] args) {
		
		//final int BASKET_SIZE ; �̰� ���� Ȯ�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ������ �Է��ϼ���: ");
		int apple = sc.nextInt();
		
		if(apple % 10 ==0 && apple>0) {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�. \n", apple/10);
		}
		else if(apple > 10 ) {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�. \n", apple/10+1);
		}
		else if(apple>0){
			System.out.println("�ʿ��� �ٱ����� ������ 1�� �Դϴ�.");	
		}
		else {
			System.out.println("�ʿ��� �ٱ����� ������ 0���Դϴ�");
		}
		
		/*
		 
		 
		 if(apple < 0 ) {
			System.out.println("����� ������ �̻��մϴ�. \n");
		}
		 else if(apple % 10 ==0 ) {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�. \n", apple/10);
		}
		else  {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�. \n", apple/10+1);
		}
		--------------------------------------------------------------
		int basket
		if(apple < 0 ) {
			System.out.println("����� ������ �̻��մϴ�. \n");
		}
		 
		else  {
		
		   	if(apple % 10 == 0){
		   		basket = apple /10;
		   		}
		   	else{
		   	
		   		basket = apple / 10 + 1;
		   	}
		   	
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�. \n", basket);
		}
		 */
		
	}
}
