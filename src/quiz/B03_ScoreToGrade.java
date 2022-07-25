package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {

	/*
	 ������ �� �� �Է¹ް� ��� ������ �� �� ��������� �ش��ϴ� ����� ������ִ� ���α׷��� ����ÿ�
	 
	 1. ������ ��/��/�� �� �ִ�
	 
	 2. 90�� �̻��� A, 80�� �̻��� B, 70�� �̻��� C, 60�� �̻��� D
	 
	 3. ��ȿ�� ������ 0~100���̴� ( ��ȿ���� ���� ������ F��� ó��)
	 
	 4. ��� ������ �Ҽ� ��° �ڸ����� �ݿø� �Ѵ�
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double han, eng, math, avg;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		han = sc.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		eng = sc.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		math = sc.nextDouble();
		
		if((han<0 || han>100) || (eng<0 || eng>100) || (math<0 || math>100)) {
			System.out.print("��ȿ���� ���� ���� �Է����� ����� F����Դϴ�.");
			
		}
		else {
			avg = Math.round((han+eng+math) / 3.0 * 100) / 100.0;
			
			if(avg > 90) {
				System.out.printf("����� ��� ������ %.2f ���̰� ����� A�Դϴ�. ", avg);
			}
			else if(avg > 80) {
				System.out.printf("����� ��� ������ %.2f ���̰� ����� B�Դϴ�. ", avg);
			}
			else if(avg > 70) {
				System.out.printf("����� ��� ������ %.2f ���̰� ����� C�Դϴ�. ", avg);
			}
			else if(avg > 60) {
				System.out.printf("����� ��� ������ %.2f ���̰� ����� D�Դϴ�. ", avg);
			}
			else {
				System.out.printf("����� ��� ������ %.2f ���̰� ����� F�Դϴ�. ", avg);
			}
			
		}
		
		//avg = Math.round((han+eng+math) / 3 * 100) / 100.0;
		
		//System.out.println(avg);
		
		
	}
}
