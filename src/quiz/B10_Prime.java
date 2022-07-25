package quiz;

import java.util.Scanner;

public class B10_Prime {

	/*
	 사용자로부터 숫자를 입력받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력
	 2 3 5 7 11 13 17 19
	 
	 1부터 자기 자신까지 나눴을때 2개면 소수
	 2부터 자기자신-1까지 나눴을때 약수가 0개면 소수
	 2부터 해당숫자의 제곱근까지 나눴을때 약수가 0개라면 소수다
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, result, cnt=0;
		//System.out.printf("%d",11%10);
		for(;;) {
			System.out.print("숫자를 입력하세요>>");
			num = sc.nextInt();
			if(num>0) {
				break;
			}
			else {
				System.out.print("양수로 다시 ");
			}
		}
		
		
		/*
		System.out.print("입력한 숫자까지의 소수 : ");
		for(int i =2;i<=num;i++) { // 소수가 아닌 숫자들은 나머지가 0인순간이 반드시 오는 것을 이용하려다가 실패 다시 성공
			for(int j=2;j<i;j++) {
				result = i%j;
			//	System.out.printf("%d %% %d = %d\n",i,j,result);
				if(result==0) {
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.printf("%d ",i);
			}
			cnt=0;
		}
		*/
		
		/* 나 성공한 코드
		if(num==1) {
			System.out.println("입력한 숫자까지의 소수가 없습니다.");
			return;
		}
		System.out.print("입력한 숫자까지의 소수 : "); 
		for(int i=2;i<=num;i++) { // 1부터 해당 숫자까지 나눴을때 나머지가 0인 순간이 1과 본인일때 밖에 없음
			for(int j=1;j<=i;j++) {
				result=i%j;
				if(result==0) {
					cnt++;
				}
				//System.out.printf("%d / %d = %d\n",i,j,result);
			}
			//System.out.printf("--\n");
			if(cnt==2) {
				System.out.printf("%d ",i);
			}
			cnt=0;
		} 여기까지
		*/ 
		
		// 강사님 코드
		//for(num = sc.nextInt();num<2;num=sc.nextInt()) {
			//System.out.println("다시 입력해주세요 "+num);
			//System.out.print("2이상의 숫자를 입력해주세요>> ");}
		
		for(int i = 2; i<= num; i++){
			boolean prime = true;

			double sqrt = Math.sqrt(i);
			for(int test = 2; test<=sqrt ; test++){
				if(i%test == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.printf("%d는 소수입니다. \n",i);
			}
		}
	}
}

 


