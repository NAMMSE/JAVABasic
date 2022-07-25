import java.util.Scanner;

public class B03_If {

	/*
	 # if문
	  - ()안의 값이 true면 {}안의 내용을 실행하는 문법
	  - ()안의 값이 false면 {}안의 내용을 무시한다
	 
	 # else if 문
	  - 위의 if문이 실행되지 않았다면 if문처럼 동작한다
	  - else if는 여러 번 사용할 수 있다 
	  - else if는 if 없이 단독으로 사용할 수 없다
	  
	 # else 문
	  - 위의 조건이 모두 아니라면 {}안의 내용을 무조건 실행한다 ( 그래서 조건이 필요없음)
	  - if문 바로 다음에 사용할 수도 있다
	  - 단독으로 사용할 수 없다
	  - else가 붙어있는 if절은 최소한 한번은 실행된다
	  
	 */
	
	public static void main(String[] args) {
		
		if (true) {
			
			System.out.println("if문이 true 일때 실행되는 명령어1");
			System.out.println("if문이 true 일때 실행되는 명령어3");
			System.out.println("if문이 true 일때 실행되는 명령어2");
		}
	
		int a =7;

		
		if (a%2 == 0) {
			
			System.out.println("a가 짝수일 때 실행되는 명령어1");
		}
		else if ( a%3 == 0) {
			System.out.println("a가 짝수가 아니면서 3의 배수");
		}
		else if ( a%5 == 0) {
			System.out.println("a가 짝수가 아니면서 3의 배수도 아니면서 5의 배수");
		} 
		else{
			System.out.println("위의 조건이 모두 아닙니다");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하실 사과의 개수: ");
		int apple = sc.nextInt();
		String size;
		
		if(apple > 10) {
		
			size = "대용량 종이백";
		}
		else if(apple > 5) {
			
			size = "중형 종이백";
		}
		else {
			size = "소형 종이백";
		}
	
		// 초기화를 안하고 if문에서만했을때 조건이 성립되지 않을 확률이 있다면 에러 발생 else 사용 시 에러 해결
		System.out.println(size);
		
		
		
	}
	
}
