package myobj;

public class Person {

	public String name;
	public int age;
	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	
//	public void sayhi(Person p) {
//		if(p.age<10) {
//			System.out.println("�ȳ� ���̸��� "+ name +"�̰� ���̴� " + age + "�� �̾�");
//		}
//		else if(p.age<20) {
//			System.out.println("�ȳ��ϼ���~ �� �̸��� "+ name +"�Դϴ�.");
//		}
//		else if(p.age<30) {
//			System.out.println("�ȳ��Ͻʴϱ�. �� �̸��� "+ name +"�Դϴ�.");
//		}
//		
//	}
	
	// ��ĳ���� �ٿ�ĳ���� �� �Ϸ��� ������ �ڵ�
	public void sayhi() {
		if(age<10) {
			System.out.println("�ȳ� ���̸��� "+ name +"�̰� ���̴� " + age + "�� �̾�");
		}
		else if(age<20) {
			System.out.println("�ȳ��ϼ���~ �� �̸��� "+ name +"�Դϴ�.");
		}
		else if(age<30) {
			System.out.println("�ȳ��Ͻʴϱ�. �� �̸��� "+ name +"�Դϴ�.");
		}
		
	}
}
