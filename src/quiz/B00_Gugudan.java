package quiz;

import java.util.Scanner;

public class B00_Gugudan {

	/*
	 ����ڷκ��� ���ڸ� �Է¹����� �������� �ش� ���� ���� ��� ����ϴ� ���α׷��� ��������
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ �Է��ϼ��� >>");
		int input = sc.nextInt();
		// nextInt�� ���� �Է� �� \n�� �Է��� �ȵǾ� �ٸ� ���� �����Ͽ� �Է½� �ش� ���ڵ��� �Է��� �ȵǰ� �����ִ� \n ������µ�
		 
		String trash = sc.nextLine();
		//�� ���� �������� ������ ���� �ϳ��� ���� ���ָ� �ش� ������ \n���� ��
		
		System.out.print("�̸� �Է��ϼ��� > ");
		String username = sc.nextLine();
		System.out.printf("�̸� �� %s \n", username);
		
			
		System.out.printf("%d ���Դϴ�.\n", input);
		
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
