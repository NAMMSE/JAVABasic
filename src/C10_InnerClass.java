
public class C10_InnerClass {
	/*
	  # Ŭ���� ���ο� Ŭ���� ����ϱ�
	  
	   - Ŭ���� ���ο��� Ŭ������ ���� �ϰ� ����� �� �ִ�.
	   - Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ�
	 */
	
	// �⺻�� ����Ÿ���� �ʱⰪ�� 0, 0.0, false
	private static int a=1,b=2,c;
	// ������ ����Ÿ���� �ʱⰪ�� null�̴�
	private String s1, s2, s3; // Ŭ���� ���ο� �ִ� ���ο��� �ҷ����� ������ private �ٿ��� ���ο��� ȣ�� ����
	private Apple a1, a2, a3; // C02_OOP�� �ִ� Apple 

	public C10_InnerClass() {
		System.out.println("�����ڻ�����");
	}
	
	// static int a;
	
	
	private static int d = 1, e = 3, f;
	// Ŭ���� ������ ����ƽ Ŭ����
	static class Orange{ // ����ƽ�� �ν��Ͻ� ���� ������ ��� �����ϱ� ������ �ٱ� Ŭ������ . �� ��� ����ؾ���
		
		int price;
		int sweet;
		
		public Orange() {
		
			price = d; // ���� ����ƽ ������ �ǰ�
			sweet = e; // a, b�� �ȵ� 
		}
		
		
		
		@Override
		public String toString() {
			return ("���� : "+price+", �絵 : "+sweet);
		}
	}
	
	
	
	class Sagwa {
		int price;
		int sweet;
		
		// Ŭ���� ������ Ŭ���������� �ٱ� Ŭ������ �ڿ����� ����� �� �ִ�(
		// ���� Ŭ���� �����̱� ������ private �ڿ��� ����
		public Sagwa() {
			price = a;
			sweet = b;
			System.out.println("123123123");
		}
		
		@Override
		public String toString() {
			return ("���� : "+price+", �絵 : "+sweet);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		new C10_InnerClass();
		
		C10_InnerClass instance = new C10_InnerClass();
		
		instance.a=100;
		instance.b=100;
		
		instance.new Sagwa();
		System.out.println(instance.s1);
		System.out.println(instance.s2);
		
		System.out.println(instance.a1);
		System.out.println(instance.a2);
		
		// Ŭ���� ������ Ŭ������ �ν��Ͻ� �����ϱ�
		C10_InnerClass.Sagwa apple = instance.new Sagwa();
		System.out.println(apple);
		
		instance.a=300;
		instance.b=400;
		// Ŭ���� �ٱ��� �ν��Ͻ��� ������ ��� ����
		C10_InnerClass.Sagwa apple2 = instance.new Sagwa();
		System.out.println(apple2);
		
		C10_InnerClass.Orange orange = new C10_InnerClass.Orange();
		System.out.println(orange);
		
		
		C10_InnerClass.d = 100;
		C10_InnerClass.e = 200;
		C10_InnerClass.Orange orange2 = new C10_InnerClass.Orange();
		System.out.println(orange); // ���� Ŭ������ ����� �����ڸ� ������ ��ÿ� ���� ���� �� ���Ŀ��� ������ ��������
		System.out.println(orange2);
		
	}
}
