package myobj;

public class Vehicle {

	public int maxperson;
	public String name;
	public int speed;
	
//	public Vehicle(int maxperson, String name) {
//		this.maxperson=maxperson;
//		this.name=name;
//	}
	
	public void vehicleinfo() {
		System.out.println("�ش� �̵������� �̸��� "+name +"�̰� ������ "+maxperson+ "�� �Դϴ�.");
	}
	
	public void speedcomp(Vehicle V) {
		if(V.speed>300) {
			System.out.println("�ش� �̵������� �ӵ��� �������̰� �ӷ��� "+V.speed+"km/h�Դϴ�.");
		}
		else if(V.speed>150) {
			System.out.println("�ش� �̵������� �ӵ��� ���������̰� �ӷ��� "+V.speed+"km/h�Դϴ�.");
		}
		else  {
			System.out.println("�ش� �̵������� �ӵ��� �������̰� �ӷ��� "+V.speed+"km/h�Դϴ�.");
		}
	}
}
