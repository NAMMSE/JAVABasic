
public class B02_Operator2 {

	/*
	 # �񱳿�����
	  - �� ���� ���ϴ� ����
	  - �� ������ ����� �׻� �� �Ǵ� �����̴� -> �� ������ ����� boolean Ÿ���̴�
	  - ��� ����� �� ������ �Բ� ������ ��������� ���� ����Ѵ�
	  
	 # ��������
	  - �� boolean Ÿ�� ������ �ϴ� ����
	  - && : �� ���� ��� true �϶� true (AND����)
	  - || : �� �� �ϳ��� true ���� true (OR ����)
	  - !  : true �� false, flase�� true(NOT ����) 
	  
	  
	 */
	
	public static void main(String [] args) {
		
		int a = 10, b = 7;
		
		char ch1='A';
		char ch2='K';
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b); // �ε�ȣ�� ������ ��
		System.out.println(a<=b);
		System.out.println(a==b);// ���� ���ƾ� true
		System.out.println(a!=b);// ���� �޶�� true 
		
		System.out.println(a + 5 == 15);
		System.out.println(a % 3 != 0);
		System.out.println(ch1>ch2);
		
		System.out.println("######AND######");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("######OR######");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("######NOT######");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a<100 && a % 5 ==0);
		
		
		
		
		
		
	}
}
