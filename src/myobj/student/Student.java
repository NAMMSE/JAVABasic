package myobj.student;


abstract public class Student implements Average, GradeCard{ // abstract Ŭ������ �������̽� Ŭ������ implements�ϸ� �������̽� �޼��� ���Ǹ� �ڽ�Ŭ�������� �̷�� �ִ�

	
	
	//abstract public void printGradeCard();
	
	private static String[] firstName = {"����", "��ȯ","����","����","����","��ȣ","����","ȿ��","ȣ��","����","����","����","����","����"
			,"����","����","����","����"};
	private static String[] lastName = {"��","��","��","��","��","��","��","��","��","ȫ"};
	
	private static int currStuNum = 1000; // �й�
	
	protected String name;
	protected int stuNum;
	
	protected Student() {// public �ƴϰ� protected�� �����ڸ� ����� �ٸ���Ű������ �����������ϰ� �� Ŭ������ �ڽ�Ŭ���������� ������ �� �ִ�
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
