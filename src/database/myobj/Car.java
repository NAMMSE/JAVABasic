package database.myobj;

public class Car {//0517 화
	// 장애인 유아동승 경차 제외
	final public static CarType normal = new CarType(0, "일반"); // 각 차량별 값과 타입 지정해주는 클래스로 초기화
	final public static CarType disabled = new CarType(1, "장애인");
	final public static CarType babyRide = new CarType(2, "유아동승");
	final public static CarType lightCar = new CarType(3, "경차");
	
	private static String[] parkState = {"판별중", "주차가능", "진입금지"}; // 차량 상태 확인
	
	private String carNum; // 차량 번호
	private CarType  carType; // 차량 타입 클래스 인스턴스
	private int state;			// 차량 상태 
	
	public Car(String carNum, CarType carType) {
		this.carNum = carNum;
		this.carType = carType;
		
	}
	
	public CarType getCarType() { // 차량 타입 반환
		return carType;
	}
	
	public void setState(int state) { // 차량 상태 초기화
		this.state = state;
	}
	
	public String getLastNum() { // 차량 번호의 끝 번호 
		return carNum.substring(6); // 12금1234 형식일때 앞에 6자리 제외하면 마지막 번호만 남음
	}
	
	public String getCarNum() {
		return carNum;
	}
	
	public String getCarState() {
		return parkState[state];
	}
	
	@Override
	public String toString() { // 차량 번호 / 차량 타입 / 차량 상태
		return String.format("%s - %s [%s]",carNum, carType.getName(), parkState[state]);
	}
	
}
