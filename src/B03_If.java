import java.util.Scanner;

public class B03_If {

	/*
	 # if��
	  - ()���� ���� true�� {}���� ������ �����ϴ� ����
	  - ()���� ���� false�� {}���� ������ �����Ѵ�
	 
	 # else if ��
	  - ���� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
	  - else if�� ���� �� ����� �� �ִ� 
	  - else if�� if ���� �ܵ����� ����� �� ����
	  
	 # else ��
	  - ���� ������ ��� �ƴ϶�� {}���� ������ ������ �����Ѵ� ( �׷��� ������ �ʿ����)
	  - if�� �ٷ� ������ ����� ���� �ִ�
	  - �ܵ����� ����� �� ����
	  - else�� �پ��ִ� if���� �ּ��� �ѹ��� ����ȴ�
	  
	 */
	
	public static void main(String[] args) {
		
		if (true) {
			
			System.out.println("if���� true �϶� ����Ǵ� ��ɾ�1");
			System.out.println("if���� true �϶� ����Ǵ� ��ɾ�3");
			System.out.println("if���� true �϶� ����Ǵ� ��ɾ�2");
		}
	
		int a =7;

		
		if (a%2 == 0) {
			
			System.out.println("a�� ¦���� �� ����Ǵ� ��ɾ�1");
		}
		else if ( a%3 == 0) {
			System.out.println("a�� ¦���� �ƴϸ鼭 3�� ���");
		}
		else if ( a%5 == 0) {
			System.out.println("a�� ¦���� �ƴϸ鼭 3�� ����� �ƴϸ鼭 5�� ���");
		} 
		else{
			System.out.println("���� ������ ��� �ƴմϴ�");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻ� ����� ����: ");
		int apple = sc.nextInt();
		String size;
		
		if(apple > 10) {
		
			size = "��뷮 ���̹�";
		}
		else if(apple > 5) {
			
			size = "���� ���̹�";
		}
		else {
			size = "���� ���̹�";
		}
	
		// �ʱ�ȭ�� ���ϰ� if�������������� ������ �������� ���� Ȯ���� �ִٸ� ���� �߻� else ��� �� ���� �ذ�
		System.out.println(size);
		
		
		
	}
	
}
