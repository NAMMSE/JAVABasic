
public class B15_Array {

	/*
	 # �迭
	 
	  - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ����
	  - ���� �̸����� ������ ������ ������ �Ŀ� �ε����� �����Ѵ�
	  - �迭�� ����� ���ÿ� ũ�⸦ ���ؾ� �Ѵ�
	  - ũ�Ⱑ �������� ũ�⸦ ������ �� ����
	  - �迭�� �ε����� 0���� ��ü����-1�� ���� �ִ�
	  - �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ��ִ�
	    (���� : 0, �Ǽ� : 0.0, boolean : false, ������ : NULL)
	    
	    
	 
	 # �迭 ���� ���
	 
	  1. Ÿ��[] ������ = new Ÿ��[ũ��];
	  2. Ÿ��[] ������ = {��1, ��2, ��3 ...};            2, 3���� ���� ���� ���� �翡 ���� ũ�Ⱑ �˾Ƽ� ������
	  3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3, ...};
	 */
	public static void main(String[] args) {
		
		int[] score = new int[5]; // �迭�� ���̰� 3�϶� ���ȣ�� 2������ �ִ�
		
		score[0] = 99;
		score[1] = 92;
		score[2] = 91;
		//score[3] = 94;
		
		System.out.println("score�� ����: " +score.length);// �迭�� length �ڿ� ��ȣ ���̸� �ȵ�
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]); // �迭�� ����� ���ÿ� �ʱ�ȭ�� �����൵ 0���� �ʱ�ȭ��(�ڹٿ�����)
		System.out.println(score[4]);
		
		boolean[] complete = new boolean[5];
		
		for(int i = 0; i<complete.length;i++) {
			System.out.println(complete[i]);
		}
		
		char[] text = new char[100];
		
		text[0] = 'h';
		text[1] = 'e';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
		
		//char[] �� ���ڿ��̳� �ٸ�����
		System.out.println(text);
	
		// �迭 �����ϱ�
		
		short[] eye_power = new short[10];
		long[] money = {123L, 234L, 5, 6, 789L}; //long Ÿ�Կ� int Ÿ���� ���� �־ ������ �ȳ��°� ������ Ÿ��ĳ����
		String[] name = new String[] {"��ö��", "��ö��", "��ö��", "��ö��", "��ö��"};
		
		//�迭�� ���� �ֱ�(�� �����ϱ�)
		name[3] = "������";
		
		//�迭�� �� ����ϱ�
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		String welcomeMessage = "Hello, World!!";
		
		char[] msg = welcomeMessage.toCharArray();
		System.out.println(msg[0]);
		System.out.println(msg[1]);
		System.out.println(msg[msg.length -1]);// length -1 ��° �ε����� ������ ����
		System.out.println(msg[msg.length -2]);
		System.out.println(msg[msg.length -3]);
		System.out.println(msg[msg.length -4]);
		System.out.println(msg[msg.length -5]);
	
	}
	
	
}
