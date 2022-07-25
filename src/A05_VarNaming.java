
public class A05_VarNaming {

	/*
	 # 변수를 사용하는 이유
	  1. 값을 한번에 변경할 수 있다. (여러번 사용할 값을 미리 저장해두고 재사용 할 수 있다)
	  2. 가독성을 높일 수 있다.
	 
	 # 변수의 작명 규칙(권장 사항)
	  1. 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 활용한다
	  2. 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용한다(appleWeight, applePrice)
	  3. 변수명의 첫 글자는 소문자를 사용한다
	  4. 특정 유명한 값이나 프로그램 내에서 변하지 않을 값들은 모두 대문자를 사용한다
	  5. 클래스명의 첫 글자는 대문자를 사용한다
	  6. 패키지명은 모두 소문자를 사용한다
	  7. 해당 변수의 목적을 쉽게 파악할 수 있는 단어를 변수명으로 사용한다.
	  
	 # 변수의 작명 규칙(필수 사항)
	  1. 변수의 첫글자에 숫자는 사용할 수 없다
	  2. 변수명 사이에는 공백을 사용할 수 없다
	  3. 특수문자는 _와 $만 사용할 수 있다
	  4. 이미 자바에서 사용하고 있는 키워드(예약어)들은 변수명으로 사용할 수 없다
	 
	 
	 */
	
	public static void main(String[] args) {
		
		int apple = 15;
		double apple_weight = 123.33;
		int apple_price = 567;
		
		System.out.println("사과 총무게 :"+ apple * apple_weight);
		System.out.println("사과 총가격 :"+ apple * apple_price);
		System.out.println("사과 총가격 :"+ apple * apple_price);
	}
	
}
