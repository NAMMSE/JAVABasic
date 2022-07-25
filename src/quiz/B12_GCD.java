package quiz;

import java.util.Scanner;

public class B12_GCD {

	/*
	  랜덤으로 생성된 두 숫자의 최대 공약수를 구해보세요
	 */
	public static void main(String[] args) {
		
	//	System.out.print("최대공약수를 구할 숫자의 최대 범위를 입력하세요(음수까지 적용됩니다)>>");
		//Scanner sc = new Scanner(System.in);
		//int range = sc.nextInt();
		int num1=30, num2=20;
//		num1= (int)(Math.random()*(range*2) -(range)); // 범위가 50이면 -50~+50까지 해서 100개의 범위이므로 50 *2가 범위고 0-50과 100- 50 을해야 -50, 50 이 나오므로 빼는건 50 그대로
//		num2= (int)(Math.random()*(range*2) -(range));
//		System.out.println("첫번째 랜덤 숫자 : " + num1);
//		System.out.println("두번째 랜덤 숫자 : " + num2);
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
			//System.out.printf("%d 와 %d의 최대공약수는 %d 입니다.\n",num1, num2, temp1);
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
//			System.out.printf("%d 와 %d의 최대공약수는 %d 입니다.\n",num1, num2, temp2);
//		}
//			
		
		

//		강사님 코드
//		// Integer.MAX_VALUE : 정수의 최대값 (4byte 정수의 최대 양수값)
//		//int a=(int)(Math.random()*Integer.MAX_VALUE);
//		//int b=(int)(Math.random()*Integer.MAX_VALUE);
//		
//		Random ran = new Random();
//		int a = ran.nextInt();
//		int b = ran.nextInt();
//		
//		int min =  a < b ? a : b;
//		// min = Math.min(a,b) a, b 중 더 작은 수로 초기화
//		/*
//		   min = a < b ? a : b;   왼쪽의 결과가 트루면 앞 폴스면 뒤
//		  삼항연산자
//		  - 비교 ? 예 : 아니요
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
//		System.out.printf("%d 와 %d의 최대공약수는 %d 입니다.\n",a, b, gcd);
//		
//		
	}
}
