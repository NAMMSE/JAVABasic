package quiz;

import java.util.Scanner;

import myobj.Player;
import myobj.Tong;

public class C06_PirateGame {

	/*
	  통아저씨 게임을 만들어 보세요
	  
	  1. 게임이 시작되면 플레이어가 몇 명인지 정한다
	  2. 여러 플레이어가 돌아가면서 원하는 위치에 칼을 찌른다
	  3. 칼을 찌를 수 있는 곳은 20개가 있고 그 중 2개가 꽝이 된다. (매 판마다 위치는 랜덤으로 설정)
	  4. 잘못된 곳을 칼로 찌른 플레이어는 게임에 패배한다
	  5. 게임은 계속 이어서 플레이 할 수 있고 각 플레이어의 전적도 누적 집계되어야 한다
	  
	 */
	
	/* 내가 짠 메인
	public static void main(String[] args) {
		
		Tong game = new Tong();
		int playernum = game.countPlayer();
		Player[] player = new Player[playernum];
				
		for(int i=0;i<playernum;i++) {
			player[i] = new Player();
		}
		for(int i=0;i<playernum;i++) {
			player[i].mynum = i+1;
		}
		
		game.playing(playernum, player);
		
		
		
	} 
	여기까지*/
	
	//전역 변수
	static int playerNum;
	static Player players[];
	static Tong tong;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		tong = new Tong();
		
		System.out.print("플레이어 수 입력 >>");
		playerNum = sc.nextInt();
		
		//player를 여러명 담을 수 있는 배열을 생성(배열 안의 내용은 비어있다) 널값 들어있음
		players = new Player[playerNum];
		
		// player 인스턴스를생성해 배열에 추가한다
		for(int i=0;i<playerNum;i++) {
			players[i] = new Player();
		}
		
		while(true) {
			System.out.println("1. 새 게임");
			System.out.println("2. 전적보기");
			System.out.print(">");
			switch( sc.nextInt()){
			case 1:
				game();
				break;
			case 2:
				record();
				break;
			default:
				break;
			}
		}
		
	} // 여기까지 메인
	
	static void record() {
		for(int i = 0;i<playerNum;i++) {
			System.out.println("[Player] " + i);
			players[i].print();
		}
		
	}
	static void game() {
		
		//새로 시작
		tong.rewind();
		
		int turn = 0;
		while(true) {
			tong.print();
			int currentplayer = turn % playerNum;
			
			System.out.printf("[%d턴] player %d의 차례>>", turn+1, currentplayer+1);
			int slotIndex = sc.nextInt() -1;
			
			switch(tong.stab(slotIndex)) {
			case 1:
				turn++;
				break;
			case 0:
				System.out.println("그 곳은 이미 찔렀습니다. 다른 곳을 선택해주세요");
				break;
			case -1:
				System.out.printf("해적 아저씨가 날라갔습니다. player %d님의 패배입니다\n",currentplayer +1);
			for(int i =0; i<playerNum; i++) {
				if(i==currentplayer) {
					players[i].lose();
				}
				else {
					players[i].win();
				}
			}
			return;
			}
		}
	}
}

















































