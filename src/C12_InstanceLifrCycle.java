
public class C12_InstanceLifrCycle {

	/*
	 # �ν��Ͻ� ������ ���� ����
	 
	  1. (ù �����) ����ƽ ����� ����
	  2. �ν��Ͻ� ����
	  3. �ν��Ͻ� ��� ����
	  4. ������ ȣ��
	 */
	public static void main(String[] args) {
		
		new InstanceLife(); // ���� ������ ���������ʰ� ��� ���� �޼��� ����ϰ������ .��� �޼��� ������ �޼��� ȣ�� ����
		new InstanceLife();// �ι�°���� static ����� ������� ����
	}
}

class InstanceLife{

	// static ���
	static { // ����ƽ ������ ������ �޸𸮿� �Ǿ���� ���� �ƴ϶� �ش� Ŭ������ ���ʷ� ���Ǵ� ������ �޸𸮿� �Ǹ��� �ȴ�.
		System.out.println("1. ����ƽ ��� ����");
	}
	
	// �׳� ���
	
//	try	
//	{
//		System.out.println("2. �ν��Ͻ� ��� ����");
//	}
//	
	// ������ 
	public InstanceLife() {
		System.out.println("3. ������ ��� ����");
	}
}