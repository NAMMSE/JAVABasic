package quiz;

import java.util.Scanner;

import myobj.rps.Rps;

public class E07_SaveGame {

	/*
	  컴퓨터와의 간단한 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요
	  게임을 다시 실행하면 예전 전적이 그대로 반영되도록 만들어보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer win=0;
		Integer lose=0;
		while(true) {
			
			boolean error = false;
			Rps com = Rps.random();
			Rps user = null;
			System.out.print("가위(0) / 바위(1) / 보(2) 선택하세요");
			switch(sc.nextInt()) {
			case 0:
				user = Rps.SCISSORS;
				break;
			case 1:
				user = Rps.ROCK;
				break;
			case 2:
				user = Rps.PAPER;
				break;
			default:
				System.out.println("다시 입력하세요.");
				error=true;
				break;
			}
			if(error)
				continue;
			System.out.printf("com : %s \tuser : %s\n", com.getName(), user.getName());
			switch(Rps.versus(com, user)) {
			case 0:
				System.out.println("비겼습니다 !");
				break;
			case 1:
				System.out.println("당신이 이겼습니다 !");
				win++;
				break;
			case -1:
				System.out.println("컴퓨터가 이겼습니다 !");
				lose++;
				break;
			}
			System.out.print("게임을 계속하시려면 0, 종료하시려면 1, 전적을 확인하려면 2를 누르세요");
			switch(sc.nextInt()) {
			case 0:
				continue;
			case 1: 
				user.saveScore(win,lose);
				return;
			case 2:
				user.loadScore();
				user.saveScore(win,lose);
				
				return ;
			}
		}
	}
}
