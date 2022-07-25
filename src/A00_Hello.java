/*
// 언어별로 주석 사용 방법 다를 수 있다.
/*여러줄
 * 주석은
 * 별표 슬래시
 */

/*
 이클립스 단축키
  - ctrl + [+,-] : 글자 크기 조절
  - ctrl + M : 현재 창 최대/최소화
  - ctrl + F11 : 코드 저장, 컴파일, 실행
  - F2 : 에러 떴을때 누르면 해결 방법 제시
  - ctrl + shift + f : 띄어쓰기 자동
  
  윈도우 단축키
  - win + E : 탐색기
  - win + shift + s : 스크린샷
  - ctrl + a : 코드 전체 블록 지정 
  
  
 */



// public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
	
	/*
	 # main 함수
	 - java에서 어떤 단어뒤에 ()가 있으면 함수라고 한다
	 - 프로그램의 시작 지점
	 - 사용자가 프로그램을 실행하면 가장 먼저 main 함수를 찾아서 실행한다
	 - main 함수 종료 시 프로그램도 종료
	 */
	public static void main(String[] args) {                            // 프로그램 시작하면 가장 먼저 도착하는곳
		System.out.println("HELLO, WOLRD!");
		/*
		 # System.out.println() 함수
		 
		 - ()안에 전달한 데이터를 콘솔 화면에 출력하는 함수
		 
		 
		 # 콘솔
		 -제작한 소스코드(.java)의 컴파일 결과(.class)는 프로젝트 내부의 bin 폴더에 저장된다
		 */
		
		/* 
		  # 자바의 데이터 종류
		  - "" 사이에 적는 것 : 문자열(string), 문자를 여러개 적을 수 있는 타입
		  - '' 사이에 적는 것 : 문자(character), 하나의 문자를 의미하는 데이터 타입
		  - 그냥 숫자를 적는 것 : 정수(integer), 계산이 가능
		  - 소수를 적는 것 : 실수(float, double)
		  - true / false : 참 / 거짓(boolean)
		 */
		System.out.println('H');
		System.out.println(4*3);
		System.out.println(0.4 * 0.3);
		System.out.println(true);
		
		//문자열과 다른 타입을 +하면 이어 붙인다
		System.out.println("HELLO" + "world!");
		System.out.println("HELLO" + 123);
		
		// shift + tab : 거꾸로 들여쓰기
		// 블록 지정하고 ctrl + i : 들여쓰기 이상하게 된거 제대로 맞춰줌
	} // 프로그램의 마지막 부분

}

