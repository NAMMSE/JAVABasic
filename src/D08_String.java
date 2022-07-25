import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] split = fruits.split("/");
		System.out.println(Arrays.toString(split));
		
		// String.join(delimiter, CharSequence...) : �ڿ� ������ ���ڿ��� ��� �����Ѵ�
		// String.join(delimiter, iterable) : �迭(�Ǵ� ����Ʈ ��)�� ��� ���ڿ��� �����Ѵ�
		String join = String.join(",", "tiger", "lion", "bear", "hawk", "panda");
		System.out.println(join);
		
		join = String.join("/", split); // ������ /�������� �ڸ� �迭�� �ٽ� /�� �ٿ���
		System.out.println(join);
		
		// contains(seq) : �ش� ���ڿ��� seq ������ �ִ��� true false �� �˷��ش�
		System.out.println("�������� �ֳ���? "+fruits.contains("orange"));
		System.out.println("�����ư� �ֳ���? "+fruits.contains("peach"));
		
		// startsWith(seq) : �ش� ���ڿ��� �����ϴ����� �˻��Ѵ�
		String url = "http://www.naver.com";

		System.out.println("www�� �����ϳ���? "+url.startsWith("www"));
		System.out.println("http�� �����ϳ���? "+url.startsWith("http"));
		System.out.println("https�� �����ϳ���? "+url.startsWith("https"));

		// endsWith(seq) : �ش� ���ڿ��� ���������� �˻��Ѵ�
		String filename = "screenshot.pdf";

		System.out.println(".gif�� ��������? "+filename.endsWith(".gif"));
		System.out.println(".jpg�� ��������? "+filename.endsWith(".jpg"));
		System.out.println(".pdf�� ��������? "+filename.endsWith(".pdf"));
		
		//replace(old, new) : ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�Ѵ�
		String email = "billgates@microsoft.com";
		
		String replaced = email.replace("microsoft.com", "naver.com");
		
		System.out.println(email); // ��ü�� ���ڿ��� ��ȯ�ϴ� ������ ������ ���ڿ��� �����ϴ� ���� �ƴ�
		System.out.println(replaced);
		
		// substring(start) : ���ڿ��� �ڸ���
		// substring(start, end) : ���ڿ��� start���� end�̸����� �ڸ� ����� ��ȯ�Ѵ�
		email.substring(5);
		
		System.out.println(email); // ���ó� ������ �������� ����
		System.out.println(email.substring(5));
		System.out.println(email.substring(5,10));
		
		// toUpperCase() : ���ڿ��� ���ĺ��� ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(email.toUpperCase());
		
		// toLowerCase() : ���ڿ��� ���ĺ��� ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(email.toLowerCase().toUpperCase().toLowerCase()); // �ν��Ͻ� ��ȯ�̱⶧���� �̷��͵� ������
		
		char[] arr = (email.substring(9).toUpperCase().toCharArray());
		System.out.println(arr);
		
		// indexOf(seq) : ���ϴ� ���ڿ��� ����� �ε����� �ִ��� ��ȯ�Ѵ�
		// indexOf(seq, from) : from���� ���ϴ� ���ڿ��� �˻��Ͽ� �ε����� ��ȯ�Ѵ�
		System.out.println(email.indexOf('@'));
		System.out.println(email.indexOf("micr"));
		int e = email.indexOf('@');
		
		String test = "apple@naver.com, abc@yahoo.co.kr, ddd@hanmail.com";
		
		System.out.println(test.indexOf('@', 0));
		System.out.println(test.indexOf('@', 10));
		System.out.println(test.indexOf('@', 25));
		
		fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// �������� : fruits���� ��� "apple"�� �ε����� ã�� ���(�ݺ��� ���)
		
		int index =-1 ; int i=0;
		while(true) {
			index = fruits.indexOf("apple", index+1);
			if(index==-1)break;
			System.out.printf("%d��° apple ��ġ : %d \n", ++i, index);
		}

		// String.format(format, args,...) : ���ϴ� ���ڿ��� ������ �̿��� ������ �� �ִ�.
		
	}
}
