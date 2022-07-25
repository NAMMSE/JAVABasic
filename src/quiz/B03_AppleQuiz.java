package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	 사과를 10개씩 담을 수 있는 바구니가 있다
	 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한 바구니 개수를 알려주는 프로그램을 만드시오
	 */
	
	public static void main(String[] args) {
		
		//final int BASKET_SIZE ; 이거 뭔지 확인 상수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수를 입력하세요: ");
		int apple = sc.nextInt();
		
		if(apple % 10 ==0 && apple>0) {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다. \n", apple/10);
		}
		else if(apple > 10 ) {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다. \n", apple/10+1);
		}
		else if(apple>0){
			System.out.println("필요한 바구니의 개수는 1개 입니다.");	
		}
		else {
			System.out.println("필요한 바구니의 개수는 0개입니다");
		}
		
		/*
		 
		 
		 if(apple < 0 ) {
			System.out.println("사과의 개수가 이상합니다. \n");
		}
		 else if(apple % 10 ==0 ) {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다. \n", apple/10);
		}
		else  {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다. \n", apple/10+1);
		}
		--------------------------------------------------------------
		int basket
		if(apple < 0 ) {
			System.out.println("사과의 개수가 이상합니다. \n");
		}
		 
		else  {
		
		   	if(apple % 10 == 0){
		   		basket = apple /10;
		   		}
		   	else{
		   	
		   		basket = apple / 10 + 1;
		   	}
		   	
			System.out.printf("필요한 바구니의 개수는 %d개 입니다. \n", basket);
		}
		 */
		
	}
}
