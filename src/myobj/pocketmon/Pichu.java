package myobj.pocketmon;

public class Pichu extends Pocketmon{

	static String defaultName = "Pichu";
	public Pichu() {
		super(
				
				(int)(Math.random()*50+70),
				(int)(Math.random()*50+70),
				(int)(Math.random()*50+70),
				(int)(Math.random()*50+70),
				(int)(Math.random()*50+70),
				(int)(Math.random()*50+70),
				defaultName // nickname(defaultName)
				);
	}
	
	public void tackle() {
		System.out.printf(name + "�� �����ġ��� " +atk *0.7 + "�� �������� ������.");
	}
	
}
