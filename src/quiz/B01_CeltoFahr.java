package quiz;

import java.util.Scanner;

public class B01_CeltoFahr {

	/*
	 사용자로부터 섭씨 온도를 입력받으면 화씨로 몇도 인지 알려주는 프로그램을 만들어 보세요

	 *
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환하고 싶은 섭씨 온도를 입력하세요: ");
		double temp = sc.nextDouble(); // new Scanner(System in).nextDouble(); 도 가능한데 한번 밖에 못씀
			
		System.out.printf("해당 온도의 화씨 온도는 %.1f 도 입니다. \n", ((temp*9/5)+32));
	}
}
