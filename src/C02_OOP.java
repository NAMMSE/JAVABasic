
public class C02_OOP {

	/*
	  # 객체지향프로그램(Object Oriented Programming)
	  
	   - 세상에 존재하는 모든 것(객체)들을 변수와 함수로 표현하려는 프로그래밍 방법론
	   - 변수와 함수를 무분별하게 사용하는 것보다 현실에 존재하는 객체 단위로 묶어서 표현하는 것이 개발자들의 효율을 높인다
	   - 해당 객체를 구성하는 변수를 멤버변수, 필드(Field), 속성(Attribute) 등으로 부른다
	   - 해당 객체의 필드를 변화시킬 수 있는 객체 내부의 함수들을 메서드라고 부른다
	   
	   ex : 사과
	   
	    - 사과의 변수 : 크기, 색깔, 당도, 칼로리, 등급, 원산지 ...
	    - 사과의 메서드 (변수를 변화시키는 것들)
	      사과를 먹는다 : 크기 ↓ 칼로리 ↓ 먹은 사람의 칼로리 ↑
	      사과를 던진다 : 사과의 크기와 경도에 알맞는 데미지를 가한다
	      냉장고에 보관한다 : 사과의 유통기한이 천천히 감소한다
	      
	  # 클래스(class)
	  
	   - 현실의 객체를 프로그래밍 언어로 표현한 문법
	   - 클래스는 해당 객체의 설계도 역할을 한다 
	   - 클래스는 정의한 시점에서는 실체가 없다
	   - 클래스를 이용해 찍어내는 실제 객체를 '인스턴스(instance)'라고 부른다
	   - 클래스를 이용해 인스턴스를 생성할 때는 new를 사용한다
	   - 모든 클래스는 참조형 변수 타입이다
	   - 같은 패키지 내부에는 동일한 이름의 클래스를 정의할 수 없다
	  
	 */
	public static void main(String[] args) {
		
		// 사과 클래스로 사과 인스턴스 생성
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		// .을 찍어서 해당 인스턴스의 필드값을 사용할 수 있다.
//		a1.size = 20;
//		a1.sweet = 8;
//		a1.color = "red";
//		a1.calrorie = 200.0;
//		
//		a1.eat();
//		
//		System.out.println("a1의 size : "+a1.size );
//		System.out.println("a1의 당도 : " + a1.sweet);
//		System.out.println("a1의 칼로리 : "+a1.calrorie);
//		System.out.println("a2의 칼로리 : "+a2.calrorie);
//		
//		a1.info();
//		a2.info();
//		
//		a2.setColor("Black");
		
//		Me i = new Me();
//		
//		i.age = 27;
//		i.weight = 68;
//		i.height = 175;
//		i.name = "박성훈";
//		i.sex = '남';
//	
//		i.info();
//		i.diet();
//		i.info();
//		
		//------------------------------------------------------
		
//		Subway sub1 = new Subway();
//		Subway sub2 = new Subway();
//		
//		sub1.line = 1;
//		sub1.current_station=3;
//			
//		sub2.line = 7;
//		sub2.current_station=0;
//	
//		sub1.info();
//		sub2.info();
//		
//		for(int i =0; i<10 ; i++) {
//			sub1.next();
//			sub1.info();		
//		}
		
		Me i2 = new Me(27,76,176,"박성훈",'남');
		Me i3 = new Me();
		
		i2.print();
		i3.print();
		
	}	
	
}


class Apple{
	/*
	  # 인스턴스 변수
	   
	   - 클래스 내부에 선언한 변수
	   - 각 인스턴스마다 다른 값을 가질 수 있는 변수
	   - aka. 필드, 속성, 멤버, 상태, ...
	 */
	int size;
	int sweet;
	double calrorie;
	String color;
	
	/*
	  # 인스턴스 메서드
	  
	   - 클래스 내부에 선언한 함수
	   - 주로 해당 인스턴스 변수를 변화시키는 역할을 한다
	   
	  # this
	  
	   - 현재 인스턴스 자기 자신을 가리키는 문법
	   - 생략이 가능하다
	 */
	
	void eat() {
		size--;
		calrorie-=-5;
	}
	
	//필드명과 메서드의 매개변수명이 동일한 이름을 가질 때 this를 사용해 반드시 구분해줘야 한다
	void setColor(String color) {
		this.color = color;
	}
	
	void info() {
		System.out.println(" - - - 이 사과의 정보 - - -");
		System.out.println("크기\t: "+size);
		System.out.println("당도\t: "+sweet);
		System.out.println("칼로리\t: "+calrorie);
		System.out.println("색깔\t: "+color);
		
	}
	
}


/*
  연습 문제 : 현실에 존재하는 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 정보를 출력해보세요
 */

class Me{
	
	int age;
	int weight;
	int height;
	String name;
	char sex;
	
	Me(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	Me(int age, int weight, int height, String name, char sex){
		this.age=age;
		this.name=name;

		this.height=height;
		this.weight=weight;
		this.sex=sex;

	}
	
//	Me(){
//		age=27;
//		weight=68;
//		height=175;
//		name="박성훈";
//		sex='남';
//	}
	
	Me(){
		this(30,79,178,"성훈박",'여');
	}
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+height);
		System.out.println("성별 : "+sex);
	}
	
	void diet() {
		weight--;
	}
	
	
	void info() {
		System.out.println("- - - 나의 정보 - - -");
		System.out.println("나의 나이: " + age);
		System.out.println("나의 몸무게: " + weight);
		System.out.println("나의 키: " + height);
		System.out.println("나의 이름: " + name);
		System.out.println("나의 성별: " + sex);
	}
	
	
}

class Subway{
	String[] subway_color = {"남색","녹색","주황색","하늘색","보라색","갈색","짙은녹색"};
	
	String[][] subway_map = {
			{"인천","동인천","도원","제물포","도화","주안","간석","동암","백운"},
			{"까치산","신정네거리","양천구청","도림천","문래","신도림"},
			{},
			{},
			{},
			{},
			{"보라매","신대방삼거리","장승배기","상도","숭실대입구","남성"}
	};
	
	
	int line;
	int current_station;
	boolean direction = true;
	
	void next(){
		
		//증가하는 방향일 때 맨 오른쪽 역이거나
		// 감소하는 방향일 때 맨 왼쪽 역이라면 방향을 바꾼다.
		if(direction && current_station + 1 == subway_map[line-1].length|| (!direction && current_station == 0)) {
			direction = !direction;
		}
		
		
		if(direction) {
			current_station++;
		}
		else {
			current_station--;
		}
		
	}
	
	
	void info() {
		System.out.println("[차량 정보]");
		System.out.println("line : "+line +"호선");
		System.out.println("색상 : " + subway_color[line-1]);
		System.out.println("현재 정차역 : "+subway_map[line-1][current_station]);
	}
	
}
























