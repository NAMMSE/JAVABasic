package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.blackjack.BlackjackDeck;
import myobj.blackjack.Card;
import myobj.blackjack.Deck;
import myobj.blackjack.Player;

public class C13_BlackJack {

	/*
	  # 블랙잭 만들기
	  
	   1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다
	   
	   2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다
	   
	   3. 플레이어는 상황을 보고 더 뽑을지(hit) 멈출지(stand)를 결정할 수 있다
	   
	   4. 플레이어가 멈추면 딜러가 가려져있던 카드를 오픈하고 규칙에 따라 카드를 계쏙 뽑는다
	   	  (딜러는 가지고있는 카드 합이 16 이하일때 무조건 뽑고, 17 이상이면 무조건 멈춰야한다)
	   	  
	   5. 플레이어의 카드 합이 딜러보다 높으면 승리한다.
	      플레이어의 카드 합이 21보다 크면 패배한다
	      
	   6. A는 1로 쓸 수도 있고 11로 쓸 수 있다
	 */
	
	Deck deck;
	
	Player dealer;
	Player player;
	
	Card[] playerCards;
	Card[] dealerCards;
	
	int playerCardIndex;
	int dealerCardIndex;
	
	public C13_BlackJack() {
		deck = new BlackjackDeck(3);//업캐스팅
		
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
			
			//A가 몇 개 있는지 세어야 한다
			if(value == 11) {
				aceCnt++;
			}
		}
		//현재 합이 21을 초과하면서 A를 포함한다면 10을 뺄 수 있다
		
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
		
		//딜러 2장
		dealerDraw();
		dealerDraw();
		dealerCards[0].reverse();
		
		//플레이어 2장
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
				//뽑았는데 21초과라면 강제로 게임 종료
				if(calcScore(playerCards)>21) {
					break;
				}
			}
			else{
				System.out.println("올바른 번호를 다시 입력해주세요 !");
			}
		
			
		}
		int playerValue = calcScore(playerCards);
		if(playerValue > 21) {
			print();
			System.out.println("플레이어의 버스트입니다.");
			player.lose();
			return;
		}
		
		System.out.println("이제 딜러가 카드를 뽑습니다..");
		dealerCards[0].reverse();
		
		while(calcScore(dealerCards)>17) {
			dealerDraw();
		}
		
		
		print();
		// 딜러의 카드를 뽑으면서 누가 이겼는지 체크해야함

		
		int dealerValue = calcScore(dealerCards);
		
		if(dealerValue>21) {
			System.out.println("플레이어의 승리입니다.");
			player.win();
		}
		else if(playerValue < dealerValue) {
			System.out.println("딜러의 승리입니다.");
			player.lose();
			
		}
		else if(playerValue>dealerValue) {
			System.out.println("플레이어의 승리입니다.");
			player.win();
		}
		else {
			player.draw();
			System.out.println("무승부입니다.");
		}

		
		
	}
	
	
	public static void main(String[] args) {
		//BlackJack play1 = new BlackJack(); 내코드
		//play1.playing();  내코드
		
		new C13_BlackJack().start();
		
		
	}
}
