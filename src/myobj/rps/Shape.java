package myobj.rps;

public class Shape {

	final public static Shape ROCK = new Shape(0);
	final public static Shape SCISSORS = new Shape(1);
	final public static Shape PAPER = new Shape(2);
//	final public static int ROCK = 0;
//	final public static int SCISSORS = 1;
//	final public static int PAPER = 2;
//	
	final private static Shape[] shapes = {ROCK,SCISSORS,PAPER};
	final private static String[] names = {"����","����","��"};
	
	private int shape;
	
	
	private Shape(int shape) { // �����ڸ� �����̺����� ���Ƴ��� ������ �ٸ� ��Ű������ �ν��Ͻ� ������ new�� ���� ����
		this.shape = shape;
	}
	
	public static Shape random() { // rock scissors paper�� ����ƽ �����̹Ƿ� �޼��嵵 ����ƽ
		return shapes[(int)(Math.random()*shapes.length)];
	}
	
	/**
	 * 
		 ������ �̱�� 1, �������� �̱�� -1 ���� 0�� �����մϴ�.
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue();
		int right = b.getValue();
		
		// ���� 0, ���� 1, �� 2
		if(left==right) {
			return 0;
		}
		
		if((left+1) %3 ==right ) { // %3�� ������ ���ڱ��϶� rght�� ���ƾ��ϹǷ�
			return 1;
			
		}
		else return -1;
	}
	
	public int getValue() {
		return shape;
	}
	
	public String getName() {
		return names[shape];
	}
	
	@Override
	public String toString() {
	
		return getName();
	}
}
