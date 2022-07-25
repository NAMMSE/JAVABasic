package myobj;

import java.util.Scanner;

public class YachtPlayer {

	int[] dicenum = new int[5];
	
	public YachtPlayer(int[] dicenum) {
		this.dicenum = dicenum;
	}
	
	public int[] throwDice(int[] dicenum) { // 랜덤으로 주사위 숫자 5개 생성
		for(int i=0;i<5;i++) {
			int newnum=(int)(Math.random()*6+1);
			dicenum[i]=newnum;
			
		}
		
		return dicenum;
	}
	
	
	public int[] throwAgain(int[] dicenum) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("다시 던지고 싶은 주사위를 입력하세요 (1 ~ 5) >>");
		int againdice = sc.nextInt();
		System.out.print("몇 번 다시 던지시겠습니까? (최대 2회) >>");
		int againnum = sc.nextInt();
		
		
		
		return dicenum;
	}
	
}
