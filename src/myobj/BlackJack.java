package myobj;

import java.util.Scanner;

public class BlackJack {

	char[] cards = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', '⑩', 'J', 'Q', 'K'};
	int playerScore=0;
	int dealerScore=0;
	char[] playerCard = new char[7];
	char[] dealerCard = new char[7];
	int pcardCount=2;
	int dcardCount=2;
	
	public char selectCard() { // 랜덤으로 카드값 하나를 반환함
		char card = cards[(int)(Math.random()*13)];
		return card;
	}
	
	public int cardToScore(char card) { // 가지고 있는 카드의 값에 따라 정수로 변환해줌
		
		switch(card) {
		case 'A':
			return 1;
		case 'a':
			return 11;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case '⑩': case 'J': case 'Q': case 'K':
			return 10;
		default:
			return 0;
		}
	}
	
	public char hitCard(char[] cards) { // 플레이어가 카드를 hit 하면 한장추가로 받는다
		return cards[pcardCount++] = selectCard();
	}
	
	public char hitCard2(char[] cards) { // 플레이어가 카드를 hit 하면 한장추가로 받는다
		return cards[dcardCount++] = selectCard();
	}
	
	public int scoreSum(char[] cards) { // 현재까지 들고있는 카드의 총합을 반환
		int sum=0;
		for(int i=0;i<cards.length;i++) {
			sum+=cardToScore(cards[i]);
		}
		return sum;
	}
	
	public void infoPrint(int playerScore, char[] playerCard, char[] dealerCard) {
		System.out.printf("당신의 카드 :");
		for(int i=0; i<pcardCount;i++) {
			System.out.printf(" %c", playerCard[i]);
		}
		System.out.printf(" / 당신의 점수 : %d \n", playerScore);
		System.out.printf("딜러의 카드 : %c, x \n", dealerCard[0] );
	}
	
	public void infoPrint2(int playerScore, char[] playerCard, char[] dealerCard) {
		System.out.printf("당신의 카드 :");
		for(int i=0; i<pcardCount;i++) {
			System.out.printf(" %c", playerCard[i]);
		}
		System.out.printf(" / 당신의 점수 : %d \n", playerScore);
		System.out.printf("딜러의 카드 :");
		for(int i=0; i<dcardCount;i++) {
			System.out.printf(" %c", dealerCard[i]);
		}
		System.out.printf(" / 딜러의 점수 : %d \n", dealerScore);
		
		if(playerScore<22&&playerScore>dealerScore) {
			System.out.printf("당신의 점수 : %d\n딜러의 점수 : %d\n당신이 이겼습니다.", playerScore,dealerScore);
			return;
		}
		else if(playerScore==dealerScore) {
			System.out.printf("당신의 점수 : %d\n딜러의 점수 : %d\n비겼습니다.", playerScore,dealerScore);
			return;
		}
		else if(playerScore<22&&dealerScore>21) {
			System.out.printf("당신의 점수 : %d\n딜러의 점수 : %d\n당신이 이겼습니다.", playerScore,dealerScore);
			return;
		}
		
		else {
			System.out.printf("당신의 점수 : %d\n딜러의 점수 : %d\n당신이 졌습니다.", playerScore,dealerScore);
			return;
		}
	}
	
	public void choicePrint() {
		System.out.print("Hit하려면 1, Stand하려면 2를 누르세요 >>");
	}
	
	public int hitOrStand() {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	
	public void dealerTurn() {
		for(int i=0; i<2;i++) {
			if(dealerCard[i]=='A'&&dealerScore<10) {
				dealerCard[i]='a';
				dealerScore = scoreSum(dealerCard);
			}
		}
		if(dealerScore>16) {
			infoPrint2(playerScore, playerCard, dealerCard);
		}
		else {
			System.out.printf("딜러의 기존 카드 : %c, %c\n",dealerCard[0],dealerCard[1]);
			while(true) {
				System.out.println("딜러가 새로 뽑은 카드 : "+hitCard2(dealerCard));
				dealerScore = scoreSum(dealerCard);
				if(dealerScore>16)break;
			}
			infoPrint2(playerScore, playerCard, dealerCard);
		}		
	}
	
	public void playing() {
		
		for(int i=0; i<2;i++) {
			playerCard[i] = selectCard(); 
			dealerCard[i] = selectCard();
		}
		playerScore = scoreSum(playerCard);
		dealerScore = scoreSum(dealerCard);
		
		for(int i=0; i<2;i++) {
			if(playerCard[i]=='A'&&playerScore<11) {
				playerCard[i]='a';
				playerScore = scoreSum(playerCard);
			}
		}
		int choice;
		while(true) {
			infoPrint(playerScore,playerCard,dealerCard);
			if(playerScore==21) {
				System.out.printf("축하합니다 !! %d점으로 블랙잭입니다. \n", playerScore);
				break;
			}
			choicePrint();
			choice = hitOrStand();
			if(choice == 1) {
				System.out.println("당신이 새로 뽑은 카드 : "+hitCard(playerCard));
				playerScore = scoreSum(playerCard);
				if(playerScore>21) {
					System.out.printf("당신의 카드의 합은 %d로 당신의 패배입니다. \n", playerScore);
					break;
				}
				else if(playerScore==21) {
					infoPrint(playerScore,playerCard,dealerCard);
					System.out.printf("축하합니다 !! %d점으로 블랙잭입니다. \n", playerScore);
					break;
				}
			}
			else if(choice==2) {
				dealerTurn();
				break;
			}
			
		}
		
		
	}
	
	
}
