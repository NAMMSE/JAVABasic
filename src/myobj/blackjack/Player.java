package myobj.blackjack;

public class Player {

	private int money;
	private int win;
	private int lose;
	private int draw;
	private int betmoney;
	
	public Player() {
		money = 5000;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void betting(int betmoney) {
		this.betmoney = betmoney;
	}
	
	public void win() {
		win++;
		money += betmoney;
	}
	
	public void draw() {
		draw++;
	}
	
	public void lose() {
		lose++;
		money -= betmoney;
	}
	
	@Override
	public String toString() {
		return String.format("���� �Ӵ� : %d\n�·� : %.2f",money, (double)win / (win+lose+draw)*100);
	}
}
