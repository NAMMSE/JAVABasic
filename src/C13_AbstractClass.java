
public class C13_AbstractClass {

	/*
	  # 추상 클래스
	  
	   - 메서드의 형태만 선언해놓고 해당 메서드의 완성은 자식 클래스에게 미루는 클래스
	   - 자식 클래스는 추상 클래스를 상속받으면 반드시 추상 메서드를 오버라이드 해야한다.
	   
	  # 추상 메서드
	  
	   - 선언만 되어있고 몸통은 없는 메서드
	   - 앞에 abstract가 붙어 있는 메서드는 body를 직접 추가할 수 없다
	   - 반드시 상속받은 후 자식 클래스에서 오버라이드하여 구현해야 한다
	   - abstract 메서드를 구현하지 않은 클래스는 인스턴스를 생성할 수 없다
	 */
	
	public static void main(String[] args) {
		
		SwordMan unit1 = new SwordMan();
		Archer unit2 = new Archer();
		
	
		unitAttack(new SwordMan());
		unitAttack(new Archer());
		
		unitAttack(new Mage()); // Mage에서 attack을 안만들고 실행해도 부모클래스에 있는 메서드를 호출하기 때문에 에러가 발생하지 않음
		
	}
	
	// 그냥 Unit 형 매개변수로 받으면 자식클래스들이 업캐스팅 되어 들어오기때문에 부모클래스에 공격메서드가 없으면 아무것도 할 수 없다
	// 업캐스팅을 하고 오버라이딩을 하면 자식클래스에 있는 메서드를 사용한다
	public static void unitAttack(Unit unit) {
		unit.attack();
	}
}

abstract class Unit{
	int attack;
	int hp;
	
	//자식 클래스는 이 메서드를 반드시 구현해야 한다
	abstract void attack(); 
	
	
//	void attack() {
//		System.out.println("모든 유닛은 각자의 방식으로 공격을 해야합니다.");
//	}
}

class Mage extends Unit{
	public Mage() {
		attack = 30;
		hp = 20;
	}

	@Override// 만약 부모클래스의 abstract메서드를 구현하지 않으면 자식 클래스명에 에러가 뜨고 첫번째 오류해결을 누르면 자동으로 오버라이딩함
	void attack() {
		System.out.println("마법 데미지 : "+attack);
		
	}
}

class SwordMan extends Unit{
	public SwordMan() {
		attack = 10;
		hp = 50;
	}
	
	@Override
	void attack() {
		slash();
	}
	
	void slash() {
		System.out.println("칼을 휘둘렀습니다 . 데미지 : "+attack);
	}
	
}

class Archer extends Unit{
	double accuracy;
	public Archer() {
		attack = 8;
		hp = 30;
		accuracy = 0.88;
	}
	
	@Override
	void attack() {
		shot();
	}
	void shot() {
		if(Math.random() < accuracy) {
			System.out.println("화살을 명중했습니다 . 데미지 : "+attack);
		}
		else {
			System.out.println("화살이 빗나갔습니다...");
		}
	}
}
