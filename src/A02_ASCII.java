
public class A02_ASCII {

	/*
	 # ASCII �ڵ�
	 
	  - ���� 0 ~ 127 ���� �����ϴ� ���ڸ� ASCII �ڵ��� �Ѵ�
	 */
	public static void main(String[] args) {

		/*
		  ��� �����ʹ� ������ 0�� 1�� ��ȯ�Ǿ� ����ȴ�
		  10 --encoding-> 1010
		  A -> 65 
		  a -> 97
		  0 -> 48
		  ���ڴ� �ٷ� 0�� 1�� ��ȯ �� �� ���� ������ ���ڿ� �ش��ϴ� ���� ���� �����Ѵ�
		  �� ���� �� 0~127�� ������ ASCII �ڵ��� �Ѵ�.

		 
		 */
		System.out.println("ADASDASDAD");
		System.out.println('0'); // ���� 0 - �����δ� �ƽ�Ű�ڵ�� 48�̶�� ��
		System.out.println(0);   // ���� 0 - �����ε� 0
		
		// ���� Ÿ�� ���ͷ��� ���� ���� ����ʹٸ� �տ� (int)�� ���δ�
		System.out.println((int)'0');
		System.out.println((int)'A');
		
		// ���� Ÿ�� ���ͷ��� ���� ���� ����ʹٸ� �տ� (char)�� ���δ�
		System.out.println((char)97);
		System.out.println((char)122);
		
		//���� Ÿ�� ���ͷ��� �����δ� ���ڰ�(�ڵ尪)�� ���� �ֱ� ������ ����� �����ϴ�
		System.out.println('A'+ 100); // �⺻������ ����� ���ڰ��̴�
		System.out.println((char)('A'+ 20));// A�κ��� 20��° �ڿ��ִ� �ڵ��� ���ڸ� ã�� ���
		System.out.println((char)('Z'- 13));// Z 13��° �տ� �ִ� ���ڸ� ã�� ���
		System.out.println('A' + 'a'); // �빮�ڿ� �ҹ����� �Ÿ� 
		System.out.println((char)('k'+ ('A' - 'a')));
		System.out.println('L'- 'A'); // �� ��° ���ĺ����� �� �� ����
		
		//���ڿ��� ���ڰ� ������ ���� �� �� �ִ� Ÿ���̱� ������ Ư�� �ڵ�� ��ȯ �Ұ���
		System.out.println("A"+ 10);
		
	}
	
}
