package quiz;

import java.util.Scanner;

public class B11_WhilePrime {

	/*
	 *  while문으로 사용자로부터 숫자를 입력받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력
	 2 3 5 7 11 13 17 19
	 
	 1부터 자기 자신까지 나눴을때 2개면 소수
	 2부터 자기자신-1까지 나눴을때 약수가 0개면 소수
	 2부터 해당숫자의 제곱근까지 나눴을때 약수가 0개라면 소수다
	 */
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자를 입력하세요>>");
			num = sc.nextInt();
			if(num>1) {
				break;
			}
			else {
				System.out.print("2이상의 ");
			}
		}
		
		/* 내 코드
		int i = 2;
		int result=0;
		int cnt = 0;
		System.out.print("해당 숫자까지의 소수는 : ");
		while(i<=num) {
			int j = 2; // 숫자에서 1과 자기 자신을 제외하고 나누면 나머지가 무조건 나오는 것 이용
			while(j<i) {
				result = i%j;
				if(result==0) {// 약수가 있는 수들은 나머지가 0일 때가 반드시 있음
					cnt++;
				}
				j++;
			}
			if(cnt==0) { // 소수는 나머지가 0이 나오는 순간이 없기 때문에 count가 0이여야 소수임
				System.out.printf("%d ",i);
			}
			i++;
			cnt=0; // 카운트 초기화
		} */
		
		int i = 2;
		while(i<=num) {
			boolean prime = true;
			
			int chk = 2; 
			double sqrt = Math.sqrt(i);
			while(chk<=sqrt) {
				if(i%chk == 0) {
					prime = false;
					break;
				}
				chk++;
			}
			if(prime) {
				System.out.println(i);
			}
			i++;
		}
		
	}
}
