package myobj;

/*                                                 내코드
public class Tong {

	Scanner sc = new Scanner(System.in);
	int hurt_count = 20;
	int fail_count;
	

	public int countPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("플레이 할 인원 수를 입력하세요 >>");
		int playernum = sc.nextInt();
		return playernum;
	}
	
	public void playing(int playernum, Player player[]) {
		int[] fail = new int[2];
		while(true) {
			int cont;
			for(int i=0;i<2;i++) {
				fail[i] = (int)(Math.random()*20+1);
			}
			for(int i=1 ; ;i++) {
				if(i==playernum+1) {
					i=1;
				}
				System.out.printf("%d번 플레이어 차례입니다. 찌를 곳을 입력하세요 (1~20) >>",i);
				int pick = sc.nextInt();
		
				if(pick==fail[0] || pick==fail[1]) {
					System.out.printf("%d번 플레이어의 패배입니다.\n",i);
					System.out.printf("패배 숫자는 %d, %d입니다..\n",fail[0],fail[1]);
					player[i-1].failcnt++;
					for(int j=0;j<playernum;j++) {
						if(player[j]!=player[i-1]) {
							player[j].wincnt++;
						}
					}
					
					break;
				}
			}

			System.out.print("게임을 그만두시려면 '1'을 플레이어의 전적을 보시려면 '2'를 게임을 계속하시려면 아무키나 누르세요 >>");
			cont = sc.nextInt();
			if(cont == 1) {
				break;
			}
			else if(cont == 2) {
				while(cont==2) {
					System.out.print("확인하고 싶은 플레이어의 번호를 입력하세요 >>");
					cont = sc.nextInt();
					player[cont-1].wins();
					System.out.print("게임을 그만두시려면 '1'을 다른 플레이어의 전적을 보시려면 '2'를 게임을 계속하시려면 아무키나 누르세요 >>");
					cont = sc.nextInt();
				}
				if(cont==1) {
					break;
				}
			}
		}
	}
} 여기까지 */

public class Tong{
	
	
	final static int GAME_SIZE = 20; // final 붙이면 바꿀 수 없다
	
	boolean[] slot ; // 한번 찌른 숫자를 다시 찌르지 않기 위해
	
	int[] launch = new int[2];

	public Tong() {
		rewind();
	}
	
	
	//새 게임 시작할 때 통 아저씨 감아주기 메서드
	public void rewind() {
		slot = new boolean[GAME_SIZE];
		launch[0] = (int)(Math.random() * GAME_SIZE);
		while(true) {
			launch[1] = (int)(Math.random()*GAME_SIZE);
			if(launch[0] != launch[1]) {
				break;
			}
		}
	}
	
	
	/**
	 @param slotIndex - 찌르고 싶은 번호를 매개변수로 전달해야 합니다
	 @return 당첨번호를 선택한 경우 -1, 찌르고 살아남은 경우 1, 찔렀던 곳을 다시 찌르거나 유효하지 않은 번호를 입력한 경우 0
	 */
	public int stab(int slotIndex) {
		
		if(launch[0]==slotIndex || launch[1]==slotIndex) {
			return -1;
		}
		else if(slotIndex < 0 || slotIndex>=GAME_SIZE) {
			return 0;
		}
		else if(!slot[slotIndex]) {
			slot[slotIndex] = true;
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	public void print() {
		for(int i=0;i<GAME_SIZE;i++) {
			if(!slot[i]) {
				System.out.printf("[%02d]\t", i+1);
			}
			else {
				System.out.print("[xx]\t");
			}
			if(i%5==4) {
				System.out.println();
			}
			
		}
	}
	
}





















































