package quiz;

import java.util.Scanner;

import myobj.rps.Shape;

public class C14_RPS {

	/*
	 	가위바위보 게임을 만들어보세요 c언어스럽다 
	 */
	/*public static void main(String[] args) {
		
		Player player = new Player();
		player.playing();
	}
}

class Player{
	int win;
	int lose;
	//double winrate = (win/(win+lose))*100;
	
	public void playerInfo() {
		System.out.printf("플레이어의 승리 횟수 : %d\n플레이어의 패배 횟수 : %d\n플레이어의 승률 : %.2f\n", win, lose,(double)win/(win+lose)*100 );
	}
	
	public void playing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("#### 가위바위보 게임을 시작합니다. ####");
		while(true) {
			int comrps = (int)(Math.random()*3);
			System.out.print("가위 : 1, 바위 : 2, 보 : 3 \n입력하세요 >>");
			int playerrps = sc.nextInt()-1; //컴퓨터의 rps는 0,1,2, 이므로 사용자가 입력한 1,2,3에서 1씩 빼준다
			if(playerrps>2||playerrps<0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요>>");
				continue;
			}
			if((comrps==0&&playerrps==1)||(comrps==1&&playerrps==2)||(comrps==2&&playerrps==0)) {
				if(playerrps==1) {
					System.out.println("플레이어:\t바위\n컴퓨터:\t가위\n** 축하합니다. 당신이 이겼습니다. **");
					win++;
				}else if(playerrps==2) {
					System.out.println("플레이어:\t보\n컴퓨터:\t바위\n** 축하합니다. 당신이 이겼습니다. **");
					win++;
				}else {
					System.out.println("플레이어:\t가위\n컴퓨터:\t보\n** 축하합니다. 당신이 이겼습니다. **");
					win++;
				}
			}
			else if((comrps==1&&playerrps==0)||(comrps==2&&playerrps==1)||(comrps==0&&playerrps==2)) {
				if(playerrps==1) {
					System.out.println("플레이어:\t바위\n컴퓨터:\t보\n저런... 당신이 졌습니다.");
					lose++;
				}else if(playerrps==2) {
					System.out.println("플레이어:\t보\n컴퓨터:\t가위\n저런... 당신이 졌습니다.");
					lose++;
				}else {
					System.out.println("플레이어:\t가위\n컴퓨터:\t바위\n저런... 당신이 졌습니다.");
					lose++;
				}
			}
			else {
				System.out.println("비겼습니다. 다시 하겠습니다.");
				continue;
			}
			System.out.println("====================================================");
			System.out.printf("플레이어의 전적을 보시려면 1, 계속 플레이 하려면 아무거나 누르세요>>");
			int cont = sc.nextInt();
			if(cont==1) {
				playerInfo();
			}else continue;
			System.out.println("게임을 끝내시려면 1, 계속 플레이 하려면 아무거나 누르세요");
			cont = sc.nextInt();
			if(cont==1)break;
		}
	}
	*/
	
	
	
	public static void main(String[] args) {
		
		
//		 0은 바위, 1은 가위, 2는 보자기
//		 이런 것을개발자가 외워야 하는 것을 매직 넘버라고 한다
//		 매직 넘버들은 개발한당사자만 알고 있는 숫자이기 때문에 썩 좋은 형태는 아니다.
//		Shape com = Shape.random();
//		Shape user = Shape.random();
//		
//		System.out.println("com: "+com.getName());
//		System.out.println("user: "+user.getName());
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean error=false;
					
			Shape com = Shape.random();
			Shape user;
			System.out.print("가위(0), 바위(1), 보(2)를 선택하세요>>");
			switch(sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS;
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPER;
				break;
			default:
				System.out.println("다시 선택해주세요");
				user = null;
				error = true;
				break;
					
			}
			if(error) {
				continue;
			}
			System.out.printf("com: %s \tuser: %s\n", com.getName(), user.getName());
			switch(Shape.versus(com, user)) {
			case 1:
				System.out.println("컴퓨터가 이겼습니다");
				continue;
			case 0:
				System.out.println("비겼습니다 !");
				continue;
			case -1:
				System.out.println("당신이 이겼습니다");
				continue;
			}
			
		}
	}
}



















































