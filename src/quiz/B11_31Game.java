package quiz;

import java.util.Scanner;

public class B11_31Game {

	/*
	 31������ ����� ������
	 
	 1. ó�� ���α׷��� �����ϸ� �� ������ ������ �� �����Ѵ�
	 2. ���� �÷��̾ �����ư��鼭 ���ڸ� �����Ѵ�(���ڴ� 1,2,3�� ���ð���)
	 3. �ο��� �ּ� 2���̻�
	 4. ������ 31�̻��̸� �� ����� �й��Ѵ�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("�÷��� �� 2�� �̻� �ο��� �Է��ϼ���>>");
		int player;
		while(true) {  // 2�� �̻� �Է��� �� ���� �ο� �Է� �ޱ�
			player = sc.nextInt();
			if(player>=2) {
				break;
			}
			else {
				System.out.print("2�� �̻����� �ٽ� �Է��ϼ���>>");
			}
		}
		
		
		
		int cnt = 0;
		int num3;
		while(true) { // ������ 31�Ǹ� �����⶧���� ���ѹݺ��� �ݺ���
			int pcnt= 0; // �÷��̾���� ��� ���ƾߵǱ� ������ �ݺ��� ���� ���� �ʱ�ȭ ����
			while(pcnt<player) { // �÷��̾ Ȯ���ϱ� ���� �ݺ���
				pcnt++;
				System.out.printf("���� �÷��̾� : %d��\n", pcnt);
				while(true) {					// 1,2,3 ���� ���� �Է� �� �ٽ� �Է¹޴� �ݺ���
					System.out.print("1, 2, 3 �� ���ϴ¸�ŭ ���� �Է��ϼ���>>");
					num3 = sc.nextInt();
					if(num3>=1 && num3<=3) { // 1, 2, 3 �� �ϳ��� �Է�
						break;
					}
					else {
						System.out.print("�߸��� �Է��Դϴ�. ");
					}
				}
				cnt+=num3; // ���� ���� ���� ���� ��
				System.out.printf("\n���� ���� ����:%d\n", cnt);
				if(cnt>=31) {
					System.out.printf("\n%d���� �й��Ͽ����ϴ�.\n",pcnt);
					return; // �������� �ݺ����� ���Ƽ� break�� �ƴ� return���� ���α׷� ����
				}
			}	
		}
*/
		
		
		int MAX_PLAYER ;
		while(true) {
			System.out.print(" �� ��? ");
			MAX_PLAYER = sc.nextInt();
			if(MAX_PLAYER >= 2) {
				break;
			}
			System.out.print("����� �Է� ");
		}
		System.out.println("�÷��̾�� " + MAX_PLAYER + "�� �Դϴ�.");
		
		
		int num = 0;
		int current_player = 0;
		while(num < 31) {
			int usernum = -1;
			
			while(usernum<1||usernum>3) {
				System.out.printf("�÷��̾� %d ���ڸ� �Է��ϼ��� >>",current_player);
				usernum = sc.nextInt();
			}
			
			
			
			num+=usernum;
			
			if(num>=31) {
				System.out.printf("�÷��̾�%d�� �й�\n  ",current_player+1);
				break;
			}
			System.out.println("���� ���ڴ� " + num + "�Դϴ�. ");
			current_player = (current_player +1) % MAX_PLAYER;
		}
		System.out.println("num�� 31�� �Ѿ while���� ������ϴ�. ");
		
		// ����� �ڵ�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

