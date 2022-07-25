package quiz;

import java.util.Scanner;

public class B01_DollarExchange {

	/*
	 달러를 입력 받으면 한국돈으로 얼마인지 알려주는 프로그램
	 
	 */

	public static void main(String[] args) {
		double dollar, won;
		System.out.print("달러 입력하세요 >");
		dollar = new Scanner(System.in).nextDouble();
		won = dollar * 1224.28;
		System.out.printf("%.0f달러는 %.1f원입니다.\n", dollar, won );
	}


}

