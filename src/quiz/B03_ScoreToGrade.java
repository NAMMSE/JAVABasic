package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {

	/*
	 점수를 세 개 입력받고 평균 점수를 낸 후 평균점수에 해당하는 등급을 출력해주는 프로그램을 만드시오
	 
	 1. 과목은 국/영/수 가 있다
	 
	 2. 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D
	 
	 3. 유효한 점수는 0~100점이다 ( 유효하지 않은 점수는 F등급 처리)
	 
	 4. 평균 점수는 소수 셋째 자리에서 반올림 한다
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double han, eng, math, avg;
		
		System.out.print("국어 점수를 입력하세요 : ");
		han = sc.nextDouble();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextDouble();
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextDouble();
		
		if((han<0 || han>100) || (eng<0 || eng>100) || (math<0 || math>100)) {
			System.out.print("유효하지 않은 점수 입력으로 당신은 F등급입니다.");
			
		}
		else {
			avg = Math.round((han+eng+math) / 3.0 * 100) / 100.0;
			
			if(avg > 90) {
				System.out.printf("당신의 평균 점수는 %.2f 점이고 등급은 A입니다. ", avg);
			}
			else if(avg > 80) {
				System.out.printf("당신의 평균 점수는 %.2f 점이고 등급은 B입니다. ", avg);
			}
			else if(avg > 70) {
				System.out.printf("당신의 평균 점수는 %.2f 점이고 등급은 C입니다. ", avg);
			}
			else if(avg > 60) {
				System.out.printf("당신의 평균 점수는 %.2f 점이고 등급은 D입니다. ", avg);
			}
			else {
				System.out.printf("당신의 평균 점수는 %.2f 점이고 등급은 F입니다. ", avg);
			}
			
		}
		
		//avg = Math.round((han+eng+math) / 3 * 100) / 100.0;
		
		//System.out.println(avg);
		
		
	}
}
