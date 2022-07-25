package myobj;

public class Programmer extends Person{

	public int salary; // 외부에서 가져다 쓰기 떄문에 public 붙어야함
	
	//@Override // 어노테이션을 붙여놓으면 오버라이드가 성립하지 않을 때 에러를 발생시켜준다
	public void sayhi() {
		System.out.println("안녕하세요 저는 " + salary + "원 받고 일하는" + name + "입니다!");
	}
	
	public void program(String toProgram) {
		if(salary<500) {
			System.out.println(name + "씨는 \"" + toProgram + "\"을 대충 만들기로 했습니다");
		}
		else {
			System.out.println(name + "씨는 \"" + toProgram + "\"을 열심히 만들기로 했습니다");
		}
	}
	
}
