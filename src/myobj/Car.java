package myobj;

public class Car extends Vehicle{

	public String car_color;
	
	@Override
	public void vehicleinfo() {
		System.out.println("이 이동수단의 이름은 "+name+"이고 정원은 "+maxperson+"명이고 차량 색상은 "+car_color+"입니다.");
	}
}
