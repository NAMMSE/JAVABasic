package myobj;

public class Programmer extends Person{

	public int salary; // �ܺο��� ������ ���� ������ public �پ����
	
	//@Override // ������̼��� �ٿ������� �������̵尡 �������� ���� �� ������ �߻������ش�
	public void sayhi() {
		System.out.println("�ȳ��ϼ��� ���� " + salary + "�� �ް� ���ϴ�" + name + "�Դϴ�!");
	}
	
	public void program(String toProgram) {
		if(salary<500) {
			System.out.println(name + "���� \"" + toProgram + "\"�� ���� ������ �߽��ϴ�");
		}
		else {
			System.out.println(name + "���� \"" + toProgram + "\"�� ������ ������ �߽��ϴ�");
		}
	}
	
}
