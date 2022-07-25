
public class C03_Constructor {

	/*
	  # 클래스의 생성자(constructor)
	  
	   - 클래스의 이름과 똑같은 이름을 가진 메서드
	   - 리턴 타입을 지정하지 않는다
	   - 새로운 인스턴스를 생성할 때 new와 함께 생성자를 호출한다
	   - 내부에 생성자를 정의하지 않은 클래스는 보이지 않는 기본 생성자가 존재한다
	     (기본 생성자는 아무것도 하지 않고 인스턴스만 생성한다)
	   - 생성자는 인스턴스 생성 시 가장 먼저 호출되는 메서드이기 때문에 주로 인스턴스 초기화에 많이 사용된다.  
	   - 여러가지 생성자 중에 어느 생성자로 초기화 할지는 매개변수의 타입과 개수로 구분한다.
	   - 생성자 바로 만드는 단축키 : 공백에 아무것도 입력하지 말고 ctrl+space 누르고 constructor 엔터
	 */
	
	public static void main(String[] args) {
		Orange o = new Orange(); // new ~ 이게 클래스 이름이 아니라 클래스 내부의 생성자로 생성하는것 지금은 오렌지 클래스의 기본 생성자로 만든것
		
		o.print();
		
		Orange o2 = new Orange(9999); // 
		o2.print();
		
		Orange o3 = new Orange(7000,777.777);
		o3.print();
		
		//기본 생성자의 사용을 막아놓은 클래스
		Mango m = new Mango(333,123);
	}
}

class Orange{
	
	double sweet;
	int price;
	
	void print() {
		System.out.println("price : "+price);
		System.out.println("sweet : "+sweet);
	}
	
	//기본 생성자(매개변수가 없는 생성자)
	Orange(){
		// 생성자의 첫 번째 줄에서는 this()로 다른 생성자를 호출하는 것이 가능하다.
		this(800);
	}
	//매개변수가 있는 생성자
	Orange(int price){
		this.price = price;
		sweet =8.0;
	}
	
	
	
	Orange(int price, double sweet){
		this.price = price;
		this.sweet = sweet;
	}
	
}

//매개변수가 있는 생성자만 정의한 클래스
class Mango{
	int price;
	int sweet;
	
	// 내부에 생성자가 있기 떄문에 기본 생성자가 자동으로 정의되지 않는다
	Mango(int price, int sweet){
		this.price = price;
		this.sweet = sweet;
	}
	
	
}
