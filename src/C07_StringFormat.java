
public class C07_StringFormat {

	public static void main(String[] args) {
		//printf : ������ �̿��� ���
		System.out.printf("%d\n", 0x10);
		
		// String.format : ������ �̿��� ���ڿ��� ����
		String time = String.format("%d�� %d�� %d�� �Դϴ�.", 10, 59,59);
		
		System.out.println(time);
		
		String lotto = getStr();
		System.out.println(lotto);
	}
	
	public static String getStr() {
		return String.format("������ �ζ� ��ȣ %d", 5 );
	}
	
	
}
