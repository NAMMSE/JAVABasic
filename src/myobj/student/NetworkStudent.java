package myobj.student;

public class NetworkStudent extends Student{

	int kor;
	int eng;
	int linux;
	int net;
	int ccna;
	
	public final static String GROUP_NAME = "네트워크";
	public final static int SUBJECT_SIZE = 5;
	
public	NetworkStudent() {
	kor = (int)(Math.random()*101);
	eng = (int)(Math.random()*101);
	linux = (int)(Math.random()*101);
	net = (int)(Math.random()*101);
	ccna = (int)(Math.random()*101);
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
				+ "LINUX\t: %d\n"
				+ "NET\t: %d\n"
				+ "CCNA\t: %d\n",GROUP_NAME,name,stuNum, kor, eng, linux, net, ccna);
		
	}
	@Override
	public int sum() {
	
		return kor + eng + linux + net + ccna;
	}
	
}
