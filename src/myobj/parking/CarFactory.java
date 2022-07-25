package myobj.parking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;

public class CarFactory { // 0517 ȭ

	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>(); // ���� ��¥ dowŰ ������ 
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY, "16"); // ����Ʈ�Ѹʿ� dow.���� Ű ������ 16, 27 �� �������� ��ȣ ���� �Է�
		limitNumMap.put(DayOfWeek.TUESDAY, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY, "38");
		limitNumMap.put(DayOfWeek.THURSDAY, "49");
		limitNumMap.put(DayOfWeek.FRIDAY, "50");
	}
	
	static CarType[] types = {Car.babyRide, Car.disabled, Car.lightCar, Car.normal,Car.normal,Car.normal,Car.normal,Car.normal};
	
	public static Car getLimitedTestCar() { // ���� ����ȣ�� 10�� ���ڸ� �� ������ ���ѵǴ� ��찡 ��� �ƿ� ���ѵǵ��ϸ� �׽�Ʈ �ϱ����� �޼���
		String carNum = "12��123"; // ������ ���ڸ��� �׽�Ʈ �ϹǷ� �׽�Ʈ�� carnum�� ��ȣ�� 3�ڸ��̴� �ؿ��� ���ڸ� �־���
		DayOfWeek dow = LocalDate.now().getDayOfWeek(); // ���� ��¥(2022-05-17)�� ���ϸ� (TUESDAY)�� �̾Ƽ�
		String limitNum = limitNumMap.get(dow);// ����Ǿ��ִ� ���ԳѸʿ��� DayOfWeek.TUSEDAY�� �ǹ�

		if(limitNum == null) { //���ԳѸʿ��� ���� 5��ġ�� �־ ���� ��¥�� �ָ��̸� ���Գ��� ���� �ȴ�
			System.out.println("������ ���������� ���� �� ��� ���� ������ �����մϴ�");
			return getRandomTestCar();
		}

		// carNum�� 12��123 �̹Ƿ� ������ ���ڸ��� ���� > ���Գ��� ������ Ű������ �̱� ������ 16,27,38,49,50 �� �ϳ��̰�
		// �̰� charAt���� �̾Ƴ��� 0��°�� 12345, 1��°�� 67890�̴� �� ������ ���ѵǴ� ���ڸ� �̴� ���� 
		// �ش� ���Ͽ� �ش��ϴ� ���� 2���� �����⶧���� ������ �����̵ȴ�
		return new Car(  											// �Ϲ� ���� 5���� �������� �����Ͽ� �������� �׽�Ʈ ���� �� �ְ�
				carNum + (limitNum.charAt((int)(Math.random()*2))), types[(int)(Math.random()*types.length)]); 
	}					// ���Գ��� ȭ���ϱ��� 26�̰� ���� ��ȣ�� 2�� 6�� ���´�
	
	public static Car getRandomTestCar() {
		String carNum = "12��123";
		
		return new Car( // �̰� 0~9���� ������ ������ ȭ���������� �ƴ� ���ڰ� ���� �� �ִ�
				carNum + (int)(Math.random() *10), types[(int)(Math.random()*types.length)]);
	}
}
