import myobj.*; // * : myobj에 있는 모든 클래스 임포트 하는 것

public class C06_Polymorphism {

	/*
	  # 객체의 다형성
	  
	   - 객체는 다양한 형태를 지닐 수 있다.
	   - 경찰은 경찰이기도 하고 사람이기도 하다. (업캐스팅)
	   - 사람은 사람이지만 경찰이 아닐 수도 있다. (다운캐스팅)
	   
	  # 업 캐스팅
	  
	   - 자식 타입은 부모 타입의 모든 것을 보유하고 있다
	   - 자식 타입은 언제든지 별다른 문제 없이 부모타입이 될 수 있다.
	   - 
	  # 다운 캐스팅
	   - 부모 타입은 타입 캐스팅을 통해 자식 타입이 될 수 있다
	   - 하지만 원래 자식 타입이었다가 업캐스팅 된 경우가 아니라면 에러가 발생한다
	 */
	
	public static void main(String[] args) {
		
		// 업 캐스팅
		Person p;
		
		p = new Person();
		p = new Police(); // 자식 타입은 언제든지 별도의 타입캐스팅 없이 부모 타입이 될 수 있다
		
		// 다운 캐스팅

		//원래 Person이던 인스턴스를 다운 캐스팅하면 에러가 발생한다
		Person person;
		Police popo;
		
		person = new Person();
		//popo = (Police)Person; 에러 발생

		// 원래 Police였다가 Person이 된 인스턴스를 다운캐스팅하는 것은 가능하다
		person = new Police();
		popo = (Police) person;
		
		// 부모 타입은 타입 캐스팅을 통해 자식 타입이 될 수 있다
		// 하지만 원래 자식 타입이었다가 업캐스팅 된 경우가 아니라면 에러가 발생한다
	
		popo.name = "김체포";
		popo.sayhi();

		Person p10 = new Person();
		//업캐스팅이 된 자식 인스턴스는 자식 클래스에만 가지고있는 기능을 사용할 수 없다
		Person p11 = new Defender();
		// p11은 원래 bash()를 가지고 있지만 사용할 수 없는 상태
		// p11.bash(); < 에러 나는 이유 p11을 디펜더로 지정했지만 잠깐 디펜더의 나머지 기능들을 멈추고 person의 기능만 사용하기 때문에 에러가 남
		
		//업 캐스팅 된 상태에서는 부모 타입의 자원만 그대로 사용할 수 있다.
		p11.name = "김철방패";
		p11.age = 20;
		//p11.sayhi(p11); //여기까진 person의 기능들을 다 사용할 수 있다
		
		//*중요* 업 캐스팅 된 상태에서도 오버라이딩 된 메서드는 자식의 것으로 사용된다 
		p11.sayhi();
		
		
		// 자식클래스에만 보유한 것을 다시 사용하기 위해서는 다운 캐스팅이 필요하다
		((Defender)p11).bash();
		((Defender)p11).block();
		
		//업캐스팅이 되지 않은 상태에서는 원래의 기능을 사용할 수 있다
		Defender d1 = new Defender();
		d1.name = "김방패";
		d1.sayhi();
		d1.bash();
		d1.block();
		
	}
}


