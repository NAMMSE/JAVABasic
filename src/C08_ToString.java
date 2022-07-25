
class Pig{
	final static String type = "����";
	int gram_price;
	int gram;
	
	public Pig(int gram, int gram_price) {
		this.gram=gram;
		this.gram_price=gram_price;
	}
	@Override
	public String toString() {
		return String.format("���� : %s\n"
							+"g�� ���� : %d\n" 
							+ "�� ���� : %dg\n" 
							+ "����\t : %d",type, gram_price, gram, gram_price*gram);
	}
	
	
}

/*
# Object.toString()

 - �ش� Ŭ������ ���ڿ��μ� ��µǾ�� �� �� ������ ȣ��Ǵ� �޼���
 - Object�� ��� Ÿ���� �θ��̱� ������ ��� Ŭ������ toString()�� ���ԵǾ� �ִ�
 - �������̵��ؼ� ������� ������ �⺻������ �޸𸮻��� �ּҰ��� ����Ѵ�
*/


public class C08_ToString {

	public static void main(String[] args) {
		Pig meat = new Pig(150,40);
		
		//�ν��Ͻ��� ����Ϸ��� �ϸ� �⺻�����δ� �ְ��� ���´�
		//�ش� Ʋ������ toString() �޼��带 �������̵��ϸ� ���ϴ� ���·� ����� �� �ִ�.

		//�ش� �ν��Ͻ��� toString()���� ���ڿ��� �����ͼ� ����ϱ�
		String pigstr = meat.toString();
		System.out.println(pigstr);

		//�ش� �ν��Ͻ��� �׳� ����ϱ�
		System.out.print(meat);
		// println() �޼���� ��� �ش� �ν��Ͻ��� toString() ����� �ֿܼ� ����ϴ� �޼����̴�.
	}
}
