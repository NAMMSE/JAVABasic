
public class C14_Interface {

	/*
	  # 인터페이스 (interface)
	  
	   - 자바의 클래스는 상속을 한 번에 여러개 받을 수 없다
	   - 해당 클래스에 여러가지 형태를 부여하기 위해서는 인터페이스를 사용해야 한다
	   - 인터페이스 내부에 선언하는 모든 메서드는 자동으로 abstract public이 된다
	   - 인터페이스 내부에 선언하는 변수는 자동으로 final static이 된다
	   - 인터페이스는 인스턴스화 할 수 없다
	   - 인터페이스 내부의 메서드 앞에 default를 붙이면 오버라이드 하지 않았을 때의 기본 동작을 정의할 수 있다
	 */
	
	public static void main(String[] args) {

		Human h1 = new Human();
		Runner r1 = h1;
		Swimmer s1 = h1;
		
		h1.run();
		h1.swim();
		
		r1.run();
		s1.swim();
	}
}

interface Runner{
	int a=10; // 변수 선언과 동시에 초기화를 반드시 해줘야 함
	default void run() {
		System.out.println("run 미구현");
		
	}
}

interface Swimmer{
	// default로 메서드를 구현하지 않는 경우 반드시 구현해야하는 abstract 메서드가 된다
	void swim();
}

class Human implements Swimmer, Runner{

	@Override
	public void swim() {
	
	}
	// 휴먼에서 러너의 run 메서드를 오버라이드 하지 않았으므로 h1.run 실행시 러너의 run 메서드를 실행한다
	
}

class Bear implements Swimmer{
	
	public void swim(){
		
	}
}

class Shark implements Swimmer{
	public void swim(){
		
	}
}














































