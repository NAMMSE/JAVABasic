package quiz;

import java.util.Scanner;

public class B11_Count369_2 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in); // 숫자만 입력받아서 푸는 방법 1 
		
		System.out.print("숫자만 입력>>");
		int num = sc.nextInt();
		int clap=0;
		for(int i =0;i<=num ;i++) {
			System.out.printf("%d : ",i);
			String numStr = "" +i; // 숫자로 된 문자열로 만드는 과정
			
			for(int j=0;j<numStr.length();j++) {
				char ch = numStr.charAt(j);
				
				if(ch == '3' || ch == '6' || ch == '9') {
					System.out.print("짝");
					clap++;
				}
			}
			System.out.println();
			
		}
		*/
		Scanner sc = new Scanner(System.in); // 진짜 숫자만 입력받아서 푸는 방법
		System.out.print("숫자만 입력>>");
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
				int digit = chknum % 10; //일의자리만 분리
				if(digit == 3||digit ==6||digit==9) { // 분리한 일의자리 비교
					System.out.print("짝");
					clap++;
				}
				chknum /= 10; // 한자리씩 쉬프트
			}
			System.out.println();
		}
	}
}
