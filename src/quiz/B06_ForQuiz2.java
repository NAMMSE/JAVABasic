package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {

	/*
	 1. 사용자로부터 숫자를 입력받으면 1부터 해당 숫자 사이에 있는 5의 배수를 모두 출력
	 */
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num = sc.nextInt(); 

		// 내 코드
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
			/* 강사님 코드
		for(int num = 1; num<userNum ; ++num) {
			if(num%5==0) {
				System.out.print(num + " ");
			}
		}
		*/
			
	}
}
}
