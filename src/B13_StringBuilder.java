
public class B13_StringBuilder {

	
	public static void main(String[] args) {
		
		
		// append(value) : �� �ڿ� �ش� ���� �߰��Ѵ�
		// insert(index, value) : ���ϴ� ��ġ�� �ش� ���� �߰��Ѵ�
		StringBuilder brutepassword = new StringBuilder(); // java.lang ��Ű���� �ִ� Ŭ������ ���� import �����
		brutepassword.insert(0,'z');
		brutepassword.insert(0,'c');
		brutepassword.insert(0,'b');
		brutepassword.insert(0,'a');
		System.out.println(brutepassword);
		
		StringBuilder builder1 = new StringBuilder("abc");
		builder1.insert(2, 123);
		System.out.println(builder1);
	}
}
