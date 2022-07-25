import myobj.Person;

public class C11_LocalInnerClass {

	/*
	  # 지역 내부 클래스
	  
	   - 메서드 내부에 정의한 클래스
	   - 해당 메서드가 끝나면 수명이 다하는 클래스
	   - 해당 메서드 바깥에서는 접근할 수 없다
	 */
	
	public static void main(String[] args) {
		
		int defaultPrice = 1000;
		char defaultGrade = 'B';
		
		// 지역 내부 클래스(메서드 내부의 클래스 - 지금은 메인 메서드 안에 만든 것)
		class Apple{
		
			int price;
			int grade;
			
			public Apple() {
				// 생성자 만들 때 매개변수가 없으면 this를 써도 되고 안써도 됨 
				// 매개변수로 값을 받고 해당 매개변수의 변수명과 클래스의 필드명이 같으면 구분하기 위해서 반드시 써야함
				price = defaultPrice; 
				grade = defaultGrade;
			}
			
			@Override
			public String toString() {
				//return super.toString();
				return "price: " + price + ", grade : " + grade;
			}
			
		}
		
		Apple a = new Apple();
		System.out.println(a);
		
		//------------------------------------------------------------------
		
		// myobj에 있는 person 클래스 import 해줘야됨

		// #익명 지역 내부 클래스 - 상속받았는데 자식 클래스의 이름이 없음
		//  -메서드 내부에서 클래스를 직접 수정(상속)하며 사용하는 방식 (생성과 동시에 상속) - 상속받으면 자식클래스는 부모클래스의 자원을 모두 가진상태이기 때문에
		//  -이름이 없기 때문에 새로운 메서드를 추가해도 사용할 수 없다
		//  - 기존의 메서드를 오버라이드해 사용하는 것은 가능하다
		Person p = new Person() {
			{
				name = "둘리";
				age = 9;
			}
			
			@Override
			public void sayhi() {
				System.out.println("익명 클래스의 sayHi입니다.");
				punch(); // 이때는 오버라이드한 메서드에서 호출한 것이기 때문에 사용가능하다
			}
			
			void punch() {
				System.out.println(name + "는 앞에 있는 사람을 때렸습니다.");
			}
			
		};
		
		// p.punch(); //이게 안되는 이유 49번째 줄에서 p를 자식이 아니라 부모클래스로 선언했기때문에 업캐스팅이 되고 그럼 자식클래스의 모든 메서드 사용 불가능
		p.sayhi();
		
	}
}
