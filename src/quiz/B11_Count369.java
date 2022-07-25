package quiz;

import java.util.Scanner;

public class B11_Count369 {

	/*
	 * ###############못푼문제#################
	 사용자로부터 정수를 하나 입력받고 해당 숫자까지 369를 하면 박수를 충 몇 번 쳐야하는지
	 */
	/*
	 * 30 60 90 일때  /10 해서 나온 몫이 ==3||==6||==9 일때 
		==3 이면 num-num/10*3 만큼 카운트 if num-num/10*3만큼 반복문 돌려서 
		0부터 num-num/10*3까지 %3==0 나오면 
		카운트 한번 더 

		27
		num/10 = 2 앞전 박수 개수는 num/10 *3 = 6
		num-(num/10*10) 하면 일의자리 구해짐
		0부터 num-(num/10*10)까지 반복문 돌리면서 %3==0 나오는지 확인 카운트
	 */
	
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력하세요>>");
		int num;
		while(true) {  // 2명 이상 입력할 때 까지 인원 입력 받기
			num = sc.nextInt();
			if(num>0) {
				break;
			}
			System.out.print("잘못된 입력입니다 다시 ");
			
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
		
/*		Scanner sc = new Scanner(System.in); // 문자열 비교할 때 푸는 방법
		String num;				
		while(true) {
			System.out.printf("숫자를 입력>>");
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
			System.out.printf("다시 ");
		}
		*/
	}
}
