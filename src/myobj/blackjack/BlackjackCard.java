package myobj.blackjack;

public class BlackjackCard extends Card{

	private final static char[] SUIT = {'¢¼','¢½','¢À','¡Þ'};
	private final static String[] NUMBERS = {"A", "2", "3","4", "5", "6","7", "8", "9","10", "J", "Q","K"};
	private final static int[] VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 ,10 ,10};
	
	private int suit;
	private int num;
	
	
	public BlackjackCard(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void reverse() {
		visible = !visible;
	}
	
	public String toString() {
		return String.format("Shape: %c%s\tValue: %d\n", SUIT[suit], NUMBERS[num], VALUES[num]);
	}
	
	
	@Override
	public int getValue() {
		return VALUES[num];
	}
	
	@Override
	public String getCardShape() {
		if(visible) {
			return String.format("%c%s", SUIT[suit], NUMBERS[num]);
		}
		else {
			return "[µÞ¸é]";
		}
	}
}
