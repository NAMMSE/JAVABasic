
public class B05_Operator3 {

	/*
	 # 대입 연산자
	 
	  = : 왼쪽 변수에 오른쪽 값 대입
	  
	 # 복합 대입 연산자
	 
	  - 해당 변수에 값을 누적시키는 연산
	  - +=, -=, *=, /=,...
	  
	 # 단항 연산자
	 
	  - 해당 변수에 값을 1씩 누적시키는 연산자
	  - ++, --의 위치에 따라서 결과가 달라진다
	  - 뒤에 붙으면 해당 명령을 실행 한 후에 값이 변하고 앞에 붙으면 명령 실행 전 값이 변한다
	  
	 */
	
	public static void main(String[] args) {
		
		int num = 100;
		
		num = num + 5;
		num += 5;
		num *= 2;
		num %= 10;
		
		System.out.println(num + "\n -------------");
		
		num = 10;
		num++; // num = num + 1 과 같다
		System.out.println(num);
		++num;
		System.out.println(num);
		
		num = 20;
		System.out.println(num++);
		System.out.println(++num);
		
	}
}
