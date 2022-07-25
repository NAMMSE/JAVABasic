package myobj.blackjack;

import java.util.Random;

public class BlackjackDeck extends Deck {

	Card[] cards;
	int size;
	
	int index;
	
	public BlackjackDeck(int size) {
		this.size = size;
		cards = new Card[52 * size];
		
		for (int i=0;i<size; i++) {
			for(int suit = 0;suit<4;suit++) {
				for(int num =0;num<13;num++) {
					//System.out.printf("[%d] %s\t [index:%d]\n", i, new BlackjackCard(suit, num), i*52+suit*13+num);
					cards[i*52 + suit *13 +num] = new BlackjackCard(suit, num);
				}
			}
		}
		
		shuffle();
	}
	
	@Override
	public void shuffle() {
		for(int i =0 , len=200*size;i<len;i++) {
			Card temp = cards[0];
			int ranIndex = (int)(Math.random()*cards.length);
			temp = cards[0];
			cards[0] = cards[ranIndex];
			cards[ranIndex] = temp;
		}

	}

	@Override
	public Card draw() {
		// TODO Auto-generated method stub
		return cards[index++];
	}
	
	

}
