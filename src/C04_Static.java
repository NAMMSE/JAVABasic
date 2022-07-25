
public class C04_Static {

	/*
	   # Static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
	   
	    - 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역을 정적 영역이라고 한다.
	    - 앞에 static이 붙은 자원(필드, 메서드)은 모든 인스턴스가 공동으로 사용하는 자원이 된다
	    - static 영역의 자원은 아무리 인스턴스가 많아도 클래스 당 하나이기 때문에 클래스 이름에 .을 찍고 사용할 수 있다.
	    - static 영역의 자원은 인스턴스가 생기기 전에도 사용할 수 있다.
	    - static 메서드는 인스턴스가 생기기 전에도 사용될 수 있기 때문에 인스턴스 변수를 사용할 수 없다.
	    - static 필드만 사용하는 메서드는 static 메서드로 만드는 것이 좋다
	    - 인스턴스 변수를 활용하는 메서드는 반드시 인스턴스 메서드여야한다
	 */
	
	public static void main(String[] args) {
//		System.out.println(Playingcard.height); // 메인 시작하자마자 인스턴스 만들지도 않았는데 사용 가능
//		
//		Playingcard h1 = new Playingcard(1, 1);
//		Playingcard s1 = new Playingcard(1, 1);
//		Playingcard d10 = new Playingcard(1, 10);
//		
//		for(int i=0;i<5;i++) {
//			Playingcard.width++;
//			h1.print();
//			s1.print();
//			d10.print();
//		}
//		
//		// 하나의 인스턴스에서만 필드값을 바꿔도 해당 클래스로 생성한 모든 인스턴스의 static 필드 값은 전부 바뀐다
//		d10.width = 3; // 이것도 가능하지만 Playingcard.width가 더 낫다
//		
//		System.out.println(h1.width);
//		System.out.println(s1.width);
//		System.out.println(d10.width);
		
		Face f1 = new Face("Brown", "Thin", "Yellow");
		Face f2 = new Face("Black", "Thick", "Bald");
		
		Face.eye_count = 2;
		Face.mouth_count = 1;
		
		
		f1.print();
		f2.print();
		
		Face.changeSkin("Black");
		
		f1.print();
		f2.print();
		
		Face.changeSkin("Brown");
		
		f1.eye_color = "Red";
		f2.hair_color = "Black";
		
		f1.print();
		f2.print();
	}
}


class Playingcard{
	
	// 모든 인스턴스가 함께 사용할 값(스태틱 영역, 클래스 영역, 정적 영역)
	static int width = 0; // 각 카드별로 숫자와 모양은 달라도 카드의 너비와 높이는 다를필요 없으므로 static 을 붙ㅌ임
	static int height = 200;
	
	static char[] suits = {'♥','♠','◆','♣'};
	
	// 각 인스턴스가 자기만의 공간을 가지고 사용할 값(인스턴스 영역)
	int suit;
	int num;
	
	public static void changeSize(int width, int height) { // 스태틱 필드만 사용하는 메서드
		// this를 쓰지 않는 이유는 인스턴스가 생겼을때 자기자신을 가리키는 것이므로 static 메서드에서는 사용할 수 없다
		Playingcard.width=width; 
		Playingcard.height=height;
		
		System.out.println("바뀐 너비 : "+Playingcard.width);
		System.out.println("바뀐 너비 : "+Playingcard.height);
	}
	
	
	public Playingcard(int suit, int num) {
		this.suit=suit;
		this.num=num;
	}
	
	public void print() {
		System.out.print("┌──");
		for(int i =0;i<width;i++) {
			System.out.print('─');
		}
		System.out.println("──┐");
		System.out.printf("│ %c%2d",suits[suit], num);
		for(int i =0;i<width;i++) {
			System.out.print(' ');
		}
		System.out.print("│\n");
		System.out.print("└──");
		for(int i =0;i<width;i++) {
			System.out.print('─');
		}
		System.out.println("──┘");
	}
}


// 연습문제 : static 자원을 포함한 클래스를 하나 정의해보세요


class Face{
	static int eye_count;
	static int mouth_count;
	static String skin_color = "white";
	String eye_color;
	String lip_shape;
	String hair_color;
	
	public Face(String eye_color, String lip_shape, String hair_color) {
		this.eye_color=eye_color;
		this.lip_shape=lip_shape;
		this.hair_color=hair_color;
		
	}
	
	public static void changeSkin(String skin_color) {
		Face.skin_color = skin_color;
		System.out.println();
		System.out.println("======다음에 확인할 인종 : "+ Face.skin_color+"======");
	}
	
	public void print() {
		
		System.out.printf("####%s인종의 얼굴 정보####\n", skin_color);
		System.out.println("당신의 눈의 개수 : "+eye_count);
		System.out.println("당신의 입의 개수 : "+mouth_count);
		System.out.println("당신의 동공 색 : "+eye_color);
		System.out.println("당신의 입술 모양 : "+lip_shape);
		System.out.println("당신의 피부색 : "+skin_color);
		System.out.println("당신의 머리색 : "+hair_color);
	}
}

class SolidR4 {
	// 클래스 영역 , 정적 영역
	static int price =8000;
	static int drift = 90;
	static int acc = 49;
	static int cornering = 556;
	static int boosttime = 440;
	static int boostcharge = 200;
	static String category = "스피드카트 / 일반";
	static String description = "솔리드 시리즈의 본격적인 레이스용 바디입니다. G3에서 안정화된 바디라인은 R4에 이르러 큰 진화를 하게 됩니다.";
	
	
	
	static String[] colorName = {"빨간색", "노란색", "초록색", "파란색", "검은색", "흰색", "핑크색"	};
	
	//인스턴스 영역
	String enginePatch;
	String kit;
	String handle;
	String wheel;
	String owner;
	int paint;
	
}











