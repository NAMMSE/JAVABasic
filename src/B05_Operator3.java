
public class B05_Operator3 {

	/*
	 # ���� ������
	 
	  = : ���� ������ ������ �� ����
	  
	 # ���� ���� ������
	 
	  - �ش� ������ ���� ������Ű�� ����
	  - +=, -=, *=, /=,...
	  
	 # ���� ������
	 
	  - �ش� ������ ���� 1�� ������Ű�� ������
	  - ++, --�� ��ġ�� ���� ����� �޶�����
	  - �ڿ� ������ �ش� ����� ���� �� �Ŀ� ���� ���ϰ� �տ� ������ ��� ���� �� ���� ���Ѵ�
	  
	 */
	
	public static void main(String[] args) {
		
		int num = 100;
		
		num = num + 5;
		num += 5;
		num *= 2;
		num %= 10;
		
		System.out.println(num + "\n -------------");
		
		num = 10;
		num++; // num = num + 1 �� ����
		System.out.println(num);
		++num;
		System.out.println(num);
		
		num = 20;
		System.out.println(num++);
		System.out.println(++num);
		
	}
}
