package myobj.blackjack;

abstract public class Card {

	protected boolean visible = true;
	abstract public void reverse();
	abstract public int getValue();
	
	abstract public String getCardShape();
}
