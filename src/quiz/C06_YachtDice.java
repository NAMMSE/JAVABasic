package quiz;

import myobj.YachtDice;

public class C06_YachtDice {

	/*
	  # YachtDice 게임을 만들어보세요
	  
	   1. 플레이어는 다섯 개의 주사위를 던진다 (주사위 눈은 1~6)
	   2. 다섯 개의 주사위 눈의 결과를 통해 다음을 구분해야 한다
	   
	    (1) 풀 하우스 (같은 눈이 2개 / 3개) ex : 11133, 31313, 66555, 65565
	    (2) 스몰스트레이트 (1234/2345/3456) ex : 42131, 65431
	    (3) 라지스트레이트 (12345/23456) ex : 12345, 52143
	    (4) 4 다이스 (같은 숫자 4개) ex : 11113, 21222
	    (5) Yacht (같은 숫자 5개) ex : 11111, 44444
	    (6) 아무것도 만족하지 못한 경우 주사위 눈 합이 점수가 된다
	    
	   3. 플레이어는 다시 던지고 싶은 주사위를 여러개 골라서 다시 던질 수 있다 (2회)
	 */
	
	/* 내 코드
	public static void main(String[] args) {
		
		int[] dicenum = new int[5];
		YachtPlayer player = new YachtPlayer(dicenum);
		player.throwDice(dicenum);
		
		System.out.println(Arrays.toString(dicenum));
		
		
	}*/
	
	public static void main(String[] args) {
		
		YachtDice yacht = new YachtDice();
		System.out.println(yacht);
		yacht.reroll("125");
		System.out.println(yacht);
		yacht.reroll("345");
		System.out.println(yacht);
		yacht.reroll("234");
		System.out.println(yacht);
		yacht.reroll("135");
		System.out.println(yacht);
		yacht.reroll("126");
		
	}
}
