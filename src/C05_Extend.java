import myobj.Person;
import myobj.Police;
import myobj.Programmer;

public class C05_Extend {

	/*
	  # Ŭ���� ���
	  
	   - �̹� ������� �ִ� Ŭ������ �����޾Ƽ� ����ϴ� ����
	   - �ڽ� Ŭ������ �θ� Ŭ������ ��� �ڿ��� �״�� ����� �� �ִ�
	   - �ڽ� Ŭ�������� �θ� Ŭ������ ���� ����� ���� �߰��ؼ� ����� �� �ִ�
	   - �ڽ� Ŭ������ �θ𿡰Լ� �������� �޼��带 �״�� ������� ���ļ� ����� �� �ִ�(�������̵�)
	   - �ڽ� Ŭ������ �ݵ�� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�
	   
	  # super
	  
	   - �ڽ� Ŭ������ ������ �ν��Ͻ��� ���ο� �� ������ �з��ȴ�
	   - this�� ���� �ν��Ͻ� �� �ڽ� Ŭ������ �κ��� ���Ѵ�
	   - super�� ���� �ν��Ͻ� �� �θ� Ŭ������ �κ��� ���Ѵ�
	   - this()�� ���� Ŭ������ �����ڸ� �ǹ��ϵ��� super()�� �θ� Ŭ������ �����ڸ� �ǹ��Ѵ�
	 */
	
	public static void main(String[] args) {
		Person dooly = new Person();
		dooly.age=7;
		dooly.name = "�Ѹ�";
		
		Person chulsu = new Person();
		chulsu.name = "ö��";
		chulsu.age = 23;
		
		Police popo = new Police();
		popo.setName("������");
		popo.setAge(18);
		
		Programmer coder = new Programmer();
		coder.name = "���ڴ�";
		coder.age = 23;
		
		// Person�� �䱸�ϴ� �ڸ��� �ڽ� Ŭ������ police�� programmer���� �� �� �ִ�(��ü�� ������)
//		dooly.sayhi(coder);
//		dooly.sayhi(popo);
//		dooly.sayhi(chulsu);
//		chulsu.sayhi(dooly);
		
		
		
		
		Programmer p2 = new Programmer();
		
		p2.age = 10;
		p2.name = "��浿";
		p2.salary = 700;
		
		p2.sayhi();
		p2.program("�¶��� ���� ����Ʈ");
		
		Police p3 = new Police();
		
		//Person�� name, age�� Police�� name, age�� ��� �����ִ�
		p3.name = "������";
		p3.age = 20;
		p3.setName("������");
		p3.setAge(26);
		p3.sayhi();
		
	}
	
}




