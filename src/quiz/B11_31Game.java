package quiz;

import java.util.Scanner;

public class B11_31Game {

	/*
	 31게임을 만들어 보세요
	 
	 1. 처음 프로그램을 실행하면 몇 명으로 시작할 지 선택한다
	 2. 여러 플레이어가 번갈아가면서 숫자를 선택한다(숫자는 1,2,3만 선택가능)
	 3. 인원은 최소 2명이상
	 4. 누적된 31이상이면 그 사람이 패배한다
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("플레이 할 2명 이상 인원을 입력하세요>>");
		int player;
		while(true) {  // 2명 이상 입력할 때 까지 인원 입력 받기
			player = sc.nextInt();
			if(player>=2) {
				break;
			}
			else {
				System.out.print("2명 이상으로 다시 입력하세요>>");
			}
		}
		
		
		
		int cnt = 0;
		int num3;
		while(true) { // 어차피 31되면 끝나기때문에 무한반복할 반복문
			int pcnt= 0; // 플레이어수가 계속 돌아야되기 때문에 반복문 들어가기 전에 초기화 해줌
			while(pcnt<player) { // 플레이어를 확인하기 위한 반복문
				pcnt++;
				System.out.printf("현재 플레이어 : %d번\n", pcnt);
				while(true) {					// 1,2,3 외의 숫자 입력 시 다시 입력받는 반복문
					System.out.print("1, 2, 3 중 원하는만큼 숫자 입력하세요>>");
					num3 = sc.nextInt();
					if(num3>=1 && num3<=3) { // 1, 2, 3 중 하나만 입력
						break;
					}
					else {
						System.out.print("잘못된 입력입니다. ");
					}
				}
				cnt+=num3; // 현재 게임 진행 누적 수
				System.out.printf("\n현재 진행 숫자:%d\n", cnt);
				if(cnt>=31) {
					System.out.printf("\n%d번이 패배하였습니다.\n",pcnt);
					return; // 빠져나갈 반복문이 많아서 break가 아닌 return으로 프로그램 종료
				}
			}	
		}
*/
		
		
		int MAX_PLAYER ;
		while(true) {
			System.out.print(" 몇 명? ");
			MAX_PLAYER = sc.nextInt();
			if(MAX_PLAYER >= 2) {
				break;
			}
			System.out.print("제대로 입력 ");
		}
		System.out.println("플레이어는 " + MAX_PLAYER + "명 입니다.");
		
		
		int num = 0;
		int current_player = 0;
		while(num < 31) {
			int usernum = -1;
			
			while(usernum<1||usernum>3) {
				System.out.printf("플레이어 %d 숫자를 입력하세요 >>",current_player);
				usernum = sc.nextInt();
			}
			
			
			
			num+=usernum;
			
			if(num>=31) {
				System.out.printf("플레이어%d의 패배\n  ",current_player+1);
				break;
			}
			System.out.println("현재 숫자는 " + num + "입니다. ");
			current_player = (current_player +1) % MAX_PLAYER;
		}
		System.out.println("num이 31을 넘어서 while문을 벗어났습니다. ");
		
		// 강사님 코드
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

