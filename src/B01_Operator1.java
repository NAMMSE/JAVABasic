

public class B01_Operator1 {

	/*
	 # ������
	  - ����� �� ����ϴ� ��
	  - +, -, *, /, >, <, ...
	  
	 # ��� ������
	 +, -, *, /
	 % : ������
	 
	 
	 
	 
	 
	 #
	  
	  
	 */
	public static void main(String[] args) {
		
		int a, b;
		a= 33;
		b= 8;
		double c = 33, d = 8;
		
		System.out.println("a + b : " +(a+b));
		System.out.println("a - b : " +(a-b));
		System.out.println("a * b : " +(a*b));
		//������ ������������ �� ���Ѵ�
		System.out.println("a / b : " +(a/b));
		//������ �Ǽ��� ������ ��Ȯ�� ���� ���Ѵ�
		System.out.println("c / d : " +(c/d));
		System.out.println("a / d : " +(a/d));
		
		//������
		System.out.println("a % b : " +(a%b));
		
		// n���� ���� �������� 0���� n-1���� �ۿ� ���� �� ����
		System.out.println("18 % 10 : " +(18%10));
		System.out.println("19 % 10 : " +(19%10));
		System.out.println("20 % 10 : " +(20%10));
		System.out.println("21 % 10 : " +(21%10));

		
		//Math.pow(a, b) : a ���� b�� ���Ѵ�
		System.out.println(Math.pow(2,10)); 
		System.out.println(2^10);// xor ����
		
		//Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ� (double Ÿ��)
		System.out.println(Math.sqrt(2));
		
		//Math.abs(a) : a�� ���밪�� ���Ѵ�
		System.out.println(Math.abs(-2));
		
		//Math.round(a) : a�� �Ҽ� ù° �ڸ����� �ݿø��� ���� ��ȯ�Ѵ�
		double result = Math.round(123.456);
		System.out.println(result);
		
		//Math.round(a)�� ���ϴ� �ڸ����� �ݿø� �ϱ�
		double value = 123.7777777;
		
		// �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù��° �ڸ��� ���� �� �ٽ� �Ҽ����� �����Ͽ� ������
		System.out.println(Math.round(value * 10000) / 10000.0);
		
		
		
	}
	
}
