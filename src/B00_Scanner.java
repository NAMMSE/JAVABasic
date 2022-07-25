/*
 # import
  - �ٸ� ��Ű���� ����Ǿ� �ִ� Ŭ������ ��Ű������ �����ϰ� ����ϱ� ���� ����
 */
import quiz.A00_rabbit;

import java.util.Scanner;

public class B00_Scanner {

	/*
	 # java.util.Scanner Ŭ����
	  - ���α׷����� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	  - ��������κ��� �Է� ���� �� ���� �� �ڿ� ��ĳ�ʸ� �����Ͽ� ����Ѵ�
	 
	 */
	
	
	
	public static void main(String[] args) {
		
		//��� �츮�� �ٸ� ��Ű���� ������� �͵��� ������ ����� �� �ִ�
		quiz.A00_rabbit.main(null);
		//���� ��Ű���� �����ִ� �ٸ� Ŭ������ ��Ű������ �����ϰ� ����� �� �ִ�.
		A00_Hello.main(null);
		
		//java.util.Scanner sc = new java.util.Scanner(System.in)
		//��Ű��.��Ű��.Ŭ���� (ù���� ��ҹ��ڷ� ��Ű�� Ŭ���� ����)
		
		// import�� ���� ��Ű������ �����ϰ� ����� �� �ִ�.
		// System.in ���� �Է¹޴� ���ο� ��ĳ�ʸ� ����
		Scanner sc = new Scanner(System.in); // ctrl+shift+o(�ڹ� ��ƿ ��ĳ�� ����Ʈ)
		//Scanner sc2 = new Scanner(new FileInputStream());

		
		
		
		/*
		   (1) nextŸ��() (nextInt, ...)
		  
		   - �Էµ� ���� �� ���� ���� �ϳ��� ���� �� �ش� Ÿ������ ��ȯ�Ͽ� �����´� 
		   - ��ο��� ���� ���� �ش� Ÿ���� �� �� ���ٸ� ������ �߻��Ѵ�
		   - ����, \n, \t�� �������� ���� �����Ѵ�
		   - ��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���
		   
		   (2) next()
		   - �Էµ� ���� �� ���� ���� �ϳ� ���ڿ� Ÿ������ ������
		   - ����, \n, \t�� �������� ���� �����Ѵ�
		   - ��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���
		    
		   
		   (3) nextLine()
		   - �Էµ� ���� ��� ���ڿ�Ÿ������ ������
		   - \n �� �������� ��� ���� �����Ѵ� (�� ���� �뤊�� �Է¹޴´�)
		   - ��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���
		   
		   
		 */
		
		
		/*System.out.print("������ �Է��ϼ��� >>");
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		
		System.out.printf("�Է¹��� ���� %d�Դϴ� \n", input);
		System.out.printf("�Է¹��� ���� %d�Դϴ� \n", input2);
		
		*/
		System.out.print(" �ƹ��ų� �Է��ϼ��� >>");
		String input = sc.next();
		String input2 = sc.next();
		
		System.out.printf("1�Է¹��� ���� %s�Դϴ� \n", input);
		System.out.printf("2�Է¹��� ���� %s�Դϴ� \n", input2);
		
		
	}
}
