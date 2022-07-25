package myobj.student;

public class ProgrammingStudent extends Student{

	private int kor;
	private int eng;
	private int math;
	private int pl;
	private int ds;
	private int os;
	
	private final static String GROUP_NAME = "프로그래밍";
	private final static int SUBJECT_SIZE = 6;
	
	public ProgrammingStudent() {
		//super();
		kor = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		math = (int)(Math.random()*101);
		pl = (int)(Math.random()*101);
		ds = (int)(Math.random()*101);
		os = (int)(Math.random()*101);
	}
	
	@Override
	public int sum() {
		
		return kor+eng+math+pl+os+ds;
	}
	
	@Override
	public double avg() {
		return sum()/(double)SUBJECT_SIZE;
	}

	@Override
	public void printGradeCard() {
		System.out.printf("[%s반]\n"
				+ "%s (%d)\n"
				+ "KOR\t: %d\n"
				+ "ENG\t: %d\n"
				+ "MATH\t: %d\n"
				+ "P.L\t: %d\n"
				+ "D.S\t: %d\n"
				+ "O.S\t: %d\n",GROUP_NAME,name,stuNum, kor, eng, math, pl, ds, os);
		
	}
	
	
}
