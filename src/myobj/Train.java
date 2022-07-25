package myobj;

public class Train extends Vehicle{

	public int price;
	
	public void vehicleinfo() {
		System.out.println("이 이동수단의 이름은 "+name+"이고 정원은 "+maxperson+"명이고 표 값은 "+price+"원 입니다.");
	}
}
