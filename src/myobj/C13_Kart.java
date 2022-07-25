package myobj;

public class C13_Kart {

	public static void main(String[] args) {
		
		
		Engine9 en9 = new Engine9();
		EngineX enX = new EngineX();
		EngineV enV = new EngineV();
		
		kartBooster(en9);
		kartBooster(enV);
		kartBooster(enX);
		
	}
	
	public static void kartBooster(Kart kart) {
		kart.booster();
	}
	
	
}

abstract class Kart{
	
	int gage;
	abstract void booster();
	 
}


class Engine9 extends Kart{
	void booster() {
		System.out.println("9������ 1�� �ν����Դϴ�.");
	}
}

class EngineX extends Kart{
	void booster() {
		System.out.println("X������ 2�� �ν����Դϴ�.");
	}

}

class EngineV extends Kart{
	void booster() {
		System.out.println("V������ 3�� �ν����Դϴ�.");
	}
}