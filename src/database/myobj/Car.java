package database.myobj;

public class Car {//0517 ȭ
	// ����� ���Ƶ��� ���� ����
	final public static CarType normal = new CarType(0, "�Ϲ�"); // �� ������ ���� Ÿ�� �������ִ� Ŭ������ �ʱ�ȭ
	final public static CarType disabled = new CarType(1, "�����");
	final public static CarType babyRide = new CarType(2, "���Ƶ���");
	final public static CarType lightCar = new CarType(3, "����");
	
	private static String[] parkState = {"�Ǻ���", "��������", "���Ա���"}; // ���� ���� Ȯ��
	
	private String carNum; // ���� ��ȣ
	private CarType  carType; // ���� Ÿ�� Ŭ���� �ν��Ͻ�
	private int state;			// ���� ���� 
	
	public Car(String carNum, CarType carType) {
		this.carNum = carNum;
		this.carType = carType;
		
	}
	
	public CarType getCarType() { // ���� Ÿ�� ��ȯ
		return carType;
	}
	
	public void setState(int state) { // ���� ���� �ʱ�ȭ
		this.state = state;
	}
	
	public String getLastNum() { // ���� ��ȣ�� �� ��ȣ 
		return carNum.substring(6); // 12��1234 �����϶� �տ� 6�ڸ� �����ϸ� ������ ��ȣ�� ����
	}
	
	public String getCarNum() {
		return carNum;
	}
	
	public String getCarState() {
		return parkState[state];
	}
	
	@Override
	public String toString() { // ���� ��ȣ / ���� Ÿ�� / ���� ����
		return String.format("%s - %s [%s]",carNum, carType.getName(), parkState[state]);
	}
	
}
