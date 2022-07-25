package myobj.parking;

public class CarType { // 0517 화

	private int value; // 0 1 2 3 
	private String name; // 일반 장애인 유아동승 경차
	
	
	public CarType(int value, String name) { 
		this.value = value;
		this.name = name;
	
	}
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	
}

