package myobj.student;


abstract public class Student implements Average, GradeCard{ // abstract 클래스가 인터페이스 클래스를 implements하면 인터페이스 메서드 정의를 자식클래스한테 미룰수 있다

	
	
	//abstract public void printGradeCard();
	
	private static String[] firstName = {"태현", "규환","도현","은희","경태","민호","성훈","효정","호민","진우","인택","승필","수민","영욱"
			,"현지","몽운","유진","준혁"};
	private static String[] lastName = {"고","김","강","권","박","성","유","조","정","홍"};
	
	private static int currStuNum = 1000; // 학번
	
	protected String name;
	protected int stuNum;
	
	protected Student() {// public 아니고 protected로 생성자를 만들면 다른패키지에선 접근하지못하고 이 클래스의 자식클래스에서만 접근할 수 있다
		name = getRanName();
		stuNum = currStuNum++;
	}
	
	@Override
	public String toString() {
		
		return name + "[" + stuNum + "]";
	}
	
	public static String getRanName() {
		return lastName[(int)(Math.random()*lastName.length)]+firstName[(int)(Math.random()*firstName.length)];
	}
	
	
	
}
