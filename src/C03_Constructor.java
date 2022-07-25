
public class C03_Constructor {

	/*
	  # Ŭ������ ������(constructor)
	  
	   - Ŭ������ �̸��� �Ȱ��� �̸��� ���� �޼���
	   - ���� Ÿ���� �������� �ʴ´�
	   - ���ο� �ν��Ͻ��� ������ �� new�� �Բ� �����ڸ� ȣ���Ѵ�
	   - ���ο� �����ڸ� �������� ���� Ŭ������ ������ �ʴ� �⺻ �����ڰ� �����Ѵ�
	     (�⺻ �����ڴ� �ƹ��͵� ���� �ʰ� �ν��Ͻ��� �����Ѵ�)
	   - �����ڴ� �ν��Ͻ� ���� �� ���� ���� ȣ��Ǵ� �޼����̱� ������ �ַ� �ν��Ͻ� �ʱ�ȭ�� ���� ���ȴ�.  
	   - �������� ������ �߿� ��� �����ڷ� �ʱ�ȭ ������ �Ű������� Ÿ�԰� ������ �����Ѵ�.
	   - ������ �ٷ� ����� ����Ű : ���鿡 �ƹ��͵� �Է����� ���� ctrl+space ������ constructor ����
	 */
	
	public static void main(String[] args) {
		Orange o = new Orange(); // new ~ �̰� Ŭ���� �̸��� �ƴ϶� Ŭ���� ������ �����ڷ� �����ϴ°� ������ ������ Ŭ������ �⺻ �����ڷ� �����
		
		o.print();
		
		Orange o2 = new Orange(9999); // 
		o2.print();
		
		Orange o3 = new Orange(7000,777.777);
		o3.print();
		
		//�⺻ �������� ����� ���Ƴ��� Ŭ����
		Mango m = new Mango(333,123);
	}
}

class Orange{
	
	double sweet;
	int price;
	
	void print() {
		System.out.println("price : "+price);
		System.out.println("sweet : "+sweet);
	}
	
	//�⺻ ������(�Ű������� ���� ������)
	Orange(){
		// �������� ù ��° �ٿ����� this()�� �ٸ� �����ڸ� ȣ���ϴ� ���� �����ϴ�.
		this(800);
	}
	//�Ű������� �ִ� ������
	Orange(int price){
		this.price = price;
		sweet =8.0;
	}
	
	
	
	Orange(int price, double sweet){
		this.price = price;
		this.sweet = sweet;
	}
	
}

//�Ű������� �ִ� �����ڸ� ������ Ŭ����
class Mango{
	int price;
	int sweet;
	
	// ���ο� �����ڰ� �ֱ� ������ �⺻ �����ڰ� �ڵ����� ���ǵ��� �ʴ´�
	Mango(int price, int sweet){
		this.price = price;
		this.sweet = sweet;
	}
	
	
}
