
public class C14_Interface {

	/*
	  # �������̽� (interface)
	  
	   - �ڹ��� Ŭ������ ����� �� ���� ������ ���� �� ����
	   - �ش� Ŭ������ �������� ���¸� �ο��ϱ� ���ؼ��� �������̽��� ����ؾ� �Ѵ�
	   - �������̽� ���ο� �����ϴ� ��� �޼���� �ڵ����� abstract public�� �ȴ�
	   - �������̽� ���ο� �����ϴ� ������ �ڵ����� final static�� �ȴ�
	   - �������̽��� �ν��Ͻ�ȭ �� �� ����
	   - �������̽� ������ �޼��� �տ� default�� ���̸� �������̵� ���� �ʾ��� ���� �⺻ ������ ������ �� �ִ�
	 */
	
	public static void main(String[] args) {

		Human h1 = new Human();
		Runner r1 = h1;
		Swimmer s1 = h1;
		
		h1.run();
		h1.swim();
		
		r1.run();
		s1.swim();
	}
}

interface Runner{
	int a=10; // ���� ����� ���ÿ� �ʱ�ȭ�� �ݵ�� ����� ��
	default void run() {
		System.out.println("run �̱���");
		
	}
}

interface Swimmer{
	// default�� �޼��带 �������� �ʴ� ��� �ݵ�� �����ؾ��ϴ� abstract �޼��尡 �ȴ�
	void swim();
}

class Human implements Swimmer, Runner{

	@Override
	public void swim() {
	
	}
	// �޸տ��� ������ run �޼��带 �������̵� ���� �ʾ����Ƿ� h1.run ����� ������ run �޼��带 �����Ѵ�
	
}

class Bear implements Swimmer{
	
	public void swim(){
		
	}
}

class Shark implements Swimmer{
	public void swim(){
		
	}
}














































