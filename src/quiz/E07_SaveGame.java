package quiz;

import java.util.Scanner;

import myobj.rps.Rps;

public class E07_SaveGame {

	/*
	  ��ǻ�Ϳ��� ������ ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����
	  ������ �ٽ� �����ϸ� ���� ������ �״�� �ݿ��ǵ��� ��������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer win=0;
		Integer lose=0;
		while(true) {
			
			boolean error = false;
			Rps com = Rps.random();
			Rps user = null;
			System.out.print("����(0) / ����(1) / ��(2) �����ϼ���");
			switch(sc.nextInt()) {
			case 0:
				user = Rps.SCISSORS;
				break;
			case 1:
				user = Rps.ROCK;
				break;
			case 2:
				user = Rps.PAPER;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
				error=true;
				break;
			}
			if(error)
				continue;
			System.out.printf("com : %s \tuser : %s\n", com.getName(), user.getName());
			switch(Rps.versus(com, user)) {
			case 0:
				System.out.println("�����ϴ� !");
				break;
			case 1:
				System.out.println("����� �̰���ϴ� !");
				win++;
				break;
			case -1:
				System.out.println("��ǻ�Ͱ� �̰���ϴ� !");
				lose++;
				break;
			}
			System.out.print("������ ����Ͻ÷��� 0, �����Ͻ÷��� 1, ������ Ȯ���Ϸ��� 2�� ��������");
			switch(sc.nextInt()) {
			case 0:
				continue;
			case 1: 
				user.saveScore(win,lose);
				return;
			case 2:
				user.loadScore();
				user.saveScore(win,lose);
				
				return ;
			}
		}
	}
}
