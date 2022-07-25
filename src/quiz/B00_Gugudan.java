package quiz;

import java.util.Scanner;

public class B00_Gugudan {

	/*
	 사용자로부터 숫자를 입력받으면 구구단의 해당 숫자 단을 모두 출력하는 프로그램을 만들어보세요
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 >>");
		int input = sc.nextInt();
		// nextInt로 인자 입력 시 \n이 입력이 안되어 다른 변수 설정하여 입력시 해당 문자들이 입력이 안되고 남아있던 \n 공백출력됨
		 
		String trash = sc.nextLine();
		//위 현상 방지위해 쓰레기 변수 하나를 선언만 해주면 해당 변수에 \n값이 들어감
		
		System.out.print("이름 입력하세요 > ");
		String username = sc.nextLine();
		System.out.printf("이름 은 %s \n", username);
		
			
		System.out.printf("%d 단입니다.\n", input);
		
		System.out.printf("%d * 1 = %d \n"
				+ "%d * 2 = %d \n"
				+ "%d * 3 = %d \n"
				+ "%d * 4 = %d \n"
				+ "%d * 5 = %d \n"
				+ "%d * 6 = %d \n"
				+ "%d * 7 = %d \n"
				+ "%d * 8 = %d \n"
				+ "%d * 9 = %d \n",
				input, input * 1, 
				input, input * 2,
				input, input * 3,
				input, input * 4,
				input, input * 5,
				input, input * 6,
				input, input * 7,
				input, input * 8,
				input, input * 9);
		
	}
	
}
