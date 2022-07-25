package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_InputRightThing {

	/* 0518 수요일
	  사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때까지 계속 입력받는 프로그램을 만들어보세요
	  (다른 타입 값이 입력되더라도 강제종료되지 않아야합니다)
	 */
	
	public static int inputint() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("숫자만 입력하세요 >>");
				return sc.nextInt();
			}catch (InputMismatchException e) {
				sc.nextLine(); // 스캐너에 남아있던 잘못입력된 단어를 버려줘야 한다
			}
		}
	}
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		while(true) {
//			
//			try {
//				System.out.print("숫자만 입력하세요 >>");
//				num = sc.nextInt();
//				
//			}catch (Exception e) {
//				System.out.println("숫자가 아닙니다. 다시 입력하세요");
//				//e.printStackTrace();
//				sc = new Scanner(System.in);
//				num = sc.nextInt();
//			}finally {
//				System.out.println("===============");
//			}
//			
//		}
		
		int a= inputint();
		int b= inputint();
		
	}
}
