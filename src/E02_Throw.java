import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.UnsupportedAddressTypeException;

public class E02_Throw {

	/*
	  # throw
	  
	   - ���ϴ� ���ܸ� �߻���Ų��
	   - ���� ���� ����� ������ ����ϴ� ������� ó���� �ñ� �� �ִ�
	   
	  # throws
	  
	   - �ش� �޼��忡�� ���ܰ� �߻����� �˸��� ����
	   - �ش� �޼��� ���ο��� ���ܰ� �߻��� �� �߰��� �� �ִ� ����
	   - �ش� �޼��� ������ ���ܸ� ���� ó������ �ʰ� �޼��带 ȣ���ϴ� ���α׷��ӿ��� ����ó���� �ѱ��
	   
	  # �� ó������ �ʾƵ� �Ǵ� ���� ( RuntimeException)
	  
	   - RuntimeException Ŭ������ ��ӹ��� ���ܵ��� �ݵ�� ó������ �ʾƵ� �Ǵ� �����̴�
	   - ���� ó���� ���� �ʾƵ� ������ ����(������)�� �߻����� �ʴ´�
	   
	  # �ݵ�� ó���ؾ��ϴ� ���� ( exception)
	  
	   - Exception Ŭ������ ��ӹ��� ���ܵ��� �ݵ�� ó���ؾ� �ϴ� ���ܰ� �ȴ�
	   - ���� ó���� ���� ������ �������� �Ұ����ϴ�.
	   - ��򰡿��� �ݵ�� try-catch������ ó���Ǿ�� �������� �������� �� �ִ�
	   - �߻��� ������ �ٷ� ó���ϰ� ���� ���� ��� throws�� ����Ͽ� �ش� �޼��带 ȣ���ϴ� ������ ���� ó���� ���ѱ� �� �ִ�
	  
	    
	 */
	
	public static void method4() throws Throwable {
		switch ((int)(Math.random())*5) {
		case 0:
			throw new ArrayIndexOutOfBoundsException();
		case 1:
			throw new ArithmeticException();
		case 2:
				
			throw new IOException(); // �ش� ������ �ݵ�� ����ó���� �ؾ��ϱ⶧���� �޼��� �̸��ڿ� throws�� ���̰ų� �޼��峻�ο��� try catch���� ����Ѵ�
			
		case 3:
			try { 
				throw new ClassNotFoundException(); // �̰͵� �ݵ�� ó���ؾߵ�
			}catch(ClassNotFoundException e){
				System.out.println("�ݵ�� ó���ؾ� �ϴ� ����");
			}
		case 4:
			throw new UnsupportedEncodingException();
		
			
		}
	}
	
	public static void method3() {
		throw new NullPointerException();
	}
	
	public static void method2() {
		method3();
	}
	
	public static void method1() {
		method2();
	}
	
	
	public static void main(String[] args) throws IOException { //method4�� ȣ���Ϸ��� main���� throws �������

		try {
			method1();
			throw new ArrayIndexOutOfBoundsException("�׳� �ɽ��ؼ� ����");
		}catch(Exception e) {
			System.out.println("�߻��� ������ �޼����� \"" + e.getMessage() + "\"�Դϴ�.");
			System.out.println("���� �߻� ������ ��������");
			e.printStackTrace();
		}
		
		try {
			// method4(); �̰� �ּ� ����� ���� �ߴµ� �� �ߴ��� Ȯ��
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hello");
		
		
	}
}
