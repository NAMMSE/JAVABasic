package quiz;

import java.util.Scanner;

public class B12_GCD {

	/*
	  �������� ������ �� ������ �ִ� ������� ���غ�����
	 */
	public static void main(String[] args) {
		
	//	System.out.print("�ִ������� ���� ������ �ִ� ������ �Է��ϼ���(�������� ����˴ϴ�)>>");
		//Scanner sc = new Scanner(System.in);
		//int range = sc.nextInt();
		int num1=30, num2=20;
//		num1= (int)(Math.random()*(range*2) -(range)); // ������ 50�̸� -50~+50���� �ؼ� 100���� �����̹Ƿ� 50 *2�� ������ 0-50�� 100- 50 ���ؾ� -50, 50 �� �����Ƿ� ���°� 50 �״��
//		num2= (int)(Math.random()*(range*2) -(range));
//		System.out.println("ù��° ���� ���� : " + num1);
//		System.out.println("�ι�° ���� ���� : " + num2);
		int  cnt1, cnt2;
		
		
		if(num1>num2) {
			int temp1=0;
			for(int i=1;i<num2;i++);{
//				cnt1=num1 % i;
				
				//System.out.printf("1 : %d \n",i);
//				cnt2=num2 % i;
//				System.out.printf("2 : %d \n", cnt2);
//				if((num1%i)==0&&(num2%i)==0) {
//					System.out.printf("%d \n", i);
//					
//				}
			}
			//System.out.printf("%d �� %d�� �ִ������� %d �Դϴ�.\n",num1, num2, temp1);
		}
		
		
//		else {
//			int temp2 = 0;
//			for(int i=1;i<= num2;i++);{
//				cnt1=num1 % i;
//				cnt2=num2 % i;
//				if(cnt1==cnt2) {
//					temp2=i;
//					//System.out.printf("%d\n", temp2);
//				}
//			}
//			System.out.printf("%d �� %d�� �ִ������� %d �Դϴ�.\n",num1, num2, temp2);
//		}
//			
		
		

//		����� �ڵ�
//		// Integer.MAX_VALUE : ������ �ִ밪 (4byte ������ �ִ� �����)
//		//int a=(int)(Math.random()*Integer.MAX_VALUE);
//		//int b=(int)(Math.random()*Integer.MAX_VALUE);
//		
//		Random ran = new Random();
//		int a = ran.nextInt();
//		int b = ran.nextInt();
//		
//		int min =  a < b ? a : b;
//		// min = Math.min(a,b) a, b �� �� ���� ���� �ʱ�ȭ
//		/*
//		   min = a < b ? a : b;   ������ ����� Ʈ��� �� ������ ��
//		  ���׿�����
//		  - �� ? �� : �ƴϿ�
//		  
//		 */
//		if(a>b) {
//			min = b;
//		}
//		else {
//			min = a;
//		}
//		int gcd = 1;
//		
//		for(int i = min; i> 0; i--) {
//			if( a%i==0&&b%i==0) {
//				System.out.println("gcd : " + i);
//				gcd = i ;
//				break;
//			}
//		}
//		System.out.printf("%d �� %d�� �ִ������� %d �Դϴ�.\n",a, b, gcd);
//		
//		
	}
}
