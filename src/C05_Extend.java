import myobj.Person;
import myobj.Police;
import myobj.Programmer;

public class C05_Extend {

	/*
	  # 클래스 상속
	  
	   - 이미 만들어져 있는 클래스를 물려받아서 사용하는 문법
	   - 자식 클래스는 부모 클래스의 모든 자원을 그대로 사용할 수 있다
	   - 자식 클래스에는 부모 클래스에 없던 기능을 새로 추가해서 사용할 수 있다
	   - 자식 클래스는 부모에게서 물려받은 메서드를 그대로 마음대로 고쳐서 사용할 수 있다(오버라이드)
	   - 자식 클래스는 반드시 가장 먼저 부모의 생성자를 호출해야 한다
	   
	  # super
	  
	   - 자식 클래스로 생성된 인스턴스는 내부에 두 가지로 분류된다
	   - this는 현재 인스턴스 중 자식 클래스의 부분을 뜻한다
	   - super는 현재 인스턴스 중 부모 클래스의 부분을 뜻한다
	   - this()가 현재 클래스의 생성자를 의미하듯이 super()는 부모 클래스의 생성자를 의미한다
	 */
	
	public static void main(String[] args) {
		Person dooly = new Person();
		dooly.age=7;
		dooly.name = "둘리";
		
		Person chulsu = new Person();
		chulsu.name = "철수";
		chulsu.age = 23;
		
		Police popo = new Police();
		popo.setName("김포포");
		popo.setAge(18);
		
		Programmer coder = new Programmer();
		coder.name = "김코더";
		coder.age = 23;
		
		// Person을 요구하는 자리에 자식 클래스인 police와 programmer등이 들어갈 수 있다(객체의 다형성)
//		dooly.sayhi(coder);
//		dooly.sayhi(popo);
//		dooly.sayhi(chulsu);
//		chulsu.sayhi(dooly);
		
		
		
		
		Programmer p2 = new Programmer();
		
		p2.age = 10;
		p2.name = "고길동";
		p2.salary = 700;
		
		p2.sayhi();
		p2.program("온라인 교육 사이트");
		
		Police p3 = new Police();
		
		//Person의 name, age와 Police의 name, age를 모두 갖고있다
		p3.name = "김형사";
		p3.age = 20;
		p3.setName("고형사");
		p3.setAge(26);
		p3.sayhi();
		
	}
	
}




