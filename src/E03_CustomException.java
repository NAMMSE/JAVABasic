
public class E03_CustomException {

	/*
	  # ���ϴ� ���� ���� ���� ����ϱ�
	  
	   - Exception�� ��� ������ �ݵ�� ó���ؾ��ϴ� ����
	   - RuntimeException�� ��� ������ �ݵ�� ó���� �ʿ�� ���� ����
	   
	 */
	
	public static void playCat(Cat cat) throws NotPlaybleCatException {
		// A instanceof B : A�� B�� �ν��Ͻ����� �˻��ϴ� �� ������
		if(cat instanceof RussianBlueCat) {
			// System.out.println("���þ� ���� ��°�  �Ⱦ��մϴ�"); // �̷��� ���� ����ó���� �ϰ�ʹ�
			throw new NotPlaybleCatException(); // �̷��� Exception����
		}
		else {
			System.out.println("����̿� �������ϴ�");
		}
	}
	
	public static void main(String[] args) {
		try { //Exception�� ��ӹ��� ���ܰ� �޼��� ���ο� ������ ���ο��� �ݵ�� try������ ���� ó��������� ���� ��Ÿ���ͼ����� ��ӹ��� ���ܸ� ���� try�� �����൵ �ȴ�
			playCat(new Cat());
			playCat(new PersianCat());
			playCat(new RussianBlueCat());
		}catch(Exception e) {
			
		}
		
//		playCat(new Cat());				// RuntimeException ��ӹ��� Ŭ������ ����ϴ� �޼��� ȣ�� �� �̷��� �ص��ȴ�
//		playCat(new PersianCat());
//		playCat(new RussianBlueCat());
	}
}

class Cat{}

class PersianCat extends Cat{}

class RussianBlueCat extends Cat{}


class NotPlaybleCatException extends Exception{ // Exception�� ��ӹ����� ���ܰ� �ȴ� //���⼭ ��Ÿ���ͼ����� ��ӹ����� ���ο��� ���� try������ ����ó���� �ʿ�� ������ ���ܰ� �߱� ���
	public NotPlaybleCatException() {
		super("�� �� �𸣴� ����� Exception");
	}
}