package quiz;

import java.util.Scanner;

import myobj.rps.Shape;

public class C14_RPS {

	/*
	 	���������� ������ �������� c������ 
	 */
	/*public static void main(String[] args) {
		
		Player player = new Player();
		player.playing();
	}
}

class Player{
	int win;
	int lose;
	//double winrate = (win/(win+lose))*100;
	
	public void playerInfo() {
		System.out.printf("�÷��̾��� �¸� Ƚ�� : %d\n�÷��̾��� �й� Ƚ�� : %d\n�÷��̾��� �·� : %.2f\n", win, lose,(double)win/(win+lose)*100 );
	}
	
	public void playing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("#### ���������� ������ �����մϴ�. ####");
		while(true) {
			int comrps = (int)(Math.random()*3);
			System.out.print("���� : 1, ���� : 2, �� : 3 \n�Է��ϼ��� >>");
			int playerrps = sc.nextInt()-1; //��ǻ���� rps�� 0,1,2, �̹Ƿ� ����ڰ� �Է��� 1,2,3���� 1�� ���ش�
			if(playerrps>2||playerrps<0) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���>>");
				continue;
			}
			if((comrps==0&&playerrps==1)||(comrps==1&&playerrps==2)||(comrps==2&&playerrps==0)) {
				if(playerrps==1) {
					System.out.println("�÷��̾�:\t����\n��ǻ��:\t����\n** �����մϴ�. ����� �̰���ϴ�. **");
					win++;
				}else if(playerrps==2) {
					System.out.println("�÷��̾�:\t��\n��ǻ��:\t����\n** �����մϴ�. ����� �̰���ϴ�. **");
					win++;
				}else {
					System.out.println("�÷��̾�:\t����\n��ǻ��:\t��\n** �����մϴ�. ����� �̰���ϴ�. **");
					win++;
				}
			}
			else if((comrps==1&&playerrps==0)||(comrps==2&&playerrps==1)||(comrps==0&&playerrps==2)) {
				if(playerrps==1) {
					System.out.println("�÷��̾�:\t����\n��ǻ��:\t��\n����... ����� �����ϴ�.");
					lose++;
				}else if(playerrps==2) {
					System.out.println("�÷��̾�:\t��\n��ǻ��:\t����\n����... ����� �����ϴ�.");
					lose++;
				}else {
					System.out.println("�÷��̾�:\t����\n��ǻ��:\t����\n����... ����� �����ϴ�.");
					lose++;
				}
			}
			else {
				System.out.println("�����ϴ�. �ٽ� �ϰڽ��ϴ�.");
				continue;
			}
			System.out.println("====================================================");
			System.out.printf("�÷��̾��� ������ ���÷��� 1, ��� �÷��� �Ϸ��� �ƹ��ų� ��������>>");
			int cont = sc.nextInt();
			if(cont==1) {
				playerInfo();
			}else continue;
			System.out.println("������ �����÷��� 1, ��� �÷��� �Ϸ��� �ƹ��ų� ��������");
			cont = sc.nextInt();
			if(cont==1)break;
		}
	}
	*/
	
	
	
	public static void main(String[] args) {
		
		
//		 0�� ����, 1�� ����, 2�� ���ڱ�
//		 �̷� ���������ڰ� �ܿ��� �ϴ� ���� ���� �ѹ���� �Ѵ�
//		 ���� �ѹ����� �����Ѵ���ڸ� �˰� �ִ� �����̱� ������ �� ���� ���´� �ƴϴ�.
//		Shape com = Shape.random();
//		Shape user = Shape.random();
//		
//		System.out.println("com: "+com.getName());
//		System.out.println("user: "+user.getName());
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean error=false;
					
			Shape com = Shape.random();
			Shape user;
			System.out.print("����(0), ����(1), ��(2)�� �����ϼ���>>");
			switch(sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS;
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPER;
				break;
			default:
				System.out.println("�ٽ� �������ּ���");
				user = null;
				error = true;
				break;
					
			}
			if(error) {
				continue;
			}
			System.out.printf("com: %s \tuser: %s\n", com.getName(), user.getName());
			switch(Shape.versus(com, user)) {
			case 1:
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				continue;
			case 0:
				System.out.println("�����ϴ� !");
				continue;
			case -1:
				System.out.println("����� �̰���ϴ�");
				continue;
			}
			
		}
	}
}



















































