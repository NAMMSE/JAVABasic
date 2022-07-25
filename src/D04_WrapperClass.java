
public class D04_WrapperClass {

	/*
	  # Wrapper class
	  
	   - �⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� ���γ��� Ŭ������
	   - �� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	   
	  # �⺻�� Ÿ�Ե�
	   
	   - byte, short, char, int, long, float, double, boolean
	   
	  # ������ Ÿ�Ե�
	  
	   - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	   
	   
	  # Parsing
	  
	   - ���ڿ��� �ش� Ÿ�� ������ ��ȯ�ϴ� ��
	   - �� Wrapper Ŭ������ �˸��� �޼��尡 �����Ѵ�
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt("55551234");
		num = Integer.parseInt("100101010",8); // radix : ����
		num = Integer.parseInt("��ö��/101011/A+",4,10,2);
		System.out.println(num);
		
		float value = Float.parseFloat("123.12345678");
		System.out.println(value);
		
		boolean isPrime = Boolean.parseBoolean("");
		System.out.println(isPrime);
		
		/*
		  # toString
		  
		   - �� Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� ���
		 */
		
		String data = Integer.toString(12345678);
		data = Integer.toString(12345678, 2);
		System.out.println(data);
		
		// �� Ÿ���� �����
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // bit�� ��Ÿ��
		
		System.out.println(Character.MAX_CODE_POINT);
		System.out.println(Character.MAX_RADIX);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Character.SIZE); // bit�� ��Ÿ��
		
		// Character���� ���ڸ� ���ϰ� �ٷ� �� �ִ� �޼������ ����
		System.out.println(Character.isAlphabetic('��'));
		System.out.println(Character.isAlphabetic('��'));
		System.out.println(Character.isAlphabetic('3'));
		System.out.println(Character.isAlphabetic('_'));
		
		//�ش� ������ Ÿ���� �˷��ִ� �޼���
		System.out.println(Character.getType('A'));
		System.out.println(Character.UPPERCASE_LETTER);
		
		//���� �Ǵ� \t �Ǵ� \n�̸� true�� �޼���
		System.out.println(Character.isSpaceChar(' '));
		System.out.println(Character.isSpaceChar('\t'));
		System.out.println(Character.isSpaceChar('\n'));
		
		System.out.print("A�� �빮���Դϱ�?");
		System.out.println(Character.isUpperCase('A'));
		System.out.print("a�� �ҹ����Դϱ�?");
		System.out.println(Character.isLowerCase('a'));
		
		// ���� �������� �������ִ� �޼���
		System.out.println("0�� �����ΰ���?"+ Character.isDigit('0'));
		System.out.println("A�� �����ΰ���?"+ Character.isDigit('A'));
		
		// �ڹ��� ������ ù ��°�� ����� �� �ִ� �������� �������ִ� �޼���
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart(' '));
		System.out.println(Character.isJavaIdentifierStart('1'));
		
		char[] ch = {'1','2'};
		System.out.println("0�� �����ΰ���?"+ Character.isDigit(ch[1]));
		
		
		
		
		
		
	}
}
