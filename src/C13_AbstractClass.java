
public class C13_AbstractClass {

	/*
	  # �߻� Ŭ����
	  
	   - �޼����� ���¸� �����س��� �ش� �޼����� �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	   - �ڽ� Ŭ������ �߻� Ŭ������ ��ӹ����� �ݵ�� �߻� �޼��带 �������̵� �ؾ��Ѵ�.
	   
	  # �߻� �޼���
	  
	   - ���� �Ǿ��ְ� ������ ���� �޼���
	   - �տ� abstract�� �پ� �ִ� �޼���� body�� ���� �߰��� �� ����
	   - �ݵ�� ��ӹ��� �� �ڽ� Ŭ�������� �������̵��Ͽ� �����ؾ� �Ѵ�
	   - abstract �޼��带 �������� ���� Ŭ������ �ν��Ͻ��� ������ �� ����
	 */
	
	public static void main(String[] args) {
		
		SwordMan unit1 = new SwordMan();
		Archer unit2 = new Archer();
		
	
		unitAttack(new SwordMan());
		unitAttack(new Archer());
		
		unitAttack(new Mage()); // Mage���� attack�� �ȸ���� �����ص� �θ�Ŭ������ �ִ� �޼��带 ȣ���ϱ� ������ ������ �߻����� ����
		
	}
	
	// �׳� Unit �� �Ű������� ������ �ڽ�Ŭ�������� ��ĳ���� �Ǿ� �����⶧���� �θ�Ŭ������ ���ݸ޼��尡 ������ �ƹ��͵� �� �� ����
	// ��ĳ������ �ϰ� �������̵��� �ϸ� �ڽ�Ŭ������ �ִ� �޼��带 ����Ѵ�
	public static void unitAttack(Unit unit) {
		unit.attack();
	}
}

abstract class Unit{
	int attack;
	int hp;
	
	//�ڽ� Ŭ������ �� �޼��带 �ݵ�� �����ؾ� �Ѵ�
	abstract void attack(); 
	
	
//	void attack() {
//		System.out.println("��� ������ ������ ������� ������ �ؾ��մϴ�.");
//	}
}

class Mage extends Unit{
	public Mage() {
		attack = 30;
		hp = 20;
	}

	@Override// ���� �θ�Ŭ������ abstract�޼��带 �������� ������ �ڽ� Ŭ������ ������ �߰� ù��° �����ذ��� ������ �ڵ����� �������̵���
	void attack() {
		System.out.println("���� ������ : "+attack);
		
	}
}

class SwordMan extends Unit{
	public SwordMan() {
		attack = 10;
		hp = 50;
	}
	
	@Override
	void attack() {
		slash();
	}
	
	void slash() {
		System.out.println("Į�� �ֵѷ����ϴ� . ������ : "+attack);
	}
	
}

class Archer extends Unit{
	double accuracy;
	public Archer() {
		attack = 8;
		hp = 30;
		accuracy = 0.88;
	}
	
	@Override
	void attack() {
		shot();
	}
	void shot() {
		if(Math.random() < accuracy) {
			System.out.println("ȭ���� �����߽��ϴ� . ������ : "+attack);
		}
		else {
			System.out.println("ȭ���� ���������ϴ�...");
		}
	}
}
