
public class B06_For {

	/*
	 # 반복문
	  - for, while, for-each, do-while(x)
	  - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
	  
	 # for문
	 
	  - for(초기값 ; 반복조건 ; 증가폭){
	      가운데에 반복 조건이 참인 동안 반복될 코드들
	  	  }
	  	  
	   
	  
	 */
	
	public static void main(String [] args) {
		
		System.out.println("s");
		
		for(int i = 0; i <10 ; ++i) {
			System.out.println("s");
			
		/*
		 1. 가장 기본적인 형태의 for문
		  - 초기값에 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다
		  - 1씩 증가한다
		  - 원하는 횟수만큼 반복하기 가장 좋은 for문	
		 */
		for(int i1=0 ; i1<50 ; ++i1) {
			System.out.println("원하는 횟수만큼 반복" + i1);
		}
			
		/*
		 2. 초기값과 중간값과 조건을 자유롭게 설정한 for문
		  - 초기값, 중간값, 조건은 자유롭게 변경하며 용도에 맞게 사용할 수 있다.
		  - 초기값, 증가값, 조건은 꼭 넣지 않아도 된다
		 */
		for(i=1000 ;  ; i-=5)
		{
			System.out.println("hi" + i);
		}
			
		
		}
	}
}
