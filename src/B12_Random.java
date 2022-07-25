import java.util.Random;

public class B12_Random {

	/*
	  # 무작위 숫자 생성하기
	  
	   1. Math.Random() 함수 사용하기
	    - 0 <= x < 1 의 double 타입 랜덤 실수를 생성하는 함수
	    - 이 랜덤 함수를 활용하여 원하는 범위의 숫자를 만들어 사용할 수 있다
	    
	    *원하는 범위의 정수를 만드는 절차 (ex : 30 ~ 39)
	    (1) 생성된 랜덤 실수에 원하는 숫자의 개수를 곱한다
	    	(ex : 30 ~ 39는 숫자가 10개이므로 10을 곱한다)
	    	0 * 10 <= x < 1 * 10 --> 0 <= x < 10
	    (2) 원하는 숫자 범위 중 가장 작은숫자를 더한다
	    	(범위가 30 ~ 39 이므로 30을 양쪽에 더한다)
	    	0+30 <= x < 10+30 --> 30<=x<40
	    (3) 소수점 아래를 삭제한다
	    	(ex : 39.99999도 소수점 아래를 삭제하면 39가 된다)
	    
	   2. java.util.Random 클래스 사용하기
	 */
	public static void main(String [] args) {
		
		//새로운 랜덤 시드 생성
		
		Random ran = new Random(); // import 해줘야됨
		
		System.out.println(ran.nextInt());
		
		// 연습문제 : 1~45의 랜덤 정수를 10개 출력
		
		for(int i =0 ; i<10 ; i++) {
			System.out.println((int)(Math.random()*45 + 1));
		}
	}
}
