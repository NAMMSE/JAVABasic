package myobj;

public class Car extends Vehicle{

	public String car_color;
	
	@Override
	public void vehicleinfo() {
		System.out.println("�� �̵������� �̸��� "+name+"�̰� ������ "+maxperson+"���̰� ���� ������ "+car_color+"�Դϴ�.");
	}
}
