
public class C10_InnerClass {
	/*
	  # 클래스 내부에 클래스 사용하기
	  
	   - 클래스 내부에도 클래스를 정의 하고 사용할 수 있다.
	   - 클래스 내부에 존재하는 클래스는 바깥쪽 클래스의 인스턴스가 존재해야 사용할 수 있다
	 */
	
	// 기본형 변수타입의 초기값은 0, 0.0, false
	private static int a=1,b=2,c;
	// 참조형 변수타입의 초기값은 null이다
	private String s1, s2, s3; // 클래스 내부에 있는 메인에서 불러오기 때문에 private 붙여도 메인에서 호출 가능
	private Apple a1, a2, a3; // C02_OOP에 있는 Apple 

	public C10_InnerClass() {
		System.out.println("생성자생성자");
	}
	
	// static int a;
	
	
	private static int d = 1, e = 3, f;
	// 클래스 내부의 스태틱 클래스
	static class Orange{ // 스태틱은 인스턴스 생성 전에도 사용 가능하기 때문에 바깥 클래스에 . 을 찍고 사용해야함
		
		int price;
		int sweet;
		
		public Orange() {
		
			price = d; // 같은 스태틱 변수는 되고
			sweet = e; // a, b는 안됨 
		}
		
		
		
		@Override
		public String toString() {
			return ("가격 : "+price+", 당도 : "+sweet);
		}
	}
	
	
	
	class Sagwa {
		int price;
		int sweet;
		
		// 클래스 내부의 클래스에서는 바깥 클래스의 자원들을 사용할 수 있다(
		// 같은 클래스 내부이기 때문에 private 자원도 가능
		public Sagwa() {
			price = a;
			sweet = b;
			System.out.println("123123123");
		}
		
		@Override
		public String toString() {
			return ("가격 : "+price+", 당도 : "+sweet);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		new C10_InnerClass();
		
		C10_InnerClass instance = new C10_InnerClass();
		
		instance.a=100;
		instance.b=100;
		
		instance.new Sagwa();
		System.out.println(instance.s1);
		System.out.println(instance.s2);
		
		System.out.println(instance.a1);
		System.out.println(instance.a2);
		
		// 클래스 내부의 클래스로 인스턴스 생성하기
		C10_InnerClass.Sagwa apple = instance.new Sagwa();
		System.out.println(apple);
		
		instance.a=300;
		instance.b=400;
		// 클래스 바깥의 인스턴스의 영향을 계속 받음
		C10_InnerClass.Sagwa apple2 = instance.new Sagwa();
		System.out.println(apple2);
		
		C10_InnerClass.Orange orange = new C10_InnerClass.Orange();
		System.out.println(orange);
		
		
		C10_InnerClass.d = 100;
		C10_InnerClass.e = 200;
		C10_InnerClass.Orange orange2 = new C10_InnerClass.Orange();
		System.out.println(orange); // 최초 클래스를 만들고 생성자를 선언할 당시에 값이 들어가고 그 이후에는 영향을 받지않음
		System.out.println(orange2);
		
	}
}
