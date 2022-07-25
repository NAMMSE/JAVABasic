

public class B01_Operator1 {

	/*
	 # 연산자
	  - 계산할 때 사용하는 것
	  - +, -, *, /, >, <, ...
	  
	 # 산술 연산자
	 +, -, *, /
	 % : 나머지
	 
	 
	 
	 
	 
	 #
	  
	  
	 */
	public static void main(String[] args) {
		
		int a, b;
		a= 33;
		b= 8;
		double c = 33, d = 8;
		
		System.out.println("a + b : " +(a+b));
		System.out.println("a - b : " +(a-b));
		System.out.println("a * b : " +(a*b));
		//정수와 정수를나누면 몫만 구한다
		System.out.println("a / b : " +(a/b));
		//정수와 실수를 나누면 정확한 값을 구한다
		System.out.println("c / d : " +(c/d));
		System.out.println("a / d : " +(a/d));
		
		//나머지
		System.out.println("a % b : " +(a%b));
		
		// n으로 나눈 나머지는 0부터 n-1까지 밖에 나올 수 없다
		System.out.println("18 % 10 : " +(18%10));
		System.out.println("19 % 10 : " +(19%10));
		System.out.println("20 % 10 : " +(20%10));
		System.out.println("21 % 10 : " +(21%10));

		
		//Math.pow(a, b) : a 제곱 b를 구한다
		System.out.println(Math.pow(2,10)); 
		System.out.println(2^10);// xor 연산
		
		//Math.sqrt(a) : a의 제곱근을 구해서 반환한다 (double 타입)
		System.out.println(Math.sqrt(2));
		
		//Math.abs(a) : a의 절대값을 구한다
		System.out.println(Math.abs(-2));
		
		//Math.round(a) : a를 소수 첫째 자리에서 반올림한 값을 반환한다
		double result = Math.round(123.456);
		System.out.println(result);
		
		//Math.round(a)로 원하는 자리에서 반올림 하기
		double value = 123.7777777;
		
		// 반올림하고 싶은 자리를 소수 첫번째 자리로 만든 후 다시 소수점을 포함하여 나눈다
		System.out.println(Math.round(value * 10000) / 10000.0);
		
		
		
	}
	
}
