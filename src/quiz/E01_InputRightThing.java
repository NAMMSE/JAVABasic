package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_InputRightThing {

	/* 0518 ������
	  ����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� ��������
	  (�ٸ� Ÿ�� ���� �ԷµǴ��� ����������� �ʾƾ��մϴ�)
	 */
	
	public static int inputint() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("���ڸ� �Է��ϼ��� >>");
				return sc.nextInt();
			}catch (InputMismatchException e) {
				sc.nextLine(); // ��ĳ�ʿ� �����ִ� �߸��Էµ� �ܾ ������� �Ѵ�
			}
		}
	}
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		while(true) {
//			
//			try {
//				System.out.print("���ڸ� �Է��ϼ��� >>");
//				num = sc.nextInt();
//				
//			}catch (Exception e) {
//				System.out.println("���ڰ� �ƴմϴ�. �ٽ� �Է��ϼ���");
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
