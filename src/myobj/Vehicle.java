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
		System.out.println("해당 이동수단의 이름은 "+name +"이고 정원은 "+maxperson+ "명 입니다.");
	}
	
	public void speedcomp(Vehicle V) {
		if(V.speed>300) {
			System.out.println("해당 이동수단의 속도는 빠른편이고 속력은 "+V.speed+"km/h입니다.");
		}
		else if(V.speed>150) {
			System.out.println("해당 이동수단의 속도는 적당한편이고 속력은 "+V.speed+"km/h입니다.");
		}
		else  {
			System.out.println("해당 이동수단의 속도는 느린편이고 속력은 "+V.speed+"km/h입니다.");
		}
	}
}
