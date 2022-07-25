package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.blackjack.BlackjackDeck;
import myobj.blackjack.Card;
import myobj.blackjack.Deck;
import myobj.blackjack.Player;

public class C13_BlackJack {

	/*
	  # ���� �����
	  
	   1. ��ǻ��(����)�� ���(�÷��̾�)�� ī�带 �̴´�
	   
	   2. ó������ �� ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�
	   
	   3. �÷��̾�� ��Ȳ�� ���� �� ������(hit) ������(stand)�� ������ �� �ִ�
	   
	   4. �÷��̾ ���߸� ������ �������ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 ��� �̴´�
	   	  (������ �������ִ� ī�� ���� 16 �����϶� ������ �̰�, 17 �̻��̸� ������ ������Ѵ�)
	   	  
	   5. �÷��̾��� ī�� ���� �������� ������ �¸��Ѵ�.
	      �÷��̾��� ī�� ���� 21���� ũ�� �й��Ѵ�
	      
	   6. A�� 1�� �� ���� �ְ� 11�� �� �� �ִ�
	 */
	
	Deck deck;
	
	Player dealer;
	Player player;
	
	Card[] playerCards;
	Card[] dealerCards;
	
	int playerCardIndex;
	int dealerCardIndex;
	
	public C13_BlackJack() {
		deck = new BlackjackDeck(3);//��ĳ����
		
		playerCards = new Card[21];
		dealerCards = new Card[21];
		
		dealer = new Player();
		dealer.setMoney(10000000);
		
		player = new Player();
		player.setMoney(3000);
		
	}
	
	private int calcScore(Card[] cards) {
		
		int valuesum = 0;
		int aceCnt=0;
		
		for(int i=0;cards[i]!=null;i++) {
			Card card = cards[i];
			int value = card.getValue();
			
			valuesum += card.getValue();
			
			//A�� �� �� �ִ��� ����� �Ѵ�
			if(value == 11) {
				aceCnt++;
			}
		}
		//���� ���� 21�� �ʰ��ϸ鼭 A�� �����Ѵٸ� 10�� �� �� �ִ�
		
			while(valuesum>21 && aceCnt > 0 ) {
				valuesum -=10;
				--aceCnt;
			}
		
		
		return valuesum;
	}
	
	private void dealerDraw() {
		dealerCards[dealerCardIndex++] = deck.draw();
	}
	
	private void playerDraw() {
		playerCards[playerCardIndex++] = deck.draw();
	}
	
	public void print() {
		System.out.print("Dealer Cards: ");
		for(int i=0 ; dealerCards[i]!=null;i++) {
			System.out.print(dealerCards[i].getCardShape() + " ");
		}
		System.out.println();
		System.out.print("Player Cards: ");
		for(int i=0 ; playerCards[i]!=null;i++) {
			System.out.print(playerCards[i].getCardShape() + " ");
		}
		System.out.printf("(%d)\n", calcScore(playerCards));
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		deck.shuffle();
		
		//���� 2��
		dealerDraw();
		dealerDraw();
		dealerCards[0].reverse();
		
		//�÷��̾� 2��
		playerDraw();
		playerDraw();
		
		while(true) {
			print();
			System.out.print("1. Hit\t2. Stand :");
			int select = sc.nextInt();
			
			if(select == 2) {
				break;
			}
			else if(select ==1) {
				playerDraw();
				//�̾Ҵµ� 21�ʰ���� ������ ���� ����
				if(calcScore(playerCards)>21) {
					break;
				}
			}
			else{
				System.out.println("�ùٸ� ��ȣ�� �ٽ� �Է����ּ��� !");
			}
		
			
		}
		int playerValue = calcScore(playerCards);
		if(playerValue > 21) {
			print();
			System.out.println("�÷��̾��� ����Ʈ�Դϴ�.");
			player.lose();
			return;
		}
		
		System.out.println("���� ������ ī�带 �̽��ϴ�..");
		dealerCards[0].reverse();
		
		while(calcScore(dealerCards)>17) {
			dealerDraw();
		}
		
		
		print();
		// ������ ī�带 �����鼭 ���� �̰���� üũ�ؾ���

		
		int dealerValue = calcScore(dealerCards);
		
		if(dealerValue>21) {
			System.out.println("�÷��̾��� �¸��Դϴ�.");
			player.win();
		}
		else if(playerValue < dealerValue) {
			System.out.println("������ �¸��Դϴ�.");
			player.lose();
			
		}
		else if(playerValue>dealerValue) {
			System.out.println("�÷��̾��� �¸��Դϴ�.");
			player.win();
		}
		else {
			player.draw();
			System.out.println("���º��Դϴ�.");
		}

		
		
	}
	
	
	public static void main(String[] args) {
		//BlackJack play1 = new BlackJack(); ���ڵ�
		//play1.playing();  ���ڵ�
		
		new C13_BlackJack().start();
		
		
	}
}
