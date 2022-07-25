
public class A04_VarTypes {

	/*
	 # 정수 타입
	  - byte  (1 byte, 8 bit)
	   0000 0000 : 2^8개의 값을 저장(하나의 정수가 256가지의 형태를 가질 수 있는 가능성이 있음)
       
       0000 0001 : 1
	   ...
	   0111 1111 : 127
	   1000 0000 : -128
	   1000 0001 : -127
	   ...
	   1111 1111 : -1
	   
	   byte 타입은 -128 ~ 127 까지의 정수를 표현할 수 있다
	   
	  - short (2 byte, 16bit)
	  0000 0000 0000 0000
	  0111 1111 1111 1111 : 32767
	  1000 0000 0000 0000 : -23768
	  ...
	  1111 1111 1111 1111 : -1
	  
	  short 타입은 -32768 ~ 32767 까지의 정수를 표현할 수 있다
	  
	  - char  (2 byte, 16bit, 부호비트 없음)
	    0000 0000 0000 0000
	    ...
	    0111 1111 1111 1111 : 32767
	    1000 0000 0000 0000 : 32768(부호비트가 없으므로 음수가 되지 않는다)
	    ...
	    1111 1111 1111 1111 : 65535
	    
	    char 타입은 0 ~ 65535 까지의 양의 정수를 표현할 수 있다
	    문자 코드를 저장할 때 사용하는 타입이다
	  
	  - int   (4 byte)
	    int 타입은 약 43억개의 정수를 표현할 수 있다
	 
	  - long  (8 byte)
	    long 타입은 굉장히 많은 정수 표현 가능
	 
	 # 실수 타입
	  - float (4 byte)
	  - double(8 byte)
	 
	 # 참/거짓 타입
	  - boolean
	 
	 # 참조형 타입(클래스)
	  - String
	  - 그 외 대문자로 시작하는 모든 타입
	  
	 */
	
	
	public static void main(String[] args) {
		
		byte b1, b2, b3;
		b1 = 127;
		b2 = -128;
		// b3 = 300; 범위를 벗어난 수를 대입하면 에러
		
		short s1, s2, s3;
		s1 = 32767;
		s2 = -32768;
		// s3 = 60000; 마찬가지
		
		// char 타입에는 정수값을 저장하지만 출력할떄는 문자로 출력한다
		char c1, c2, c3;
		c1 = 65;
		// c2 = -1; 마찬가지
		c3 = 'a';
		System.out.println(c1);
		System.out.println(c3);
		
		//그냥 소수는 기본적으로 double 타입이기 때문에 F를 붙여야 float 타입 리터럴이 된다.
		//double은 8byte, float은 4byte이기 때문에 8byte 값을 4byte에 넣으려고 할 때 에러가 발생한다
		float f1 = 123.1234F;
		double d1 = 123.1234;
		
		// 그냥 정수는 기본적으로 int 타입 리터럴이기 때문에 뒤에 L을 붙여야 long 타입 리터럴이 된다.
		// int의 범위를 벗어나는 아주 크거나 아주 작은 리터럴을 사용하고 싶을때는 L을 붙어야한다
		int i1 = 1_000_000_000;
		long l1 = 10_000_000_000L;

		//boolean 타입에는 true, false만 저장 할 수 있다.
		boolean programer = true;
		boolean breakfast = false;
		
		String message = "환영합니다";
		System.out.println(message);
		
	}
	
	
	
	
	
}
