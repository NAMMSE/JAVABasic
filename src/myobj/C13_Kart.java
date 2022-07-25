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
		System.out.println("9엔진은 1단 부스터입니다.");
	}
}

class EngineX extends Kart{
	void booster() {
		System.out.println("X엔진은 2단 부스터입니다.");
	}

}

class EngineV extends Kart{
	void booster() {
		System.out.println("V엔진은 3단 부스터입니다.");
	}
}