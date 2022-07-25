package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz {

	/*
	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 
	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 
	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�." �Ǵ� "Ȧ���Դϴ�."�� ��ȯ�ϴ� �Լ�
	 
	 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ� > ��Ǯ����
	 
	 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 
	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 
	 */
	
	public static boolean alphabet(char ch) {
		return((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')); // ���� if�� �����ʰ� ������ true false�� ��ȯ�ϱ� ������ �̷������� �ۼ��ص� ��
	}
	
	public static boolean threetime(int num) {
		return(num%3==0); // �̰͵� ��������
	}
	
	public static String holjjak(int num) {
		return num % 2 ==0 ?"¦���Դϴ�." : "Ȧ���Դϴ�.";
	}
//	
	
	public static int yaksucnt(int num) { // ����� ������ ���� �Լ�  // ��Ǭ����
		int cnt = 0;
		
		for(int i=2;i<num;i++) { // 1�� �ڱ� �ڽ��� ������ ���� ����
			if(num%i==0) {
				cnt++;
			}
		}
		
		return cnt + 2; // 1�� �ڱ� �ڽ� ���ؼ� ��ȯ
	}
	
	public static int[] yaksu(int num) {
		int[] yak = new int[yaksucnt(num)];
		
		int index =0 ;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				yak[index++] = i; // ó������ index�� 0�̰� i�� �� �� index 1���� ���� num%i==0�� �Ǵ� ������ index�� ���� ���ʴ�� index�� ������� �����
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
		
//		int fac = 1; �� �ڵ�
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
	
	// ����Լ� : �ڱ� �ڽ��� �ҷ��� ����ϴ� �Լ�
	// Ż�ⱸ�� �������� ������ ����ؼ� ȣ���ϴٰ� ���ÿ����÷ο츦 ����Ų��
	// ������ �Ϲ� �Լ��� ���� ���������� �ݵ�� �ʿ��� ��찡 �����Ѵ�
	// ���ÿ����÷ο� : �ѹ��� �ʹ� ���� �Լ��� ȣ���ؼ� �߻��ϴ� ����
	
	public static int refac(int num) {
		System.out.printf("refac(%d)\n ",num);
		if(num<1) { 			// num�� 1���� �������� �������� ���ÿ����÷ο� �������ؼ� Ż�ⱸ ������ذ�
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
		System.out.print("���ĺ����� �Ǵ��� ���� �ϳ��� �Է��ϼ���>>");
		char alp = sc.next().charAt(0);
		
		//1��
		System.out.println(alphabet(alp));
		
		//2��
		System.out.print("3�� ����� �Ǵ��� ���� �ϳ��� �Է��ϼ���>>");
		int num = sc.nextInt();
		System.out.println(threetime(num));
		
		//3��
		System.out.print("Ȧ�� ¦���� �Ǵ��� ���� �ϳ��� �Է��ϼ���>>");
		int num2 = sc.nextInt();
		System.out.println(holjjak(num2));
		
		//4��
		System.out.print("����� Ȯ���� ���� �ϳ��� �Է��ϼ���>>");
		int num3 = sc.nextInt();
		System.out.println(Arrays.toString(yaksu(num3)));
		
		//5��
		System.out.print("�Ҽ����� Ȯ���� ���� �ϳ��� �Է��ϼ���>>");
		int num4 = sc.nextInt();
		System.out.println(Prime(num4));
//		
		//6��
		System.out.print("���丮�� Ȯ���� ���� �ϳ��� �Է��ϼ���>>");
		int num5 = sc.nextInt();
		System.out.println(refac(num5));
	}
}
