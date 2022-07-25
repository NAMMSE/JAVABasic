import java.util.ArrayList;

public class D05_Generic {

	/*
	  # Generic
	  
	   - Ŭ���� ���� �ڿ��� Ÿ���� �ܺο��� ���߿� ������ �� �ְ� �ϴ� ����
	   - ���׸����� �⺻ Ÿ���� ����� �� ���� ������ Wrapper Ŭ������ ����ؾ� �Ѵ�
	  
	  # static Generic
	  
	   - ����ƽ �޼��忡 ���׸��� ����� ���� ���� Ÿ�� �տ� ���׸��� �߰����ش�
	   - ����� ���� Ŭ������.<T>�޼����() ���� ����� �� �ִ�
	 */
	
	public static void main(String[] args) {
		GenericTest<String, Integer, Double> test = new GenericTest<>();
		
		//static ���׸� �޼��� ����ϱ�
		GenericTest.<Apple>staticMethod1();
		
	}
	
	
}
class GenericTest<A, B, C>{
	A var1;
	A var2;
	B var3;
	C var4;
	
	public A method1() {
		return null;
	}
	
	static<MyType> int staticMethod1() {
		ArrayList<MyType> list = new ArrayList<>();
		
		MyType a = list.get(0);

		// ���׸� A, B, C�� �ν��Ͻ� ������ �������� ������ static �޼��忡���� ����� �� ����
		//A v1 = null;
		
		return 0;
	}
}
