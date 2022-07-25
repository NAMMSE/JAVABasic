package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	/*
	  1. char형 변수 a가 'q'또는 'Q'일 때 true
	  1. char형 변수 b가 공백이나 탭이 아닐 때 true
	  1. char형 변수 c가 '0' ~ '9' 일 때 true
	  1. char형 변수 d가 영문자(대문자 또느 소문자)일 때 true
	  1. char형 변수 e 한글일 때 true
	  1. char형 변수 f가 일본어일 때 true
	  7. 사용자가 입력한 문자열이 exit일 때 true 
	 
	 */
	
	
	public static void main(String[] args) {
		
		char a, b, c, d, e, f;
		
		a = 'q';
		System.out.print("1. ");
		System.out.println((a == 'q')||(a == 'Q'));
		
		b = ' ';
		System.out.print("2. ");
		System.out.println(!((b == ' ') || (a == '\t')));
		
		c = '5';
		System.out.print("3. ");
		System.out.println((c >= '0' && c<= '9'));
		
		
		d = 'g';
		System.out.print("4. ");
		System.out.println(((int)d>=65 && (int)d<=90) || ((int)d>=97 && (int)d<=122));
		//System.out.println((d>='a' && d<='z') || (d>='A' && d<='Z'));
		
		
		//한글 범위 : AC00 - D7AF(55203)
		e = '똵';
		System.out.print("5. ");
		//System.out.println((char)44032);
		//System.out.println((char)55203);
		System.out.println(e>=44032 && e <=55203); // e>= '가' && e<= '힣'
		System.out.println(e>=0xAC00 && e <=0xD7AF);
		
		
		// 일본어 범위 : 3040 - 309F
		f = 'g';
		System.out.print("6. ");
		System.out.println(f>=0x3040 && e <=0x309F);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력");
		String str = sc.next();
		System.out.print("7. ");
		System.out.println(str.equals("exit"));
	}
}
