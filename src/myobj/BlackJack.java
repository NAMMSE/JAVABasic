package myobj;

import java.util.Scanner;

public class BlackJack {

	char[] cards = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', '��', 'J', 'Q', 'K'};
	int playerScore=0;
	int dealerScore=0;
	char[] playerCard = new char[7];
	char[] dealerCard = new char[7];
	int pcardCount=2;
	int dcardCount=2;
	
	public char selectCard() { // �������� ī�尪 �ϳ��� ��ȯ��
		char card = cards[(int)(Math.random()*13)];
		return card;
	}
	
	public int cardToScore(char card) { // ������ �ִ� ī���� ���� ���� ������ ��ȯ����
		
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
		case '��': case 'J': case 'Q': case 'K':
			return 10;
		default:
			return 0;
		}
	}
	
	public char hitCard(char[] cards) { // �÷��̾ ī�带 hit �ϸ� �����߰��� �޴´�
		return cards[pcardCount++] = selectCard();
	}
	
	public char hitCard2(char[] cards) { // �÷��̾ ī�带 hit �ϸ� �����߰��� �޴´�
		return cards[dcardCount++] = selectCard();
	}
	
	public int scoreSum(char[] cards) { // ������� ����ִ� ī���� ������ ��ȯ
		int sum=0;
		for(int i=0;i<cards.length;i++) {
			sum+=cardToScore(cards[i]);
		}
		return sum;
	}
	
	public void infoPrint(int playerScore, char[] playerCard, char[] dealerCard) {
		System.out.printf("����� ī�� :");
		for(int i=0; i<pcardCount;i++) {
			System.out.printf(" %c", playerCard[i]);
		}
		System.out.printf(" / ����� ���� : %d \n", playerScore);
		System.out.printf("������ ī�� : %c, x \n", dealerCard[0] );
	}
	
	public void infoPrint2(int playerScore, char[] playerCard, char[] dealerCard) {
		System.out.printf("����� ī�� :");
		for(int i=0; i<pcardCount;i++) {
			System.out.printf(" %c", playerCard[i]);
		}
		System.out.printf(" / ����� ���� : %d \n", playerScore);
		System.out.printf("������ ī�� :");
		for(int i=0; i<dcardCount;i++) {
			System.out.printf(" %c", dealerCard[i]);
		}
		System.out.printf(" / ������ ���� : %d \n", dealerScore);
		
		if(playerScore<22&&playerScore>dealerScore) {
			System.out.printf("����� ���� : %d\n������ ���� : %d\n����� �̰���ϴ�.", playerScore,dealerScore);
			return;
		}
		else if(playerScore==dealerScore) {
			System.out.printf("����� ���� : %d\n������ ���� : %d\n�����ϴ�.", playerScore,dealerScore);
			return;
		}
		else if(playerScore<22&&dealerScore>21) {
			System.out.printf("����� ���� : %d\n������ ���� : %d\n����� �̰���ϴ�.", playerScore,dealerScore);
			return;
		}
		
		else {
			System.out.printf("����� ���� : %d\n������ ���� : %d\n����� �����ϴ�.", playerScore,dealerScore);
			return;
		}
	}
	
	public void choicePrint() {
		System.out.print("Hit�Ϸ��� 1, Stand�Ϸ��� 2�� �������� >>");
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
			System.out.printf("������ ���� ī�� : %c, %c\n",dealerCard[0],dealerCard[1]);
			while(true) {
				System.out.println("������ ���� ���� ī�� : "+hitCard2(dealerCard));
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
				System.out.printf("�����մϴ� !! %d������ �����Դϴ�. \n", playerScore);
				break;
			}
			choicePrint();
			choice = hitOrStand();
			if(choice == 1) {
				System.out.println("����� ���� ���� ī�� : "+hitCard(playerCard));
				playerScore = scoreSum(playerCard);
				if(playerScore>21) {
					System.out.printf("����� ī���� ���� %d�� ����� �й��Դϴ�. \n", playerScore);
					break;
				}
				else if(playerScore==21) {
					infoPrint(playerScore,playerCard,dealerCard);
					System.out.printf("�����մϴ� !! %d������ �����Դϴ�. \n", playerScore);
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
