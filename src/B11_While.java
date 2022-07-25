
public class B11_While {

	/*
	 # while문
	 
	  - for문과 사용법이 약간 다른 반복문
	  - 초기값과 증가값의 위치가 자유롭다
	  - ()안의 내용이 참인동안 {}안의 내용을 반복해서 실행한다
	 */
	public static void main (String[] args) {
	     
		int i=0;
		while(++i<10) {
			
			System.out.println("hello" + i);
			
		}
	}
}
