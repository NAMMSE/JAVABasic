package quiz;

import java.util.Scanner;

public class B06_ForQuiz {

	/*
	 * ����ڰ� ���ڸ� �Է��ϸ�
	 * 1. 100���� 300������ ������ ���غ�����
	 * 2. 1���� 2000������ 7�� ����� ����ϱ�
	 * 3. 1000���� 1500���� 10�� ����� �� �ٿ� 10���� ������ �����
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("���� �Է��ϼ���>>");
		//int num = sc.nextInt();
		int num = 100;
		
		for(int i=1 ; i<=200 ; ++i) {
			num = num + (100+i);
			//System.out.printf("%d %d \n", num, i);
		}
		System.out.printf("������ %d \n", num);
		
		System.out.print("--------------------------------------\n");
		
		num = 0;
		for(int i=1;num<2000;++i) {
			num=7*i;//if(num%7==0) �����°�
			if(num<2000) {
			System.out.printf("7 x %d = %d \n",i, num);
			}
		}
	
		System.out.print("--------------------------------------\n");
		num = 0;
		
		for(int i=0;i<6;i++) {
			for(int j =0 ; j<10 ; j++) {
				num=1000+(i*100)+(10*j);
				if(num<=1500) {
				System.out.printf(" %d \n", num);
				}
				
			}
			System.out.print("--------------------------------------\n");
		}
		
		
		/*
		 for(int num = 1000, cnt = 0 ; num <= 1500 ; ++num){
		 	if(num % 10 == 0){
		 		System.out.printf("%-6d", num);
		 		if(cnt++ % 10 == 9){
		 			System.out.print('\n');
		 			}
		 		}
		 	}
		 */
		
	}
}	
	
	
	
	
	

