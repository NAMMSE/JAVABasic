import myobj.Person;

public class C11_LocalInnerClass {

	/*
	  # ���� ���� Ŭ����
	  
	   - �޼��� ���ο� ������ Ŭ����
	   - �ش� �޼��尡 ������ ������ ���ϴ� Ŭ����
	   - �ش� �޼��� �ٱ������� ������ �� ����
	 */
	
	public static void main(String[] args) {
		
		int defaultPrice = 1000;
		char defaultGrade = 'B';
		
		// ���� ���� Ŭ����(�޼��� ������ Ŭ���� - ������ ���� �޼��� �ȿ� ���� ��)
		class Apple{
		
			int price;
			int grade;
			
			public Apple() {
				// ������ ���� �� �Ű������� ������ this�� �ᵵ �ǰ� �Ƚᵵ �� 
				// �Ű������� ���� �ް� �ش� �Ű������� ������� Ŭ������ �ʵ���� ������ �����ϱ� ���ؼ� �ݵ�� �����
				price = defaultPrice; 
				grade = defaultGrade;
			}
			
			@Override
			public String toString() {
				//return super.toString();
				return "price: " + price + ", grade : " + grade;
			}
			
		}
		
		Apple a = new Apple();
		System.out.println(a);
		
		//------------------------------------------------------------------
		
		// myobj�� �ִ� person Ŭ���� import ����ߵ�

		// #�͸� ���� ���� Ŭ���� - ��ӹ޾Ҵµ� �ڽ� Ŭ������ �̸��� ����
		//  -�޼��� ���ο��� Ŭ������ ���� ����(���)�ϸ� ����ϴ� ��� (������ ���ÿ� ���) - ��ӹ����� �ڽ�Ŭ������ �θ�Ŭ������ �ڿ��� ��� ���������̱� ������
		//  -�̸��� ���� ������ ���ο� �޼��带 �߰��ص� ����� �� ����
		//  - ������ �޼��带 �������̵��� ����ϴ� ���� �����ϴ�
		Person p = new Person() {
			{
				name = "�Ѹ�";
				age = 9;
			}
			
			@Override
			public void sayhi() {
				System.out.println("�͸� Ŭ������ sayHi�Դϴ�.");
				punch(); // �̶��� �������̵��� �޼��忡�� ȣ���� ���̱� ������ ��밡���ϴ�
			}
			
			void punch() {
				System.out.println(name + "�� �տ� �ִ� ����� ���Ƚ��ϴ�.");
			}
			
		};
		
		// p.punch(); //�̰� �ȵǴ� ���� 49��° �ٿ��� p�� �ڽ��� �ƴ϶� �θ�Ŭ������ �����߱⶧���� ��ĳ������ �ǰ� �׷� �ڽ�Ŭ������ ��� �޼��� ��� �Ұ���
		p.sayhi();
		
	}
}
