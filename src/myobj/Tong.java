package myobj;

/*                                                 ���ڵ�
public class Tong {

	Scanner sc = new Scanner(System.in);
	int hurt_count = 20;
	int fail_count;
	

	public int countPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�÷��� �� �ο� ���� �Է��ϼ��� >>");
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
				System.out.printf("%d�� �÷��̾� �����Դϴ�. � ���� �Է��ϼ��� (1~20) >>",i);
				int pick = sc.nextInt();
		
				if(pick==fail[0] || pick==fail[1]) {
					System.out.printf("%d�� �÷��̾��� �й��Դϴ�.\n",i);
					System.out.printf("�й� ���ڴ� %d, %d�Դϴ�..\n",fail[0],fail[1]);
					player[i-1].failcnt++;
					for(int j=0;j<playernum;j++) {
						if(player[j]!=player[i-1]) {
							player[j].wincnt++;
						}
					}
					
					break;
				}
			}

			System.out.print("������ �׸��ν÷��� '1'�� �÷��̾��� ������ ���÷��� '2'�� ������ ����Ͻ÷��� �ƹ�Ű�� �������� >>");
			cont = sc.nextInt();
			if(cont == 1) {
				break;
			}
			else if(cont == 2) {
				while(cont==2) {
					System.out.print("Ȯ���ϰ� ���� �÷��̾��� ��ȣ�� �Է��ϼ��� >>");
					cont = sc.nextInt();
					player[cont-1].wins();
					System.out.print("������ �׸��ν÷��� '1'�� �ٸ� �÷��̾��� ������ ���÷��� '2'�� ������ ����Ͻ÷��� �ƹ�Ű�� �������� >>");
					cont = sc.nextInt();
				}
				if(cont==1) {
					break;
				}
			}
		}
	}
} ������� */

public class Tong{
	
	
	final static int GAME_SIZE = 20; // final ���̸� �ٲ� �� ����
	
	boolean[] slot ; // �ѹ� � ���ڸ� �ٽ� ��� �ʱ� ����
	
	int[] launch = new int[2];

	public Tong() {
		rewind();
	}
	
	
	//�� ���� ������ �� �� ������ �����ֱ� �޼���
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
	 @param slotIndex - ��� ���� ��ȣ�� �Ű������� �����ؾ� �մϴ�
	 @return ��÷��ȣ�� ������ ��� -1, ��� ��Ƴ��� ��� 1, �񷶴� ���� �ٽ� ��ų� ��ȿ���� ���� ��ȣ�� �Է��� ��� 0
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





















































