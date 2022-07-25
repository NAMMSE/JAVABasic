import java.util.ArrayList;

public class D05_Generic {

	/*
	  # Generic
	  
	   - 클래스 내부 자원의 타입을 외부에서 나중에 지정할 수 있게 하는 문법
	   - 제네릭에는 기본 타입을 사용할 수 없기 때문에 Wrapper 클래스를 사용해야 한다
	  
	  # static Generic
	  
	   - 스태틱 메서드에 제네릭을 사용할 때는 리턴 타입 앞에 제네릭을 추가해준다
	   - 사용할 때는 클래스명.<T>메서드명() 으로 사용할 수 있다
	 */
	
	public static void main(String[] args) {
		GenericTest<String, Integer, Double> test = new GenericTest<>();
		
		//static 제네릭 메서드 사용하기
		GenericTest.<Apple>staticMethod1();
		
	}
	
	
}
class GenericTest<A, B, C>{
	A var1;
	A var2;
	B var3;
	C var4;
	
	public A method1() {
		return null;
	}
	
	static<MyType> int staticMethod1() {
		ArrayList<MyType> list = new ArrayList<>();
		
		MyType a = list.get(0);

		// 제네릭 A, B, C는 인스턴스 생성시 정해지기 때문에 static 메서드에서는 사용할 수 없다
		//A v1 = null;
		
		return 0;
	}
}
