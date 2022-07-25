package myobj.student;

public class MachinelearningStudent extends Student{

	int kor;
	int eng;
	int math;
	int stastis;
	int pl;
	
	public final static String GROUP_NAME = "¸Ó½Å·¯´×";
	public final static int SUBJECT_SIZE = 5;
	
	public MachinelearningStudent() {
		kor = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		math = (int)(Math.random()*101);
		stastis = (int)(Math.random()*101);
		pl = (int)(Math.random()*101);
	}
	
	
	@Override
	public double avg() {

		return sum()/(double)SUBJECT_SIZE;
	}
	@Override
	public void printGradeCard() {
		System.out.printf("[%s¹Ý]\n"
				+ "%s (%d)\n"
				+ "KOR\t: %d\n"
				+ "ENG\t: %d\n"
				+ "MATH\t: %d\n"
				+ "STASTIS\t: %d\n"
				+ "P.L\t: %d\n" ,GROUP_NAME,name,stuNum, kor, eng, math, stastis, pl);
		
	}
	@Override
	public int sum() {
		
		return kor + eng + math + stastis + pl;
	}
}
