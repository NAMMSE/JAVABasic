
public class B04_switch {

	/*
	 # switch-case��
	  - ()���� ����� ���� ������ �ڵ带 �����ϴ� ����
	  - ()�ȿ� boolean Ÿ�� ��� �ٸ� Ÿ���� ����Ѵ�
	  - if������ �Ϻ��ϰ� ��ü�� �� �ֱ� ������ ���� ��������� �ʴ´�
	  - break�� ������ break�� ���������� �������鼭 ��� case ����
	  - default�� if���� else���� ������ �Ѵ�
	 */
	
	public static void main(String [] args) {
		
		String num = "abc";
		switch(num) {
		
		case "ab":
			System.out.println("num�� 0�Դϴ�.");
			break;
		case "abd":
			System.out.println("num�� 1�Դϴ�.");
			break;
		case "abc": case "3": case "4":
			System.out.println("2,3,4�Դϴ�.");
			break;
		default:
			System.out.println("���� case�� ��� �ش����� �ʾ� ����˴ϴ�.");
			break;
		
		}
	}
	
}
