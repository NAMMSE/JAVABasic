package myobj;

//public class Player { �� �ڵ�
//	public int mynum=1;
//	public int wincnt=0;
//	public int failcnt=0;
//	
//	public void wins() {
//		System.out.printf("%d�� �÷��̾��� �¸� Ƚ���� %d��, �й� Ƚ���� %d�� �Դϴ�. \n", mynum, wincnt, failcnt);
//	}
//}

public class Player{
	int win;
	int lose;
	
	
	public void print() {
		System.out.printf("Win : %d, Lose : %d, Rate : %.2f\n", win, lose, winRate());
	}
	
	public double winRate() {
		if(win+lose == 0)
			return 0.0;
		return (double)win/(win+lose)*100.0;
	}
	
	public void win() {
		win++;
	}
	public void lose() {
		lose++;
	}
	
}
