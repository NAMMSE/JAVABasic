package myobj;

public class Defender extends Person{

	
	public void block(){
		System.out.println(name + "���� ���з� ȭ���� ���ҽ��ϴ�.");
	}
	public void bash(){
		System.out.println(name + "���� ���з� �տ��ִ� ����� ���Ƚ��ϴ�.");
	}
	
	@Override
	public void sayhi() {
		System.out.println(name + "���� ���и� ���� �ε�Ƚ��ϴ�");
	}
	
	
}
