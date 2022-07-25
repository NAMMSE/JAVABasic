package myobj.pocketmon;


public class Trainer {

	String name;
	Pocketmon[] own_pocketmon = new Pocketmon[6]; 
	int index=0;
	
	public Trainer(String name) {
		this.name=name;
	}
	
	public void catchPocketmon(Pocketmon poke) {
		if(index==6) {
			System.out.println("주머니가 가득차서 "+poke.name+"을 놓아주었습니다.");
		}
		own_pocketmon[index++] = poke;
		return; // 리턴해줘야 에러가 안남
	}
	
	
	
	public void printOwn() {
		for (int i=0;i<6 ; i++) {
			own_pocketmon[i].printStats();
		}
	}
	
	public static void main(String[] args) {
//		Pikachu pika = new Pikachu();
//		pika.thunder();
//		pika.printStats();
//		Pichu pichu = new Pichu();
//		pichu.printStats();
		
		Trainer t = new Trainer("지우");
		
		t.catchPocketmon(new Pocketmon(1, 2, 3, 4, 5, 6,"이상해씨"));
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		
		t.printOwn();
	}
}
