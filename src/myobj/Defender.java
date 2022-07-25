package myobj;

public class Defender extends Person{

	
	public void block(){
		System.out.println(name + "씨는 방패로 화살을 막았습니다.");
	}
	public void bash(){
		System.out.println(name + "씨는 방패로 앞에있는 사람을 때렸습니다.");
	}
	
	@Override
	public void sayhi() {
		System.out.println(name + "씨는 방패를 퉁퉁 두드렸습니다");
	}
	
	
}
