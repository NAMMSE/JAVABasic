package quiz;

import myobj.YachtDice;

public class C06_YachtDice {

	/*
	  # YachtDice ������ ��������
	  
	   1. �÷��̾�� �ټ� ���� �ֻ����� ������ (�ֻ��� ���� 1~6)
	   2. �ټ� ���� �ֻ��� ���� ����� ���� ������ �����ؾ� �Ѵ�
	   
	    (1) Ǯ �Ͽ콺 (���� ���� 2�� / 3��) ex : 11133, 31313, 66555, 65565
	    (2) ������Ʈ����Ʈ (1234/2345/3456) ex : 42131, 65431
	    (3) ������Ʈ����Ʈ (12345/23456) ex : 12345, 52143
	    (4) 4 ���̽� (���� ���� 4��) ex : 11113, 21222
	    (5) Yacht (���� ���� 5��) ex : 11111, 44444
	    (6) �ƹ��͵� �������� ���� ��� �ֻ��� �� ���� ������ �ȴ�
	    
	   3. �÷��̾�� �ٽ� ������ ���� �ֻ����� ������ ��� �ٽ� ���� �� �ִ� (2ȸ)
	 */
	
	/* �� �ڵ�
	public static void main(String[] args) {
		
		int[] dicenum = new int[5];
		YachtPlayer player = new YachtPlayer(dicenum);
		player.throwDice(dicenum);
		
		System.out.println(Arrays.toString(dicenum));
		
		
	}*/
	
	public static void main(String[] args) {
		
		YachtDice yacht = new YachtDice();
		System.out.println(yacht);
		yacht.reroll("125");
		System.out.println(yacht);
		yacht.reroll("345");
		System.out.println(yacht);
		yacht.reroll("234");
		System.out.println(yacht);
		yacht.reroll("135");
		System.out.println(yacht);
		yacht.reroll("126");
		
	}
}
