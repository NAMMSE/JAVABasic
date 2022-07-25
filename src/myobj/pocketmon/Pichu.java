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
		System.out.printf(name + "은 몸통박치기로 " +atk *0.7 + "의 데미지를 입혔다.");
	}
	
}
