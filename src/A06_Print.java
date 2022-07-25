
public class A06_Print {

	/*
	 # �ֿܼ� ����ϴ� �Լ���
	  1. println()
	   - ()�ȿ� ������ �����͸� �ֿܼ� ����ϸ鼭 ���� �ڵ����� �ٲ��ش�.
	   
	  2. print()
	   - ()�ȿ� �����ѵ����͸� �ֿܼ� ����Ѵ�
	   
	  3. printf()
	   - print Format
	   - ������ �̿��� ���ϴ� ��� ���¸� �̸� ����� �� �� �ִ� �Լ�
	   - ���� ���� �ڸ��� ���� ������� ä���� ����Ѵ�
	   - \n�� �ڵ����� �߰����� �����Ƿ� �����ؾ� �Ѵ�
	   
	   # ���� ������ ����
	   
	    %d : �ش� �ڸ��� ������ �������� 10������ ���(decimal)
	    %x : �ش� �ڸ��� ������ �������� 16������ ���(�ҹ���)
	    %X : �ش� �ڸ��� ������ �������� 16������ ���(�빮��)
	    %o : �ش� �ڸ��� ������ �������� 8������ ���
	    %s : ���ڿ�
	    %c : ����
	    %f : �Ǽ�
	    %% : �׳� %��  ����ϰ� ���� �� ���
	    1234(8) = 8^3 * 1 + 8^2 * 2 + 8^1 * 3 + 4
	   
	   # ���� ���� �ɼ�
	   
	     - ���� ������ %�� ���� ���̿� �־ ����Ѵ�
	     
	     1. %����d
	      - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�
	    
	     2. %-����d
	      - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�
	      
	     3. %0����d
	      - �ڸ����� ���ڸ�ŭ Ȯ���ϰ� ���ڸ��� 0�� ä�� ���
	      
	     4. %.����f
	      - �Ǽ��� �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�

			�� �ɼǵ��� ���� �����Ͽ� ��밡��
	 */
	
	

	
	public static void main(String[] args) {
		
		System.out.printf("������ %d%d �Դϴ�. \n", 4, 13);
		
		int year = 2022;
		int month = 4;
		int day = 13;
		int hour = 14;
		int min = 25;
		int sec = 55;
		
		System.out.printf("������ %d%d �Դϴ�. \n", 4, 13);
		System.out.printf("������ " + year + "�� " + month + "�� " + day + "���̰� "
				+ "���� �ð��� "+ hour + "�� " + min + "�� " + sec + "�� �Դϴ� \n");
		System.out.printf("������ %d�� %d�� %d���̰�, ����ð��� %d�� %d�� %d�� �Դϴ�. \n",
				           year, month, day, hour, min, sec);
		
		System.out.printf("30(10): %d\n", 30);
		System.out.printf("30(16): %x\n", 30);
		System.out.printf("30(16): %X\n", 30);
		System.out.printf("30(8): %o\n", 30);
		System.out.printf("������ %s �Դϴ�\n", "�����");
		System.out.printf("������ %c �Դϴ�\n", '5');
		System.out.printf("������ %f �Դϴ�\n", 24.3);
		
		System.out.printf("%5d\n", 24);
		System.out.printf("%10d\n", 24);
		System.out.printf("%15d\n", 24);
		
		System.out.printf("%-5d : 10\n", 15);
		System.out.printf("%-10d : 10\n", 15);
		System.out.printf("%-15d : 10\n", 15);
		
		System.out.printf("%02d\n",15);
		System.out.printf("%02d\n",3);
		
		System.out.printf("%010.3f\n",123.555555555); //���Ĺ��� �ɼ� ����
		System.out.printf("%02d\n",3);
	
		
	}
}
