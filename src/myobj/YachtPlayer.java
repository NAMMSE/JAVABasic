package myobj;

import java.util.Scanner;

public class YachtPlayer {

	int[] dicenum = new int[5];
	
	public YachtPlayer(int[] dicenum) {
		this.dicenum = dicenum;
	}
	
	public int[] throwDice(int[] dicenum) { // �������� �ֻ��� ���� 5�� ����
		for(int i=0;i<5;i++) {
			int newnum=(int)(Math.random()*6+1);
			dicenum[i]=newnum;
			
		}
		
		return dicenum;
	}
	
	
	public int[] throwAgain(int[] dicenum) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٽ� ������ ���� �ֻ����� �Է��ϼ��� (1 ~ 5) >>");
		int againdice = sc.nextInt();
		System.out.print("�� �� �ٽ� �����ðڽ��ϱ�? (�ִ� 2ȸ) >>");
		int againnum = sc.nextInt();
		
		
		
		return dicenum;
	}
	
}
