package quiz;

import java.util.Scanner;

import myobj.Player;
import myobj.Tong;

public class C06_PirateGame {

	/*
	  ������� ������ ����� ������
	  
	  1. ������ ���۵Ǹ� �÷��̾ �� ������ ���Ѵ�
	  2. ���� �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���
	  3. Į�� � �� �ִ� ���� 20���� �ְ� �� �� 2���� ���� �ȴ�. (�� �Ǹ��� ��ġ�� �������� ����)
	  4. �߸��� ���� Į�� � �÷��̾�� ���ӿ� �й��Ѵ�
	  5. ������ ��� �̾ �÷��� �� �� �ְ� �� �÷��̾��� ������ ���� ����Ǿ�� �Ѵ�
	  
	 */
	
	/* ���� § ����
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
	�������*/
	
	//���� ����
	static int playerNum;
	static Player players[];
	static Tong tong;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		tong = new Tong();
		
		System.out.print("�÷��̾� �� �Է� >>");
		playerNum = sc.nextInt();
		
		//player�� ������ ���� �� �ִ� �迭�� ����(�迭 ���� ������ ����ִ�) �ΰ� �������
		players = new Player[playerNum];
		
		// player �ν��Ͻ��������� �迭�� �߰��Ѵ�
		for(int i=0;i<playerNum;i++) {
			players[i] = new Player();
		}
		
		while(true) {
			System.out.println("1. �� ����");
			System.out.println("2. ��������");
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
		
	} // ������� ����
	
	static void record() {
		for(int i = 0;i<playerNum;i++) {
			System.out.println("[Player] " + i);
			players[i].print();
		}
		
	}
	static void game() {
		
		//���� ����
		tong.rewind();
		
		int turn = 0;
		while(true) {
			tong.print();
			int currentplayer = turn % playerNum;
			
			System.out.printf("[%d��] player %d�� ����>>", turn+1, currentplayer+1);
			int slotIndex = sc.nextInt() -1;
			
			switch(tong.stab(slotIndex)) {
			case 1:
				turn++;
				break;
			case 0:
				System.out.println("�� ���� �̹� �񷶽��ϴ�. �ٸ� ���� �������ּ���");
				break;
			case -1:
				System.out.printf("���� �������� ���󰬽��ϴ�. player %d���� �й��Դϴ�\n",currentplayer +1);
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

















































