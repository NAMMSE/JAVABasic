package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz {

	/*
	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 
	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 
	 3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
	 
	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수 > 못풀었음
	 
	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 
	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 
	 */
	
	public static boolean alphabet(char ch) {
		return((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')); // 굳이 if문 쓰지않고 어차피 true false만 반환하기 때문에 이런식으로 작성해도 됨
	}
	
	public static boolean threetime(int num) {
		return(num%3==0); // 이것도 마찬가지
	}
	
	public static String holjjak(int num) {
		return num % 2 ==0 ?"짝수입니다." : "홀수입니다.";
	}
//	
	
	public static int yaksucnt(int num) { // 약수의 개수를 세는 함수  // 못푼문제
		int cnt = 0;
		
		for(int i=2;i<num;i++) { // 1과 자기 자신을 제외한 개수 측정
			if(num%i==0) {
				cnt++;
			}
		}
		
		return cnt + 2; // 1과 자기 자신 더해서 반환
	}
	
	public static int[] yaksu(int num) {
		int[] yak = new int[yaksucnt(num)];
		
		int index =0 ;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				yak[index++] = i; // 처음에는 index가 0이고 i가 들어간 후 index 1증가 다음 num%i==0이 되는 순간에 index에 들어가서 차례대로 index에 약수들이 저장됨
			}
		}
		return yak;
		
	}
	
	public static boolean Prime(int num) {
		double sqrt = Math.sqrt(num);
		for(int i=2;i<sqrt;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int num) {
		
//		int fac = 1; 내 코드
//		while(num>0) {
//			fac*=num;
//			num--;
//		}
//		return fac;
		
		int f =num;
		
		System.out.printf("%d * ",num);
		for(int i =num-1; i>1; i--) {
			System.out.printf("%d * ",i);
			f*=i;
		}
		System.out.printf("1 = %d\n ",f);
		
		return f;
	}
	
	// 재귀함수 : 자기 자신을 불러서 사용하는 함수
	// 탈출구를 만들어놓지 않으면 계속해서 호출하다가 스택오버플로우를 일으킨다
	// 성능은 일반 함수에 비해 떨어지지만 반드시 필요한 경우가 존재한다
	// 스택오버플로우 : 한번에 너무 많은 함수를 호출해서 발생하는 에러
	
	public static int refac(int num) {
		System.out.printf("refac(%d)\n ",num);
		if(num<1) { 			// num이 1보다 작은값이 들어왔을때 스택오버플로우 방지위해서 탈출구 만들어준것
			return -1;
		}else if(num==1) {
			return 1;
		}
		else {
			return num * refac(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳인지 판단할 문자 하나를 입력하세요>>");
		char alp = sc.next().charAt(0);
		
		//1번
		System.out.println(alphabet(alp));
		
		//2번
		System.out.print("3의 배수를 판단할 숫자 하나를 입력하세요>>");
		int num = sc.nextInt();
		System.out.println(threetime(num));
		
		//3번
		System.out.print("홀수 짝수를 판단할 숫자 하나를 입력하세요>>");
		int num2 = sc.nextInt();
		System.out.println(holjjak(num2));
		
		//4번
		System.out.print("약수를 확인할 숫자 하나를 입력하세요>>");
		int num3 = sc.nextInt();
		System.out.println(Arrays.toString(yaksu(num3)));
		
		//5번
		System.out.print("소수인지 확인할 숫자 하나를 입력하세요>>");
		int num4 = sc.nextInt();
		System.out.println(Prime(num4));
//		
		//6번
		System.out.print("팩토리얼 확인할 숫자 하나를 입력하세요>>");
		int num5 = sc.nextInt();
		System.out.println(refac(num5));
	}
}
