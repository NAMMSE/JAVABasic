package myobj.pocketmon;

public class Pikachu extends Pocketmon{
	
	static String defaultName = "Pikachu";
	
	public Pikachu() {
		super(
				(int)(Math.random()*50+100),
				(int)(Math.random()*50+100),
				(int)(Math.random()*50+100),
				(int)(Math.random()*50+100),
				(int)(Math.random()*50+100),
				(int)(Math.random()*50+100),
				defaultName); // nickname(defaultName)
	}
	public void thunder() {
		System.out.println("��ī��� ���� ������ �ֽ��ϴ�. �������� " + sAtk * 1.5 +"�Դϴ�.");
	}

	
}
