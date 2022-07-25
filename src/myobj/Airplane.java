package myobj;

public class Airplane extends Vehicle{

	public String destination;
	
	@Override
	public void vehicleinfo() {
		System.out.println("이 이동수단의 이름은 "+name+"이고 정원은 "+maxperson+"명이고 목적지는 "+destination+"입니다.");
	}
}
