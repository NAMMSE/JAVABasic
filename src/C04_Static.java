
public class C04_Static {

	/*
	   # Static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
	   
	    - ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� ������ ���� �����̶�� �Ѵ�.
	    - �տ� static�� ���� �ڿ�(�ʵ�, �޼���)�� ��� �ν��Ͻ��� �������� ����ϴ� �ڿ��� �ȴ�
	    - static ������ �ڿ��� �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ���� �� �ϳ��̱� ������ Ŭ���� �̸��� .�� ��� ����� �� �ִ�.
	    - static ������ �ڿ��� �ν��Ͻ��� ����� ������ ����� �� �ִ�.
	    - static �޼���� �ν��Ͻ��� ����� ������ ���� �� �ֱ� ������ �ν��Ͻ� ������ ����� �� ����.
	    - static �ʵ常 ����ϴ� �޼���� static �޼���� ����� ���� ����
	    - �ν��Ͻ� ������ Ȱ���ϴ� �޼���� �ݵ�� �ν��Ͻ� �޼��忩���Ѵ�
	 */
	
	public static void main(String[] args) {
//		System.out.println(Playingcard.height); // ���� �������ڸ��� �ν��Ͻ� �������� �ʾҴµ� ��� ����
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
//		// �ϳ��� �ν��Ͻ������� �ʵ尪�� �ٲ㵵 �ش� Ŭ������ ������ ��� �ν��Ͻ��� static �ʵ� ���� ���� �ٲ��
//		d10.width = 3; // �̰͵� ���������� Playingcard.width�� �� ����
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
	
	// ��� �ν��Ͻ��� �Բ� ����� ��(����ƽ ����, Ŭ���� ����, ���� ����)
	static int width = 0; // �� ī�庰�� ���ڿ� ����� �޶� ī���� �ʺ�� ���̴� �ٸ��ʿ� �����Ƿ� static �� �٤���
	static int height = 200;
	
	static char[] suits = {'��','��','��','��'};
	
	// �� �ν��Ͻ��� �ڱ⸸�� ������ ������ ����� ��(�ν��Ͻ� ����)
	int suit;
	int num;
	
	public static void changeSize(int width, int height) { // ����ƽ �ʵ常 ����ϴ� �޼���
		// this�� ���� �ʴ� ������ �ν��Ͻ��� �������� �ڱ��ڽ��� ����Ű�� ���̹Ƿ� static �޼��忡���� ����� �� ����
		Playingcard.width=width; 
		Playingcard.height=height;
		
		System.out.println("�ٲ� �ʺ� : "+Playingcard.width);
		System.out.println("�ٲ� �ʺ� : "+Playingcard.height);
	}
	
	
	public Playingcard(int suit, int num) {
		this.suit=suit;
		this.num=num;
	}
	
	public void print() {
		System.out.print("������");
		for(int i =0;i<width;i++) {
			System.out.print('��');
		}
		System.out.println("������");
		System.out.printf("�� %c%2d",suits[suit], num);
		for(int i =0;i<width;i++) {
			System.out.print(' ');
		}
		System.out.print("��\n");
		System.out.print("������");
		for(int i =0;i<width;i++) {
			System.out.print('��');
		}
		System.out.println("������");
	}
}


// �������� : static �ڿ��� ������ Ŭ������ �ϳ� �����غ�����


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
		System.out.println("======������ Ȯ���� ���� : "+ Face.skin_color+"======");
	}
	
	public void print() {
		
		System.out.printf("####%s������ �� ����####\n", skin_color);
		System.out.println("����� ���� ���� : "+eye_count);
		System.out.println("����� ���� ���� : "+mouth_count);
		System.out.println("����� ���� �� : "+eye_color);
		System.out.println("����� �Լ� ��� : "+lip_shape);
		System.out.println("����� �Ǻλ� : "+skin_color);
		System.out.println("����� �Ӹ��� : "+hair_color);
	}
}

class SolidR4 {
	// Ŭ���� ���� , ���� ����
	static int price =8000;
	static int drift = 90;
	static int acc = 49;
	static int cornering = 556;
	static int boosttime = 440;
	static int boostcharge = 200;
	static String category = "���ǵ�īƮ / �Ϲ�";
	static String description = "�ָ��� �ø����� �������� ���̽��� �ٵ��Դϴ�. G3���� ����ȭ�� �ٵ������ R4�� �̸��� ū ��ȭ�� �ϰ� �˴ϴ�.";
	
	
	
	static String[] colorName = {"������", "�����", "�ʷϻ�", "�Ķ���", "������", "���", "��ũ��"	};
	
	//�ν��Ͻ� ����
	String enginePatch;
	String kit;
	String handle;
	String wheel;
	String owner;
	int paint;
	
}











