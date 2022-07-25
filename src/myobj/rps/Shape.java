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
	final private static String[] names = {"바위","가위","보"};
	
	private int shape;
	
	
	private Shape(int shape) { // 생성자를 프라이빗으로 막아놨기 때문에 다른 패키지에서 인스턴스 생성시 new를 쓰지 못함
		this.shape = shape;
	}
	
	public static Shape random() { // rock scissors paper가 스태틱 변수이므로 메서드도 스태틱
		return shapes[(int)(Math.random()*shapes.length)];
	}
	
	/**
	 * 
		 왼쪽이 이기면 1, 오른쪽이 이기면 -1 비기면 0을 리턴합니다.
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue();
		int right = b.getValue();
		
		// 바위 0, 가위 1, 보 2
		if(left==right) {
			return 0;
		}
		
		if((left+1) %3 ==right ) { // %3은 왼쪽이 보자기일때 rght와 같아야하므로
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
