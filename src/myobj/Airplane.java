package myobj;

public class Airplane extends Vehicle{

	public String destination;
	
	@Override
	public void vehicleinfo() {
		System.out.println("�� �̵������� �̸��� "+name+"�̰� ������ "+maxperson+"���̰� �������� "+destination+"�Դϴ�.");
	}
}
